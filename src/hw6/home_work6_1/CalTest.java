package hw6.home_work6_1;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true) {
			Calculator c1=new Calculator();
			try {
				System.out.println("請輸入x的值:");
				double x = scn.nextDouble();
				
				System.out.println("請輸入y的值:");
				double y = scn.nextDouble();
				System.out.println(c1.powerXY(x,y));
			}
			catch (CalException e){
				System.out.println(e.getMessage());
			
		}
	}
	}
}

		
		

