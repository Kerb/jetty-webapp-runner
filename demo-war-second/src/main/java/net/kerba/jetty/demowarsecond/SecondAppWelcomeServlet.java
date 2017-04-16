package net.kerba.jetty.demowarsecond;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @user: kerb
 * @created: 16/04/2017.
 */
@WebServlet(name = "welcomeServlet", urlPatterns = "/app/welcome-servlet-2/*")
public class SecondAppWelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello from second app servlet: " + getClass().getName());
    }
}
