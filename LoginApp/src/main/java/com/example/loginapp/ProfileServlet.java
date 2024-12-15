package com.example.loginapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("link.html").include(req,resp);
        Cookie[] ck = req.getCookies();
        if (ck!= null) {
            String name= ck[0].getValue();
            if (!name.equals("")||name!=null){
                out.println("<br>Welcome to the profile</br>");
                out.println("<br>Welcome,"+name);
            }else {
                out.println("Please Login first");
                req.getRequestDispatcher("login.html").include(req,resp);
            }

        }
        out.close();
        
    }
}
