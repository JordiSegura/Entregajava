
import java.io.*;

public class ifelse1 {

	public static void main (String[] args) throws IOException {
		BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
		
		//primer numer
			System.out.println("Dime un numero");
		
		String dato1= buffer.readLine();
		int valor1=Integer.parseInt(dato1);
		
		System.out.println("Dime otro numero");
		
		String dato2= buffer.readLine();
		int valor2=Integer.parseInt(dato2);

 
		
 
		if (valor1 < valor2) {
		
			System.out.println("El primer numero es menor que el segundo");     
				
		}
		
		else {
		
			System.out.println ("El primer numero es mayor que el segundo");
		
		}
   	}
}

