package hw3.home_work3_1;

public class Triangle {
	
	public int side[]=new int[3];
	public Triangle(int side[]) {
		this.side=side;
	}
	public boolean isosceles() {
		if(side[0]==side[1] || side[1]==side[2] || side[2]==side[1]) {
			return true;
		}
		else return false;
	}
	public boolean equilateral() {
		if(side[0]==side[1]&& side[1]==side[2]) {
			return true;
		}
		else return false;
	}
	public boolean no_triangle() {
		if(side[0]+side[1]<side[2] || side[1]+side[2]<side[0] ||side[0]+side[2]<side[1]) {
			return true;
		}
		else return false;
	}
}
