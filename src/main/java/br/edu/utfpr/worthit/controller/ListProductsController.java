package br.edu.utfpr.worthit.controller;

import br.edu.utfpr.worthit.model.domain.Review;
import br.edu.utfpr.worthit.model.dto.ReviewDTO;
import br.edu.utfpr.worthit.model.mapper.ProductMapper;
import br.edu.utfpr.worthit.model.mapper.ReviewMapper;
import br.edu.utfpr.worthit.service.ProductService;
import br.edu.utfpr.worthit.model.dto.ProductDTO;
import br.edu.utfpr.worthit.model.domain.Product;
import br.edu.utfpr.worthit.service.ReviewService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "ListProductsController", value = "/listar-produtos")
public class ListProductsController extends HttpServlet {
    private String searchAll = "todos";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("searchAll", searchAll);

        request.getRequestDispatcher("/WEB-INF/view/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String category = request.getParameter("category");

        ProductService productService = new ProductService();
        ReviewService reviewService = new ReviewService();

        List<Product> products;

        if (name != null)
            products = productService.listByProperty("name", name);
        else if (!Objects.equals(category, "") && !category.equals("todos"))
            products = productService.listByProperty("category", category);
        else
            products = productService.findAll();

        ArrayList<String> likelist = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            long likes = reviewService.countByTwoProperties("product", products.get(i), "likes", "gostei do produto");
            long dislikes = reviewService.countByTwoProperties("product", products.get(i), "likes", "nao gostei do produto");

            likelist.add(likes + " positivos / " + dislikes + " negativas");
        }

        request.setAttribute("flash.name", name);
        request.setAttribute("flash.category", category);
        request.setAttribute("flash.products", products);
        request.setAttribute("flash.likes", likelist);
        response.sendRedirect("listar-produtos");
    }


}
