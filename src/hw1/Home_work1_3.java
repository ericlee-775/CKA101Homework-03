package hw1;

public class Home_work1_3 {
	public static void main(String[] args) {
	int seconds= 256559;
	int day=seconds/(60*60*24);
	int over_day=seconds%(60*60*24);
	int hour=over_day/(60*60);
	int over_hour=day%(60*60);
	int last_seconds= over_hour/60;
	System.out.println(day+"天"+hour+"小時"+last_seconds);
}
}