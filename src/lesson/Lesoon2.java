package lesson;
import java.util.Scanner;
public class Lesoon2 {

	public static void main(String[] args) {
		int i,num;
		
		System.out.println("\n\t\t\t��ӭʹ���������ع������ϵͳ");
		System.out.println("\n\t\t\t\t1.��¼ϵͳ");
		System.out.println("\n\t\t\t\t2.�˳�\n");
		for(i=0;i<=30;i++)
			System.out.print("* ");
		Scanner input=new Scanner(System.in);
		System.out.println("\n��ѡ����������1��2��");
		num=input.nextInt();
		switch(num){
		case 1:
			System.out.println("\n\t\t\t��ӭʹ���������ع������ϵͳ");
			for(i=0;i<=30;i++)
				System.out.print("* ");
			System.out.println("\n\t\t\t\t���ǲ˵�");
			for(i=0;i<=30;i++)
				System.out.print("* ");
			break;
		case 2:
			System.out.println("\nлл���ʹ��!");
			break;
		default :
			System.out.println("\n�������");
			break;
		}

	}

}
