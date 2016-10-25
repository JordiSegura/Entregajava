import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Declara el primer valor de la ecuación");
		String dato1=buffer.readLine();
		double ecua1=Double.parseDouble(dato1);
		
		System.out.println("Declara el segundo valor de la ecuación");
		String dato2=buffer.readLine();
		double ecua2=Double.parseDouble(dato2);
		
		System.out.println("Declara el segundo valor de la ecuación");
		String dato3=buffer.readLine();
		double ecua3=Double.parseDouble(dato3);
		
		double valor=4;
	
		
		
		System.out.println("El resultado de la ecuación es de:" );
		System.out.println(ecua1+(Math.sqrt(Math.pow(ecua1, 2)- valor*(ecua2*ecua3)))/2);
		
		
		

		//1 Euro =	1,1186 Dolares
		//1 Euro =	114,27 Yenes
	}
		catch (Exception e){
			System.out.println("error");
		}

		}
	

}
