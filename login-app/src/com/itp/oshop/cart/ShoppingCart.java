package com.itp.oshop.cart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.itp.oshop.model.CartProduct;

public class ShoppingCart {

	private List<CartProduct> products = new LinkedList<>();

	public void addProduct(CartProduct prod) {

		boolean found = false;
		Iterator<CartProduct> itr = listProducts();
		while (itr.hasNext()) {
			CartProduct product = itr.next();
			if (product.getPid() == prod.getPid()) {
				found = true;
				product.setQty(product.getQty() + 1);
			}
		}
		if (!found)
			products.add(prod);
	}

	public void remove(int pid) {
		//Find out product by pid + decrement its qty. 
		products.removeIf(p -> p.getPid() == pid);
	}

	public Iterator<CartProduct> listProducts() {
		return products.listIterator();
	}

	public List<CartProduct> getProductsFromCart() {
		return products;
	}
}
