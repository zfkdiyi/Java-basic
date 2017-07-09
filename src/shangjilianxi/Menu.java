package shangjilianxi;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
int i,num;
		
		System.out.println("\n\t\t\t欢迎使用我行我素购物管理系统");
		System.out.println("\n\t\t\t\t1.登录系统");
		System.out.println("\n\t\t\t\t2.退出\n");
		for(i=0;i<=30;i++)
			System.out.print("* ");
		Scanner input=new Scanner(System.in);
		System.out.println("\n请选择，输入数字1或2：");
		num=input.nextInt();
		switch(num){
		case 1:
			System.out.println("\n\t\t\t欢迎使用我行我素购物管理系统");
			for(i=0;i<=30;i++)
				System.out.print("* ");
			System.out.println("\n\t\t\t\t1.客户信息管理");
			System.out.println("\n\t\t\t\t2.购物结算");
			System.out.println("\n\t\t\t\t3.真情回馈");
			System.out.println("\n\t\t\t\t4.注销");
			for(i=0;i<=30;i++)
				System.out.print("* ");
			System.out.println("\n请输入数字1/2/3/4：");
			int j=input.nextInt();
			switch(j){
			case 1:
				System.out.println("购物管理系统》》客户信息管理");
				System.out.println("1、显示所有客户信息");
				System.out.println("2、添加客户信息");
				System.out.println("3、修改客户信息");
				System.out.println("4、查询客户信息");
				break;
			case 3:
				System.out.println("购物管理系统》》真情回馈");
				System.out.println("1、幸运大抽奖");
				System.out.println("2、幸运抽奖");
				System.out.println("3、生日问候");
				break;
			default: 
				System.out.println("系统建设中");
				break;
				
			}
			break;
		case 2:
			System.out.println("\n谢谢你的使用!");
			break;
		default :
			System.out.println("\n输入错误！");
			break;
		}

	}

}
