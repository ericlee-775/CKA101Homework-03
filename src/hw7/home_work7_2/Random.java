package hw7.home_work7_2;

public class Random {
	Random(){};
	public int[] getRandom() {
		int lst[] = new int[10];
		int random;
		for(int i =0;i<10;i++) {
			lst[i]=random=(int)(Math.random()*1000+1);
		}
		return lst;
	}
}
