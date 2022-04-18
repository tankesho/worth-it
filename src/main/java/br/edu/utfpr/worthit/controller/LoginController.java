package br.edu.utfpr.worthit.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import br.edu.utfpr.worthit.util.Constants;

@WebServlet(name = "LoginController", value = "/fazer-login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String status = (String) request.getSession(true).getAttribute(Constants.STATUS);
        if(status == null)
            status = "deslogado";

        if (status.equals("deslogado"))
            status = "logado";
        else
            status = "deslogado";

        request.getSession(true).setAttribute(Constants.STATUS, status);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
