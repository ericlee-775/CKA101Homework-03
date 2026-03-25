package hw1;

public class home_work1_6 {
	public static void main(String[] args) {
//	• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
	
	System.out.println(5 + 5);  // 數字加數字
	System.out.println(5 + '5');//數字加unicode'5'
	System.out.println(5 + "5");//當數字遇到字串時，"+" 號會變成連接符，將數字轉為字串後串接在一起。
	}
}
