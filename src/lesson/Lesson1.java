package lesson;
import java.util.Scanner;
public class Lesson1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个数");
		double a=input.nextDouble();
		
		System.out.print("请输入运算符号");
		char opr=input.next().charAt(0);
		
		System.out.print("请输入第二个数");
		double b=input.nextDouble();
		
		double result=0.0;
		boolean i=true;
		
		switch(opr){
		case('+'):
			result=a+b;break;
		case('-'):
			result=a-b;break;
		case('*'):
			result=a*b;break;
		case('/'):
		case('÷'):
			if(b!=0){
				result=a/b;
				i=true;
				break;
			}else {
				i=false;
			}
		case('%'):
			if(b!=0){
				result=a%b;
				i=true;
				break;
			}else {
				i=false;
			}
			
			
		
		
		}
		if(i){
			System.out.print(a+opr+b);
		}else {
			System.out.println("除数/取余数不能为0！");
		}

	}

}
