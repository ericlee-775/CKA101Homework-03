package hw4;
import java.util.Scanner;
public class Home_work4_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int lst[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("輸入年");
		int y =scn.nextInt();
		if (y%400==0 ||(y%4==0&&y%100!=0)) {
			lst[1]=29;
			
		}
		
		System.out.print("輸入月");
		int m =scn.nextInt();
		int d =0;
		do {
		System.out.print("輸入日");
		d =scn.nextInt();
		if(lst[m]<d) System.out.print("超過該月份天數");
		}
		while(lst[m]<d) ;
		int sum=0;
		for(int i=0;i<m;i++) {
			sum+=lst[i];
		}
		System.out.print(sum+d);
	}
}
