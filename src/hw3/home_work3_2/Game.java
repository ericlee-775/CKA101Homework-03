package hw3.home_work3_2;

public class Game {
	private int random=(int)(Math.random()*100+1);
	public void get_game(int num) {
		
		if(num<random) {
			System.out.println("答案大於於正確答案");
		}
		else if(num>random) {
			System.out.println("答案小於正確答案");
		}
		else System.out.println("答對了答案是:"+num);
	
	}
		
	public Game() { 

	}
	
}
