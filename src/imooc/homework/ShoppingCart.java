package imooc.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		if (gm.getGoodsSet().isEmpty()) {
			System.out.println("还没有商品，记得导入商品信息呦！");
			return;
		}
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		gm.displayAllGoods();
		System.out.println("请输入要添加的商品编号：");
		String goodsId = s.next();
		System.out.println("请输入要添加的商品数量：");
		int goodsNum = s.nextInt();
		for (Goods goods : gm.getGoodsSet()) {
			if (goods.getGoodsId().equals(goodsId)) {
				shoppingCart.put(goodsId, new GoodsInCart(goods, goodsNum));
				break;
			}
		}
	}
	
	public void updateNumInCart() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("请输入要修改的商品编号：");
		String goodsId = s.next();
		System.out.println("请输入新的商品数量：");
		int goodsNum = s.nextInt();
		for (GoodsInCart goodsInCart : getShoppingCart().values()) {
			if (goodsInCart.getGoods().getGoodsId().equals(goodsId)) {
				if (goodsNum > 0) { 
					goodsInCart.setNum(goodsNum);
				} else {
					System.out.println("因为商品数量为0，该商品已经从购物车移除！");
					getShoppingCart().remove(goodsId);
					break;
				}
			}
		}
	}
	
	public void displayAllInCart() {
		if (getShoppingCart().isEmpty()) {
			System.out.println("购物车是空的呦，赶快装满吧～");
			return;
		}
		
		for (GoodsInCart goodsInCart : getShoppingCart().values()) {
			System.out.println(goodsInCart);
		}
	}
	
	public void settleAccounts() {
		double total = 0.0;
		for (GoodsInCart goodsInCart : getShoppingCart().values()) {
			total += goodsInCart.getNum() * goodsInCart.getGoods().getPrice();
		}
		System.out.println("商品的总价为：" + total);
		displayAllInCart();
		// all goods in shopping cart settled
		getShoppingCart().clear();
	}
}
