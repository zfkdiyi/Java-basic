package practise;

import java.util.Scanner;

public class Promise {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ɺɺ���˶��ٷ֣�");
		int score=input.nextInt();
		
		switch(score/10){
		case(10):
			System.out.println("������һ����");
			break;
		case(9):
			System.out.println("ĸ����һ���ʼǱ�����");
		    break;
		case(8):
		case(7):
		case(6):   
			System.out.println("ĸ����һ���ֻ�");
		    break;
	    default:
			System.out.println("û������");
			break;
		}

	}

}
