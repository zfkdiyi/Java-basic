package shangjilianxi;
import java.util.Scanner;
public class Huangou {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double money=input.nextDouble();
		
		System.out.println("1、满50元 加2元换百事可乐1瓶");
		System.out.println("2、满100元 加3元换500ml可乐1瓶");
		System.out.println("3、满100元，加10元换5kg面粉");
		System.out.println("4、满200元，加10元换苏泊尔炒菜锅1个");
		System.out.println("5、满200元，加20元换欧莱雅爽肤水一瓶");
		System.out.println("0、不换购");
		System.out.print("请输入数字选择：");
		int num=input.nextInt();
		
		switch(num){
		case 1:
			if(money>=50){
				System.out.println("本次消费金额： "+(money+2));
				System.out.println("成功换购： 百事可乐1瓶");
			
			}else {
				System.out.println("本次消费金额： "+money);
				System.out.println("金额不足，无法换购");
			}break;
			
			
		case 2:
			if(money>=100){
				System.out.println("本次消费金额： "+(money+3));
				System.out.println("成功换购： 500ml可乐1瓶");
			}else if(money>=50){
				System.out.println("本次消费金额： "+money);
				System.out.println("无法换购指定要求赠品");
			
			}else {
				System.out.println("本次消费金额： "+money);
				System.out.println("金额不足，无法换购");
			}break;
		
		case 3:
			if(money>=100){
				System.out.println("本次消费金额： "+(money+10));
				System.out.println("成功换购： 5kg面粉");
			}else if(money>=50){
				System.out.println("本次消费金额： "+money);
				System.out.println("无法换购指定要求赠品");
			
			}else {
				System.out.println("本次消费金额： "+money);
				System.out.println("金额不足，无法换购");
			}break;
		case 4:
			if(money>=200){
				System.out.println("本次消费金额： "+(money+10));
				System.out.println("成功换购： 苏泊尔炒菜锅1个");
			}else if(money>=50){
				System.out.println("本次消费金额： "+money);
				System.out.println("无法换购指定要求赠品");
			
			}else {
				System.out.println("本次消费金额： "+money);
				System.out.println("金额不足，无法换购");
			}break;
		case 5:
			if(money>=200){
				System.out.println("本次消费金额： "+(money+20));
				System.out.println("成功换购： 欧莱雅爽肤水一瓶");
			}else if(money>=50){
				System.out.println("本次消费金额： "+money);
				System.out.println("无法换购指定要求赠品");
			
			}else {
				System.out.println("本次消费金额： "+money);
				System.out.println("金额不足，无法换购");
			}break;
				
		case 0:
			System.out.println("本次消费金额： "+money);
			System.out.println("没有换购商品");
				
				
		}

	}

}
