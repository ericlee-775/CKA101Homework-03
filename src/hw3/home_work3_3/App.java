package hw3.home_work3_3;
import java.util.Scanner;

public class App {
	public  static void main(String args[]) {
		System.out.println("請輸入討厭數字");
		Scanner scn=new Scanner(System.in);
		Chance_num ch1=new Chance_num(scn.nextInt());
		ch1.get_chance_num();
	}
}
