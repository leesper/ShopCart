package imooc.homework;

import java.util.HashSet;
import java.util.Iterator;
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
	
	public void importGoods() {
		System.out.println("商品信息导入");
		goodsSet.add(new Goods("goods001", "水杯", 56.0, "不锈钢水杯"));
		goodsSet.add(new Goods("goods002", "饮水机", 299.0, "带净化功能的饮水机"));
		goodsSet.add(new Goods("goods003", "笔记本电脑", 4999.0, "15寸笔记本电脑"));
		goodsSet.add(new Goods("goods004", "手机", 2300.0, "android手机"));
		System.out.println("导入成功！");
	}
	
	public void displayAllGoods() {
		System.out.println("所有商品信息为：");
		Iterator<Goods> it = goodsSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
