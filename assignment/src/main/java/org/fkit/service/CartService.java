package org.fkit.service;

import java.util.List;

import org.fkit.domain.Book;
import org.fkit.domain.Cart;

/**
 * Cart服务层接口
 * */
public interface CartService {
	
	List<Cart> getAll();
	Cart findCart(int book_id);
	Cart saveCart(int book_id);
	Cart addCart(int book_id);
	Cart reduceCart(int book_id);
	Cart increaseCart(int book_id);
	Cart removeCart(int book_id);
	void clearCart();
	
}
