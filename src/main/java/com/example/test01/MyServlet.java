package com.example.test01;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/employee")
public class MyServlet extends HttpServlet {
    @Inject
    //this bean have a request scope and belongs only one request
    private Employee employee;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        employee.setName(req.getParameter("name"));
        // employee automatic follow in employeeJsp
        req.getRequestDispatcher("/employeeJsp.jsp").forward(req, resp);
    }
}
