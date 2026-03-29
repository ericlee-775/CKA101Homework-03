package hw3.home_work3_2;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("請輸入遊玩數字");
		Scanner scn = new Scanner(System.in);
		Game g1=new Game();
		while(true) {
		g1.get_game(scn.nextInt());
		}
	}
}
