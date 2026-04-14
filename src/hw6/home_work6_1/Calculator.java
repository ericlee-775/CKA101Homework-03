package hw6.home_work6_1;

public class Calculator {
	public static  String printType(Object obj) {
	    return obj.getClass().getSimpleName();
	}
	Calculator(){};
	public double powerXY(double x,double y) throws CalException{
		if(x==0&&y==0) {
			throw new CalException("0的0次方沒有意義");   
		}
		else if(y<0) {
			throw new CalException("次方為負值，結果回傳不為整數");  
		}
		
		
		else return  Math.pow(x,y);
		
	}}
