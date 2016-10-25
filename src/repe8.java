import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class repe8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduce un número.");
		String numeroStr=buffer.readLine();
		int numero=Integer.parseInt(numeroStr);
		boolean numeroImpar= true;
		
			
	
	for (int i=0;i<=numero;i++){
		if (i%2==0){
			
		}else if (i%2 !=0){
			numeroImpar= false;
			System.out.println("el numero "+i+"es impar");
			
		
		}
	}
		}
}


		
	           

		



