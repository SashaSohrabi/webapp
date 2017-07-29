package com.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-products.do")
public class ListProductServlet extends HttpServlet {

	private ProductService productService = new ProductService();

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("products", productService.retrieveProducts());
		request.getRequestDispatcher("/WEB-INF/views/list-products.jsp").forward(
			request, response);
	}
}