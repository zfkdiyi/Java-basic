package practise;
import java.util.Scanner;
public class Calculater {

	public static void main(String[] args) {
		int x=0,y=0;
		double a=0,b=0;
		Scanner input=new Scanner(System.in);
		System.out.print("�������һ����");
		
		if(input.hasNextDouble()==true) {
			x=0;
			a=input.nextDouble();
		}else x=1;
		
		
	
		
		System.out.print("������ڶ�����");
		if(input.hasNextDouble()==true) {
			y=0;
			b=input.nextDouble();
		}else y=1;
		
		if(x==0&&y==0){
			System.out.print("�������������");
			char opr=input.next().charAt(0);
			double result=0.0;
			boolean i=true;
			boolean j=true;
			
			switch(opr){
			case('+'):
				result=a+b;break;
			case('-'):
				result=a-b;break;
			case('*'):
				result=a*b;break;
			case('/'):
			case('��'):
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
				
			default:
				j=false;
			
			
			}
			if(j){
				if(i){
					System.out.printf("%.2f %c %.2f = %.2f",a,opr,b,result);
				}else {
					System.out.println("����/ȡ��������Ϊ0��");
				}
			}else {
				System.out.println("������Ų���ȷ��");
			}
		}else {
			System.out.println("��������ȷ�����֣�");
		}

	}

}
