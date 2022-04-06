package com.homework.lab6.services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Register", value = "/Register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name_user = request.getParameter("name_user");
        String fullname = request.getParameter("fullname");
        System.out.println(fullname);
        int age = Integer.parseInt(request.getParameter("age"));
        String password = request.getParameter("password");
        if(UserService.getInstance().rigister(fullname, name_user, password, age)){
            response.sendRedirect("/lab6/login.jsp");
        }else{
            request.setAttribute("error", "Tài khoản đã  tồn tại, vui lòng thử với một tên mới");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}
