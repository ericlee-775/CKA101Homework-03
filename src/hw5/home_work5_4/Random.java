package hw5.home_work5_4;

public class Random {
	Random(){};
	
	public String setAuthCode() {
		String s ="";
		for(int i=0;i<8;i++) {
			int r=(int)(Math.random()*61)+1;

			if(r<10) {
				r+=48;
			}
			else if(r<36) {
				r+=55;
			}
			else r+=61;
			s=s+(char)r;
		
		}
		return s;
	}
}
