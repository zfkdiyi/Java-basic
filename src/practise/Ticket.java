package practise;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您出行的月份:1——12");
		int month=input.nextInt();
		switch(month){
		case(4):
		case(5):
		case(6):
		case(7):
		case(8):
		case(9):
		case(10):
			System.out.println("请问您选择头等舱还是经济舱？1/2");
			int a=input.nextInt();
			if(a==1){
				double price=5000*0.9;
				System.out.println("您的机票价格是 "+price);
			}
			else {
				double price=5000*0.8;
				System.out.println("您的机票价格是 "+price);
			}break;
		
		default: 
			System.out.println("请问您选择头等舱还是经济舱？1/2");
			int b=input.nextInt();
			if(b==1){
				double price=5000*0.5;
				System.out.println("您的机票价格是 "+price);
			}
			else {
				double price=5000*0.4;
				System.out.println("您的机票价格是 "+price);
			}break;
		}

	}

}
