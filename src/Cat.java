import java.util.Scanner;

public class Cat {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0,d = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("������Ҫ����������� ");
		a = in.nextInt();// ��������a
		/*if (a >= 60) {
			b = (a / 60);
			if (b >= 60) {
				c = (b / 60);
			}
		}*/
		
		//һС�r���g1*60*60=3600��
		//һ��犵��g60��
		c=a/3600;
		if(a%3600>0){
			b=(a%3600)/60;
			if((a%3600)%60>0){
				d=(a%3600)%60;
			}
		}
		System.out.println(c + "Сʱ" + b + "����" + d + "��");

	}

}
