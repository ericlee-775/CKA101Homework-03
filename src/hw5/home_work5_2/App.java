package hw5.home_work5_2;

public class App {
	public static void main(String[] args) {
		int[][] intArray = {{1,6,3},{9,5,2}};
		double[][] doubleArray = {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		List_sum sum1 = new List_sum();
		System.out.println(sum1.maxElement(intArray));
		System.out.println(sum1.maxElement(doubleArray));
	}
}
