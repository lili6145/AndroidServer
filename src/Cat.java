import java.util.Scanner;

public class Cat {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0,d = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要输入的秒数： ");
		a = in.nextInt();// 这是输入a
		/*if (a >= 60) {
			b = (a / 60);
			if (b >= 60) {
				c = (b / 60);
			}
		}*/
		
		//一小時等譯1*60*60=3600秒
		//一分鐘等譯60秒
		c=a/3600;
		if(a%3600>0){
			b=(a%3600)/60;
			if((a%3600)%60>0){
				d=(a%3600)%60;
			}
		}
		System.out.println(c + "小时" + b + "分钟" + d + "秒");

	}

}
