package imooc.homework;

import java.util.Scanner;

public class TestDemo {
	private static GoodsManage goodsManage = new GoodsManage();
	private static ShoppingCart shoppingCart = new ShoppingCart();
	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		while (true) {
			System.out.println("********************");
			System.out.println("** 主菜单 **");
			System.out.println("1--商品管理");
			System.out.println("2--购物车");
			System.out.println("0--退出");
			System.out.println("********************");
			System.out.println("请输入对应的数字进行操作：");
			int mainCommand = s.nextInt();
			switch (mainCommand) {
			case 1:
				manageMenu();
				break;
			case 2:
				shoppingCartMenu();
				break;
			case 0:
				return;
			default:
				System.out.println("请输入正确的数字");	
			}
		}
		
	}
	
	public static void manageMenu() {
		while (true) {
			System.out.println("********************");
			System.out.println("** 商品管理 **");
			System.out.println("1--商品信息导入");
			System.out.println("2--显示所有商品信息");
			System.out.println("9--返回上一级菜单");
			System.out.println("********************");
			System.out.println("请输入对应的数字对商品进行管理：");
			int manageCommand = s.nextInt();
			switch (manageCommand) {
			case 1:
				goodsManage.importGoods();
				break;
			case 2:
				System.out.println("显示所有商品信息");		
				goodsManage.displayAllGoods();
				break;
			case 9:
				return;
			default:
				System.out.println("请输入正确的数字");
			}
		}
	}
	
	public static void shoppingCartMenu() {
		while (true) {
			System.out.println("********************");
			System.out.println("** 购物车管理 **");
			System.out.println("1--添加商品到购物车");
			System.out.println("2--修改购物车中的商品数量");
			System.out.println("3--显示购物车中的所有商品信息");
			System.out.println("4--结算");
			System.out.println("9--返回上一级菜单");
			System.out.println("********************");
			System.out.println("请输入对应的数字对购物车进行管理：");
			
			int shoppingCartCommand = s.nextInt();
			switch (shoppingCartCommand) {
			case 1:
				System.out.println("添加商品到购物车");
				shoppingCart.addGoodsToCart(goodsManage);
				break;
			case 2:
				System.out.println("修改购物车中的商品数量");
				shoppingCart.updateNumInCart();
				break;
			case 3:
				System.out.println("显示购物车中的所有商品信息");
				shoppingCart.displayAllInCart();
				break;
			case 4:
				System.out.println("结算：");
				shoppingCart.settleAccounts();
				break;
			case 9:
				return;
			default:
				System.out.println("请输入正确的数字");
			}
		}
		
	}
}
