package hw5.home_work5_6;
public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private Behavior R1 = new Role_Behavior();
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public abstract void attack();
	
	public  void move() {
	
		R1.move();
	};
	
	public  void defend() {
		
		R1.defend();
	};
	
	}

