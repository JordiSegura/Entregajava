import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;

public class ifelse9 {

	public static void main (String[] args) throws IOException {


		double totalEdad=0;
		int numMayores18=0;


		for (int i=0; i<5; i++) {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Dime tu edad");   
			String edad=buffer.readLine();
			double edad1=Double.parseDouble(edad);
			totalEdad=totalEdad+edad1;
			
			if (edad1>=18){
				numMayores18++;
				
			}



		}
		
		System.out.println("hay "+ numMayores18 + " mayores de 18 años");
		
		
		double mediaEdad=totalEdad/5.0;

		System.out.println("La media de edad es de "+ mediaEdad);

		


		double totalAltura=0;
		double numMayoresAlt=0;
		for (int i=0; i<5; i++){
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


			System.out.println("Dime tu altura");
			String altura2=buffer.readLine();
			double altura1=Double.parseDouble(altura2);
			totalAltura=totalEdad+altura1;
			
			if (altura1>1.70){
				numMayoresAlt++;
							

			}
			
			
		}
		
		double mediaAltura=totalAltura/5.0;
		System.out.println("La media de altura es de "+ mediaAltura);
		System.out.println("hay "+ numMayoresAlt + " mas altos de 1.70");
	}




}


