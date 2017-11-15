package com.nec.estore.backend.impl;

import java.util.List;
import java.util.Set;

import com.nec.estore.backend.dao.CartDao;
import com.nec.estore.backend.model.Cart;
import com.nec.estore.backend.model.CartItem;



public class CartImpl implements CartDao{
	private static Cart cart=new Cart();
	public void addItem(CartItem item) {	
		cart.getItems().add(item);
	}

	public void deleteItem(int id) {
		cart.getItems().remove(getItemById(id));		
	}	

	public List<CartItem> getAllItems() {
		return cart.getItems();
	}

	public CartItem getItemById(int id) {
		List<CartItem> items=cart.getItems();
		CartItem item=null;
		for(CartItem c : items){
			if(c.getId()==id)
				item=c;			
		}
		return item;
	}

}
