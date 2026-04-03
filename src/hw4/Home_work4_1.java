package hw4;

public class Home_work4_1 {
	public static void main(String[] args) {
		int lst[] = {29,100,39,41,50,8,66,77,95,15};
		int max=0;
		for(int i=0;i<lst.length;i++) {
			max += lst[i];
		}
		System.out.println("平均值"+max/lst.length);
	
		String s = "Hello World";
		for (int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		String lst1[]={"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
		int sum=0;
		for(int i =0;i<lst1.length;i++) {
			for(int x=0;x<lst1[i].length();x++) {
				if(lst1[i].charAt(x) =='a' || lst1[i].charAt(x) =='e'|| lst1[i].charAt(x) =='i'|| lst1[i].charAt(x) =='o'|| lst1[i].charAt(x) =='u') {
					sum+=1;
				}
				
				
			}
		}
		System.out.print(sum);
	}
	
}
