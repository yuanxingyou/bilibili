package servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser9")
public class servlet9 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
        resp.setContentType("text/html;charset:UTF-8");
        Cookie cookie1 = new Cookie("name1","admin");
        cookie1.setMaxAge(60);
        resp.addCookie(cookie1);
        //req.setAttribute("name","yxy");
        Cookie cookie2 = new Cookie("name2","admin");
        cookie2.setMaxAge(30);
        resp.addCookie(cookie2);
    }
}
