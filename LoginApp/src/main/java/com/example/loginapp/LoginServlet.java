package com.example.loginapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("html/text");
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("link.html").include(req,resp);
        String name= req.getParameter("name");
        String password  =req.getParameter("password");
       if (password.equals("12345")){
           out.println("You are successfully logged in...");
           out.println("<br> Welcome"+ name);
           Cookie ck = new Cookie("name",name);
           resp.addCookie(ck);
       }
       else {
           out.println("Sorry, Username or Password Error!!");
           req.getRequestDispatcher("login.html").include(req,resp);
       }
       out.close();
    }
}
