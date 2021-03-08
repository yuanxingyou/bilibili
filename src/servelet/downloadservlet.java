/*
* 代码实现文件下载
*
*
*
* */
package servelet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/downloadservlet")
public class downloadservlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String filename = req.getParameter("filename");
        if(filename == null|| "".equals(filename.trim())){
            resp.getWriter().write("请输入文件名");
        }
        String path = req.getServletContext().getRealPath("/");
        System.out.println(path);
        File file = new File(path+filename);
        if(file.exists()&& file.isFile()){
            //设置响应类型
            resp.setContentType("application/x-msdownload");
            //设置响应头
            resp.setHeader("Content-Disposition","attachment;filename"+filename);
            InputStream inputStream = new FileInputStream(file);
            ServletOutputStream out= resp.getOutputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            while((len = inputStream.read(bytes)) != -1){
                out.write(bytes,0,len);

            }
            out.close();
            inputStream.close();
        }else {
            //resp.setCharacterEncoding("utf-8");
            resp.getWriter().write("文件不存在");
            resp.getWriter().close();
        }

    }
}
