package hw5.home_work5_5;

public abstract class Pen {
	private String brand;
	private int price;
	
	Pen(){}
	Pen(int price,String brand){
		this.price=price;
		this.brand=brand;
	}
	public int get_price() {
		return price;
	}
	public String get_brand() {
		return brand;
	}
	public void Set_price(int price) {
		this.price=price;
	}
	public void Set_brand(String brand) {
		this.brand=brand;
	}
	public abstract void write();
}
