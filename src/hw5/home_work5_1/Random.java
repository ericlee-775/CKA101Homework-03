package hw5.home_work5_1;

public class Random {
	Random(){};
	public void randSquare() {
		int lst[]= {0,0,0,0,0,0,0,0,0,0};
		int random,check,sum=0;
		System.out.println("本次亂數結果");
		for(int x =0;x<lst.length;x++) {
			
			do{
				check=0;
				random=(int)(Math.random()*100)+1;
				for(int i=0;i<lst.length;i++) {
					if(lst[i]==random) {
							check=1;
						}	
					}
				}while(check==1);
			lst[x]=random;
			System.out.printf("%4d",random);
			sum+=random;
			
		}
		System.out.println();
		System.out.printf("%4d",sum/lst.length);
		
	}
}
