package com.product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	private static List<Product> products = new ArrayList<Product>();
	static {
		products.add(new Product("TV","Electronics"));
		products.add(new Product("Laptop","Electronics"));
		products.add(new Product("Telephone","Electronics"));
		products.add(new Product("Sofa","Furniture"));
		products.add(new Product("Bed","Furniture"));
		products.add(new Product("Chair","Furniture"));
		products.add(new Product("Refrigerator","Great appliances"));
		products.add(new Product("Washing machine","Great appliances"));
		products.add(new Product("Dishwasher","Great appliances"));
	}

	public List<Product> retrieveProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void deleteProduct(Product product) {
		products.remove(product);
	}

}