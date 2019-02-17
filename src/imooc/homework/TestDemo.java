package imooc.homework;

import java.util.Scanner;

public class TestDemo {
	private static GoodsManage goodsManage = new GoodsManage();
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		mainMenu(s);
	}

	public static void mainMenu(Scanner s) {
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
				manageMenu(s);
				break;
			case 2:
				break;
			case 0:
				return;
			default:
				System.out.println("请输入正确的数字");	
			}
		}
		
	}
	
	public static void manageMenu(Scanner s) {
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
				goodsManage.displayAllGoods();
				break;
			case 9:
				return;
			default:
				System.out.println("请输入正确的数字");
			}
		}
	}
	
	public static void shoppingCartMenu(Scanner s) {
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
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 9:
				return;
			default:
				System.out.println("请输入正确的数字");
			}
		}
		
		
	}
}
