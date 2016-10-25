import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ifelse5 {
	public static void main(String[] args) {
		
		
		try{
			
			List<Double> notas=new ArrayList<>();
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Dime la primera nota");
			String nota1Str = buffer.readLine();
			double nota1 = Double.parseDouble(nota1Str);
			System.out.println("Dime la segunda nota");
			String nota2Str = buffer.readLine();
			double nota2 = Double.parseDouble(nota2Str);
			System.out.println("Dime la tercera nota");
			String nota3Str = buffer.readLine();
			double nota3 = Double.parseDouble(nota3Str);
			System.out.println("Dime la cuarta nota");
			String nota4Str = buffer.readLine();
			double nota4 = Double.parseDouble(nota4Str);
			System.out.println("Dime la quinta nota");
			String nota5Str = buffer.readLine();
			double nota5 = Double.parseDouble(nota5Str);
			
			notas.add(nota1);
			notas.add(nota2);
			notas.add(nota3);
			notas.add(nota4);
			notas.add(nota5);
			
			for (Double nota : notas){
				
				if (nota < 5){
					System.out.println("El alumno con la siguiente nota: " + nota + " ha suspendido" );}
				
			}
			
		}
		
		catch (Exception e){
		}
	}	
}