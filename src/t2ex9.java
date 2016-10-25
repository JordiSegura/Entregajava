import java.io.*;
public class t2ex9 {

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
		double valor7=ecua1*2;
		double valornegat=ecua1*0.1;
		
	
		
		
		System.out.println("El resultado de la ecuación con + es de:" );
		System.out.println(valornegat+(Math.sqrt(Math.pow(ecua2, 2)- valor*(ecua1*ecua3)))/valor7);
		System.out.println("El resultado de la ecuación con - es de:" );
		System.out.println(ecua1-(Math.sqrt(Math.pow(ecua2, 2)- valor*(ecua1*ecua3)))/valor7);
		
		
		

		//1 Euro =	1,1186 Dolares
		//1 Euro =	114,27 Yenes
	}
		catch (Exception e){
	
			System.out.println("La solución es compleja");
		}

		}
	

}