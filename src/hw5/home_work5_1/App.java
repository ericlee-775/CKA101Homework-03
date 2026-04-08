package hw5.home_work5_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int width=scn.nextInt();
		int height=scn.nextInt();
		Print p1 = new Print(width,height);
		p1.starSquare();
		Random r1 = new Random();
		r1.randSquare();
	}
}
