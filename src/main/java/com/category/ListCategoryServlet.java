package com.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-categories.do")
public class ListCategoryServlet extends HttpServlet {

	private CategoryService categoryService = new CategoryService();

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("categories", categoryService.retrieveCategories());
		request.getRequestDispatcher("/WEB-INF/views/list-categories.jsp").forward(
			request, response);
	}


	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {


		response.sendRedirect("/list-products.do");

	}
}