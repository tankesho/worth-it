package br.edu.utfpr.worthit.controller;

import br.edu.utfpr.worthit.model.dao.AbstractDAO;
import br.edu.utfpr.worthit.model.domain.Product;
import br.edu.utfpr.worthit.model.domain.Review;
import br.edu.utfpr.worthit.service.ProductService;
import br.edu.utfpr.worthit.service.ReviewService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ReviewController", value = "/avaliar-produto")
public class ReviewController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/review-product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        request.setAttribute("flash.id", id);
        String option = request.getParameter("option");
        request.setAttribute("flash.option", option);
        System.out.println(id);
        response.sendRedirect("avaliar-produto");
    }
}
