
import java.io.*;

public class ifelse16 {
	public static void main(String[] args) {
	

		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Indica el primer valor");
			String valor1Str = buffer.readLine();
			int valor1 = Integer.parseInt(valor1Str);

			System.out.println("Indica el segundo valor");
			String valor2Str = buffer.readLine();
			int valor2 = Integer.parseInt(valor2Str);

int TotalDiv=valor1/valor2;
System.out.println("El resultado de la división es " + TotalDiv);
for (int i = 1 ; i <= TotalDiv ; i++)	
if (TotalDiv % i == 0){
	System.out.println("El resultado es divisor de 0");
}
			}
	
	
		
		catch (Exception e) {
			System.out.println("Has introducido una fecha incoherente");

		}

	}
}
