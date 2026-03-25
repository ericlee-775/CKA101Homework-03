package hw2;

public class home_work2_3 {
	public static void main(String args[]) {
//		請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		    String lst[]={"A","B","C","D","E","F"};
		    for(int i =1;i<=6;i++) {
				for(int x =0;x<i;x++) {
					System.out.print(lst[i-1]);
				}
				System.out.println();
			}
		
	}
}
