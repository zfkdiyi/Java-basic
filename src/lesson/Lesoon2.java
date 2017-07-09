package lesson;
import java.util.Scanner;
public class Lesoon2 {

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
			System.out.println("\n\t\t\t\t我是菜单");
			for(i=0;i<=30;i++)
				System.out.print("* ");
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
