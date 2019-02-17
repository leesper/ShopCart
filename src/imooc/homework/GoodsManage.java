package imooc.homework;

import java.util.HashSet;
import java.util.Set;

public class GoodsManage {
	private Set<Goods> goodsSet;
	
	public GoodsManage() {
		goodsSet = new HashSet<>();
	}

	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}

	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}
	
	public void importGoods() {}
	
	public void displayAllGoods() {}
}
