package imooc.homework;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<String, GoodsInCart> shoppingCart;
	
	public ShoppingCart() {
		shoppingCart = new HashMap<>();
	}

	public Map<String, GoodsInCart> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	public void addGoodsToCart(GoodsManage gm) {
		
	}
	
	public void updateNumInCart() {
		
	}
	
	public void displayAllInCart() {
		
	}
	
	public void settleAccounts() {
		
	}
}
