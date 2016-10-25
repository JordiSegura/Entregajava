import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ifelse7 {
	public static void main(String[] args) {
		
		
		try{
			
			List<Double> notas=new ArrayList<>();
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Valor1?");
			String nota1Str = buffer.readLine();
			double nota1 = Double.parseDouble(nota1Str);
			System.out.println("Valor2?");
			String nota2Str = buffer.readLine();
			double nota2 = Double.parseDouble(nota2Str);
			
			
			notas.add(nota1);
			notas.add(nota2);
		
			
			for (Double nota : notas){
				
				if (nota1%nota2==0){
					System.out.println("El valor: " + nota1 + " es multiple de "+ nota2);}
				
		
			}
			
		}
		
		catch (Exception e){
			System.out.println("El valor intoducido no es multiple del primero ");
		}
	}	
}