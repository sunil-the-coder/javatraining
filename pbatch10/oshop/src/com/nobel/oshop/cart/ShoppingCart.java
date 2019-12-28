package com.nobel.oshop.cart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.nobel.oshop.model.CartProduct;

public class ShoppingCart {

	private List<CartProduct> products = new LinkedList<CartProduct>();

	public void addProduct(CartProduct product) {
		boolean shouldBeAdded = true;
		for (CartProduct prod : products) {
			if (prod.getPid() == product.getPid()) {
				prod.setQty(prod.getQty() + 1);
				shouldBeAdded = false;
			}
		}
		if (shouldBeAdded)
			products.add(product);
	}

	public void delete(int prodId) {

		Iterator<CartProduct> itr = products.iterator();
		while (itr.hasNext()) {
			CartProduct prod = itr.next();
			if (prod.getPid() == prodId)
				itr.remove();
		}
	}

	public Iterator<CartProduct> listItr() {
		return products.iterator();
	}

	public int getTotal() {
		int total = 0;
		for (CartProduct prod : products) {
			total += prod.getQty() * prod.getPrice();
		}
		return total;
	}
}
