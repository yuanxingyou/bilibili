package servelet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/ser4")
public class servlet4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        //req.setCharacterEncoding("UTF-8");
        String method = req.getMethod();
        System.out.println("method"+method);
        resp.getWriter().println(method);
        String uname = req.getParameter("uname");
        String una = new String(uname.getBytes("ISO-8859-1"),"UTF-8");
        resp.getWriter().println(uname);
        System.out.println(uname);
        System.out.println(una);
    }
}
