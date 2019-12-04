package com.examples.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.examples.model.CartProduct;
import com.examples.model.ProdCategory;

public class ShoppingCartService implements CartService {

	private Map<ProdCategory, List<CartProduct>> cart = new ConcurrentHashMap<>();

	@Override
	public void addProduct(ProdCategory category, CartProduct prod) {
		List<CartProduct> products = cart.get(category);
		if (products == null)
			products = new LinkedList<>();

		// Increase the qty if same product is added once again.
		for (CartProduct p : products) {
			if (p.getProdId() == prod.getProdId()) {
				p.setQty(p.getQty() + 1);
				break;
			}
		}

		products.add(prod);
		cart.put(category, products);
	}

	@Override
	public void deleteProduct(int prodId) {
		Set<ProdCategory> categories = cart.keySet();
		for (ProdCategory category : categories) {
			List<CartProduct> products = cart.get(category);
			Iterator<CartProduct> itr = products.iterator();
			while (itr.hasNext()) {
				CartProduct p = itr.next();
				if (p.getProdId() == prodId) {
					itr.remove();
				}
			}
		}

	}

	@Override
	public List<CartProduct> getProductsByCategory(ProdCategory prodCategory) {
		return cart.get(prodCategory);
	}

	@Override
	public Map<ProdCategory, List<CartProduct>> getCart() {
		return cart;
	}

}
