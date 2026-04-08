package hw5.home_work5_1;

public class Print {
	private int width;
	private int height;
	Print(int width,int height){
		this.width=width;
		this.height=height;
	}
	public void starSquare() {
		for(int x=0;x<height;x++) {
			for(int i=0;i<width;i++) {
				System.out.print('*');
			}System.out.println();
		}
	}	
}
