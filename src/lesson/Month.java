package lesson;
import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
		int days=0;
		Scanner input=new Scanner(System.in);
		System.out.print("���������");
		int year=input.nextInt();
		
		int i=0;
		if((year%100!=0&&year%4==0)||(year%400==0)){
			i=1;
		}
		System.out.print("\n�������·�");
		int month=input.nextInt();
		switch(month){
		case 1:
		case 3:
		case(5):
		case(7):
		case(8):
		case(10):
		case(12):
			days=31;
		    break;
		
		case(2):
			if(i==1){
				days=29;
			}else {
				days=28;
			}
			break;
		default: 
			days=30;
	
		}
	    System.out.printf("%d���%d����%d��",year,month,days);
	}

}
