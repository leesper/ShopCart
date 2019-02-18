package imooc.homework;

public class GoodsInCart {
	private Goods goods;
	private int num;
	
	public GoodsInCart(Goods goods, int num) {
		super();
		this.goods = goods;
		this.num = num;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return String.format("商品名称：%s，商品价格：%.1f，商品描述：%s，数量：%d", 
				goods.getGoodsName(), goods.getPrice(), goods.getGoodsDesp(), num);
	}
	
}
