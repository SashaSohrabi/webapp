package com.product;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.category.CategoryService;

@WebServlet(urlPatterns = "/add-product.do")
public class AddProductServlet extends HttpServlet {

	private ProductService productService = new ProductService();

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-product.jsp").forward(
			request, response);
	}

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {
		String newProduct = request.getParameter("product");
		String category = request.getParameter("category");
		productService.addProduct(new Product(newProduct, category));
		response.sendRedirect("/list-products.do");

	}
}