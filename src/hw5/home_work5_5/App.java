package hw5.home_work5_5;

public class App {
	public static void main(String[] args) {
		Pen p1 = new Pencil(20,"three zero");
		Pen p2 = new Inkbrush(100,"uni");
		pen_information(p1);
		pen_information(p2);
		
	}
	public static void pen_information(Pen pen) {
		pen.write();
		System.out.println("價格是"+pen.get_price());
	}
	
}
