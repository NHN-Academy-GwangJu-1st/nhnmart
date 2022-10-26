package com.nhnacademy.nhnmart.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "logoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        if (Objects.nonNull(session)) {
            session.invalidate();
//            resp.sendRedirect("/index.jsp");
            req.setAttribute("view","redirect:/index.jsp");
        } else {
//            resp.sendRedirect("/login");
            req.setAttribute("view","redirect:/login.jsp");
        }
    }
}
