package hw5.home_work5_2;

public class List_sum {
	private int[][] intArray;
	private double[][] doubleArray;
	List_sum(){};
	
	public int maxElement(int[][] intArray) {
		int max=0;
		for(int i=0;i<intArray.length;i++) {
			for(int x=0;x<intArray[i].length;x++) {
				max = Math.max(max,intArray[i][x]);
	
				}
		}
		return max;
	}
	public double maxElement(double[][] doubleArray) {
		double max=0;
		for(int i=0;i<doubleArray.length;i++) {
			for(int x=0;x<doubleArray[i].length;x++) {
				max = Math.max(max,doubleArray[i][x]);
			
			}
		}
	return max;
	}
}
