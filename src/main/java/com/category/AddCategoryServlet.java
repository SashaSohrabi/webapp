package com.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/add-category.do")
public class AddCategoryServlet extends HttpServlet {

	private CategoryService categoryService = new CategoryService();

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/add-category.jsp").forward(
			request, response);
	}

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {
		String newCategory = request.getParameter("category");
		categoryService.addCategory(new Category(newCategory));
		response.sendRedirect("/list-categories.do");
	}
}
