package com.homework.lab6.services;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        if(UserService.getInstance().checkLogin(userName, password)){
            System.out.println("Đăng nhập thành công");
            response.sendRedirect("/lab6/index.jsp");
        }else{
            System.out.println("Đăng nhập thất bại");
            request.setAttribute("error", "Check username or password cause its incorrect");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
