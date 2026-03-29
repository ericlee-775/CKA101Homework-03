package hw3.home_work3_3;

public class Chance_num {
	private int num;
	private int random;
	private int sum=0;
	public Chance_num(int num) {
		this.num = num;
	}
	public void get_chance_num() {
		for(int i =1;i<50;i++) {
			if(i/10!=num && i%10!=num) {
				System.out.printf("%3d",i);
				sum+=1;
				if (sum%5==0) System.out.println();
		}
			
	}

		}
	}	
		