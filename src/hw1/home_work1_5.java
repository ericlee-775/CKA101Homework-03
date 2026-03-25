package hw1;
import java.lang.Math;

public class home_work1_5 {
	public static void main(String[] args) {
//		某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		int pv=150;
		double r=0.02;
		int n=10;
		double fv= pv*Math.pow(1+r,10);
		System.out.println(fv);
	}
}
