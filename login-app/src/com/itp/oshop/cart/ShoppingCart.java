package com.itp.oshop.cart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.itp.oshop.model.CartProduct;

public class ShoppingCart {

	private List<CartProduct> products = new LinkedList<>();

	public void addProduct(CartProduct prod) {
		products.add(prod);
	}

	public void remove(int pid) {
		products.removeIf(p -> p.getPid() == pid);
	}

	public Iterator<CartProduct> listProducts() {
		return products.listIterator();
	}
	
	public List<CartProduct> getProductsFromCart() {
		return products;
	}
}
