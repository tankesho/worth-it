package br.edu.utfpr.worthit.controller;

import br.edu.utfpr.worthit.model.domain.Product;
import br.edu.utfpr.worthit.model.domain.Review;
import br.edu.utfpr.worthit.service.ProductService;
import br.edu.utfpr.worthit.service.ReviewService;
import br.edu.utfpr.worthit.util.Constants;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterReviewController", value = "/cadastrar-avaliar-produto")
public class RegisterReviewController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/view/register-review-product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("user-name");
        String productName = request.getParameter("product-name");
        String category = request.getParameter("category");
        String likes = request.getParameter("likes");
        String reviewContent = request.getParameter("review");
        String option = request.getParameter("option");

        ProductService productService = new ProductService();
        ReviewService reviewService = new ReviewService();

        Product product;

        if (option == null)
        {
            product = new Product(productName, category);
            productService.save(product);
        } else {
            String id = request.getParameter("id");
            product = productService.getById(Long.valueOf(id));
        }

        Review review = new Review(userName, likes, reviewContent, product);
        reviewService.save(review);

        Integer total = (Integer) getServletContext().getAttribute(Constants.TOTAL_PRODUCTS);
        if(total == null){
            total = 0;
        }
        total++;
        getServletContext().setAttribute(Constants.TOTAL_PRODUCTS, total);

        Cookie cookie = new Cookie("productName", productName);
        cookie.setMaxAge(60 * 60 * 24);

        Cookie cookie2 = new Cookie("userName", userName);
        cookie2.setMaxAge(-1);

        response.addCookie(cookie);
        response.addCookie(cookie2);

        request.setAttribute("flash.product", product);
        request.getRequestDispatcher("/calcular-avaliacoes").forward(request, response);
    }
}
