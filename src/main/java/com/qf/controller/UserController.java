package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.Impl.UserServiceImpl;
import com.qf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll")
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             UserService userService = new UserServiceImpl();
        List<User> users = userService.selectAll();
        for (User s:users
             ) {
            System.out.println(s);
        }
        req.setAttribute("list",users);
        req.getRequestDispatcher("select.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
