package servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/ser11")
public class servlet11 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        Cookie cookie = new Cookie("yxy","xy");
        cookie.setMaxAge(30);
        HttpSession session = req.getSession();
        //System.out.println(session.getId());
        session.setAttribute("yxy","ss");
        System.out.println("setmaxintactive:"+"   "+session.getMaxInactiveInterval());
        //session.setMaxInactiveInterval(5);
        //session.invalidate();
    }
}
