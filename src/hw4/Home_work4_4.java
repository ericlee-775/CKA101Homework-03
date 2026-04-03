package hw4;

public class Home_work4_4 {
	public static void main(String[] args) {
		int lst[][] = {{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,95,90},
				{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
		int top[]= new int[8];
		for(int i=0;i<lst.length;i++) {
			int top_score=0;
			for(int o=0;o<lst[i].length;o++) {
				if(top_score<lst[i][o]) { 
					top_score=lst[i][o];
					top[i]=o+1;
//					System.out.println(top[o]);
				}
				}
			
					}
		for(int i=1;i<7;i++) {
			int sum=0;
			for(int x=0;x<6;x++) {
				if(i==top[x]) sum+=1;
				
			}
			System.out.println(i+"號同學"+sum+"次");
		}
	}
}
