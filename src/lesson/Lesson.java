package lesson;
import java.util.Scanner;
public class Lesson {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ���ĺ���");
		int num=input.nextInt();
		
		switch(num){
		case 1:
			System.out.print("���ڲ���ְֵĵ绰\n");
			
			break;
		case 2:
			System.out.println("���ڲ�������ĵ绰");
		
			break;
		case 3:
			System.out.println("���ڲ���үү�ĵ绰");
		case 4:
			System.out.println("���ڲ������̵ĵ绰");
		default:
			System.out.println("��������ȷ�ĺ��룡");
		}
		
		

	}

}
