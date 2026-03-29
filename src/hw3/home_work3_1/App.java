package hw3.home_work3_1;
import java.util.Scanner;
public class App {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		while(true) {
		int x[]=new int[3];
		for(int i =0;i<3;i++) {
			System.out.println("請輸入三角形邊");
			x[i]=scn.nextInt();
		}
		Triangle tr1 = new Triangle(x);
		if(tr1.no_triangle()) {
			System.out.print("不是三角形");
		}
		else if(tr1.equilateral()) {
			System.out.print("正三角形");
		}
		else if(tr1.isosceles()) {
			System.out.print("等邀三角形");
		}
		
		else System.out.print("其他三角形");
		System.out.println();
	}

	}
}
