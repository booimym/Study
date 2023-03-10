package practice2;

public class CompareTo_Test2 {

	public static <T extends Number> int compare (T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		double v3 = Double.parseDouble("1");
		return Double.compare(v1, v2);
	}
	
	
	
	public static void main(String[] args) {
		
	Integer x = 1;
	String y = "1";
	double v1 = x.doubleValue();
	//double v2 = y.doubleValue();
	
	
	}
}
