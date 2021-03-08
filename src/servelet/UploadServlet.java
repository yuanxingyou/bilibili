package servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
@WebServlet("/UploadServlet")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        System.out.println("文件上传");
        req.setCharacterEncoding("utf-8");
        Part part = req.getPart("file");
        //String filename = part.getSubmittedName();
        String cd = part.getHeader("Content-Disposition");
//截取不同类型的文件需要自行判断
        String filename = cd.substring(cd.lastIndexOf("=")+2, cd.length()-1);
        System.out.println("filename"+filename);
        resp.getWriter().write(filename);

        String filePath = req.getServletContext().getRealPath("/");
        System.out.println(filePath);
        part.write(filePath+"/"+filename);

    }
}
