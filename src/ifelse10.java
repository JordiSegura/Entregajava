import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifelse10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduzca el valor de compra");   
		String valor1= buffer.readLine();
		double valor2=Double.parseDouble(valor1);
		
		if (valor2>=100){
			double descuento1=valor2*10/100;
			
			System.out.println("Por una compra superior a 25 euros el descuento es de "+ descuento1);
		}
		else if(valor2>=50){
			double descuento2=valor2*15/100;
			System.out.println("Por una compra superior a 50 euros el descuento total es de "+ descuento2);
	
		}
		else if (valor2>=25){
			double descuento3=valor2*30/100;

			System.out.println("Por una compra superior a 100 euros el descuento total es de "+ descuento3);
		}
		
		
	}
	

}
