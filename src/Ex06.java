

public class Ex06 {
	public static void main (String[] args) {

		double a = 5;
		double b = 6;
		double c = 7;
		double p = (a+b+c)/2;
		
		System.out.println("El area del triangulo es: " +  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
}