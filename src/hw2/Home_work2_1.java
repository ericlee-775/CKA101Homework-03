package hw2;

public class Home_work2_1 {
	public static void main(String args[]) {
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum=0;
		for(int i =2;i<1000;i+=2) {
			sum+=i;
		}
		System.out.println(sum);
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int multiplied=1;
		for(int i =1;i<10;i++) {
			multiplied*=i;
		}
		System.out.println(multiplied);
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int multiplied_while=1;
		int i=1;
		while(i<=10) {
			i++;
			multiplied_while*=i;
			
		}
		System.out.println(multiplied_while);
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int x=1;
		for(i=1;i<=100;i+=x) {
			x+=2;
			System.out.print(i+" ");
		}
	}
}

