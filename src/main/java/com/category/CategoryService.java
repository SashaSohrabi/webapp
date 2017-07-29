package com.category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
	private static List<Category> categories = new ArrayList<Category>();
	static {
		categories.add(new Category("Electronics"));
		categories.add(new Category("Furniture"));
		categories.add(new Category("Great appliances"));

	}

	public List<Category> retrieveCategories() {
		return categories;
	}

	public void addCategory(Category category) {
		categories.add(category);
	}

	public void deleteCategory(Category category) {
		categories.remove(category);
	}

}