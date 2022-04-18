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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CalculateLikesController", value = "/calcular-avaliacoes")
public class CalculateLikesController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Object product = request.getAttribute("flash.product");
        ProductService productService = new ProductService();

        if (product == null) {
            String id = request.getParameter("id");
            product = productService.getById(Long.valueOf(id));
        }

        ReviewService reviewService = new ReviewService();

        long likes = reviewService.countByTwoProperties("product", product, "likes", "gostei do produto");
        long dislikes = reviewService.countByTwoProperties("product", product, "likes", "nao gostei do produto");

        List<Review> reviews = reviewService.listByForeignOrObjectProperty("product", product);
        ArrayList<ReviewDTO> reviewsDTO = new ArrayList<>();

        for (Review review : reviews) {
            ReviewDTO reviewDTO = ReviewMapper.toDTO(review);
            reviewsDTO.add((reviewDTO));
        }

        request.setAttribute("flash.product", product);
        request.setAttribute("flash.reviews", reviewsDTO);
        request.setAttribute("flash.likes", (likes + " positivos / " + dislikes + " negativas"));
        response.sendRedirect("listar-produto");
    }
}
