package com.example.loginapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LogoutServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("html/text");
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("link.html").include(req,resp);
        Cookie ck = new Cookie("name","");
        ck.setMaxAge(0);
        resp.addCookie(ck);


        out.println("You are successfully logged out!!");
    }
}
