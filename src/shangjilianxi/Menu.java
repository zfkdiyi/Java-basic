package shangjilianxi;

import java.util.Scanner;

public class Menu {

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
			System.out.println("\n\t\t\t\t1.�ͻ���Ϣ����");
			System.out.println("\n\t\t\t\t2.�������");
			System.out.println("\n\t\t\t\t3.�������");
			System.out.println("\n\t\t\t\t4.ע��");
			for(i=0;i<=30;i++)
				System.out.print("* ");
			System.out.println("\n����������1/2/3/4��");
			int j=input.nextInt();
			switch(j){
			case 1:
				System.out.println("�������ϵͳ�����ͻ���Ϣ����");
				System.out.println("1����ʾ���пͻ���Ϣ");
				System.out.println("2����ӿͻ���Ϣ");
				System.out.println("3���޸Ŀͻ���Ϣ");
				System.out.println("4����ѯ�ͻ���Ϣ");
				break;
			case 3:
				System.out.println("�������ϵͳ�����������");
				System.out.println("1�����˴�齱");
				System.out.println("2�����˳齱");
				System.out.println("3�������ʺ�");
				break;
			default: 
				System.out.println("ϵͳ������");
				break;
				
			}
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
