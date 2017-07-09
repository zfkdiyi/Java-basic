package lesson;
import java.util.Scanner;
public class Lesson {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您要按的号码");
		int num=input.nextInt();
		
		switch(num){
		case 1:
			System.out.print("正在拨打爸爸的电话\n");
			
			break;
		case 2:
			System.out.println("正在拨打妈妈的电话");
		
			break;
		case 3:
			System.out.println("正在拨打爷爷的电话");
		case 4:
			System.out.println("正在拨打奶奶的电话");
		default:
			System.out.println("请输入正确的号码！");
		}
		
		

	}

}
