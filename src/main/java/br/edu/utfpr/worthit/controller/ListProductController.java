package br.edu.utfpr.worthit.controller;

import br.edu.utfpr.worthit.model.domain.Product;
import br.edu.utfpr.worthit.model.domain.Review;
import br.edu.utfpr.worthit.model.dto.ReviewDTO;
import br.edu.utfpr.worthit.model.mapper.ReviewMapper;
import br.edu.utfpr.worthit.service.ProductService;
import br.edu.utfpr.worthit.service.ReviewService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListProductController", value = "/listar-produto")
public class ListProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
