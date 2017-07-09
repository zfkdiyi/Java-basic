package practise;

import java.util.Scanner;

public class Promise {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("刘珊珊考了多少分？");
		int score=input.nextInt();
		
		switch(score/10){
		case(10):
			System.out.println("父亲买一辆车");
			break;
		case(9):
			System.out.println("母亲买一部笔记本电脑");
		    break;
		case(8):
		case(7):
		case(6):   
			System.out.println("母亲买一部手机");
		    break;
	    default:
			System.out.println("没有礼物");
			break;
		}

	}

}
