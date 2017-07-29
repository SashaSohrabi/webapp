package com.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete-category.do")
public class DeleteCategoryServlet extends HttpServlet {

	private CategoryService categoryService = new CategoryService();

	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		categoryService.deleteCategory(new Category(request.getParameter("category")));
		response.sendRedirect("/list-categories.do");
	}
}
