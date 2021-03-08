package servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
@WebServlet("/ser7")
public class servlet7 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        //乱码解决
        //字符输出流
        /*resp.setCharacterEncoding("UTF-8");
        resp.setHeader("content-type","text/html;charset:UTF-8");*/
        //同时设置编码
        resp.setContentType("text/html;charset:UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>你好</h1>");
    }
}
