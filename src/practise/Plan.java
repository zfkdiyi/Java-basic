package practise;
import java.util.Scanner;
public class Plan {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("���������ڼ���");
		String date=input.next();
		switch(date){
		case ("����һ"):
		case ("������"):
		case ("������"):
			System.out.println("ѧϰ���");
			break;
		case ("���ڶ�"):
		case ("������"):
		case ("������"):
			System.out.println("ѧϰӢ��");
			break;
		case("������"):
		case("������"):
			System.out.println("��Ϣ");
		default: 
			System.out.println("��������ȷ�����ڣ�");
			break;
		}

		
		

	}

}
