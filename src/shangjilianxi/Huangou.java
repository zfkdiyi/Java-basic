package shangjilianxi;
import java.util.Scanner;
public class Huangou {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("���������ѽ�");
		double money=input.nextDouble();
		
		System.out.println("1����50Ԫ ��2Ԫ�����¿���1ƿ");
		System.out.println("2����100Ԫ ��3Ԫ��500ml����1ƿ");
		System.out.println("3����100Ԫ����10Ԫ��5kg���");
		System.out.println("4����200Ԫ����10Ԫ���ղ������˹�1��");
		System.out.println("5����200Ԫ����20Ԫ��ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.print("����������ѡ��");
		int num=input.nextInt();
		
		switch(num){
		case 1:
			if(money>=50){
				System.out.println("�������ѽ� "+(money+2));
				System.out.println("�ɹ������� ���¿���1ƿ");
			
			}else {
				System.out.println("�������ѽ� "+money);
				System.out.println("���㣬�޷�����");
			}break;
			
			
		case 2:
			if(money>=100){
				System.out.println("�������ѽ� "+(money+3));
				System.out.println("�ɹ������� 500ml����1ƿ");
			}else if(money>=50){
				System.out.println("�������ѽ� "+money);
				System.out.println("�޷�����ָ��Ҫ����Ʒ");
			
			}else {
				System.out.println("�������ѽ� "+money);
				System.out.println("���㣬�޷�����");
			}break;
		
		case 3:
			if(money>=100){
				System.out.println("�������ѽ� "+(money+10));
				System.out.println("�ɹ������� 5kg���");
			}else if(money>=50){
				System.out.println("�������ѽ� "+money);
				System.out.println("�޷�����ָ��Ҫ����Ʒ");
			
			}else {
				System.out.println("�������ѽ� "+money);
				System.out.println("���㣬�޷�����");
			}break;
		case 4:
			if(money>=200){
				System.out.println("�������ѽ� "+(money+10));
				System.out.println("�ɹ������� �ղ������˹�1��");
			}else if(money>=50){
				System.out.println("�������ѽ� "+money);
				System.out.println("�޷�����ָ��Ҫ����Ʒ");
			
			}else {
				System.out.println("�������ѽ� "+money);
				System.out.println("���㣬�޷�����");
			}break;
		case 5:
			if(money>=200){
				System.out.println("�������ѽ� "+(money+20));
				System.out.println("�ɹ������� ŷ����ˬ��ˮһƿ");
			}else if(money>=50){
				System.out.println("�������ѽ� "+money);
				System.out.println("�޷�����ָ��Ҫ����Ʒ");
			
			}else {
				System.out.println("�������ѽ� "+money);
				System.out.println("���㣬�޷�����");
			}break;
				
		case 0:
			System.out.println("�������ѽ� "+money);
			System.out.println("û�л�����Ʒ");
				
				
		}

	}

}
