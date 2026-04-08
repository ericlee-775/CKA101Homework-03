package hw5.home_work5_5;

public class Inkbrush extends Pen{
	Inkbrush(int price,String brand){
		super(price,brand);
	};
	public void write() {
		System.out.println("沾墨汁在寫");
	}
}
