package hw4;
import java.util.Scanner;
public class Home_work4_2 {
	public static void main(String[] args) {
		int lst[][]= {{25,32,8,19,27},{2500,800,500,1000,1200}};
		Scanner scn = new Scanner(System.in);
		int money =scn.nextInt();
		for(int i=0;i<5;i++) {
			if(lst[1][i]>=money) {
				System.out.printf("%3d",lst[0][i]);
			}
			
			
		}
	}
	
}
