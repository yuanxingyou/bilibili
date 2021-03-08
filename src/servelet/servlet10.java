package servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser10")
public class servlet10 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        Cookie[] cookies = req.getCookies();
        if(cookies != null && cookies.length>0){
            for(Cookie cookie:cookies){
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println("name:"+name+"     "+"value:"+value);
            }

        }
    }
}
