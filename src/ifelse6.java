import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ifelse6 {
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
			System.out.println("Valor3?");
			String nota3Str = buffer.readLine();
			double nota3 = Double.parseDouble(nota3Str);
			System.out.println("Valor4?");
			String nota4Str = buffer.readLine();
			double nota4 = Double.parseDouble(nota4Str);
			System.out.println("Valor5?");
			String nota5Str = buffer.readLine();
			double nota5 = Double.parseDouble(nota5Str);
			
			notas.add(nota1);
			notas.add(nota2);
			notas.add(nota3);
			notas.add(nota4);
			notas.add(nota5);
			
			for (Double nota : notas){
				
				if (nota%3==0){
					System.out.println("El valor: " + nota + " es multiple de 3");}
				
				
			}
			
		}
		
		catch (Exception e){
			System.out.println("El valor intoducido no es multiple de 3");
		}
	}	
}