import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ifelse4 {
	public static void main(String[] args) {
		
		
		try{
			
List<Double> notas=new ArrayList<>();
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Dime el primer numero");
			String nota1Str = buffer.readLine();
			double nota1 = Double.parseDouble(nota1Str);
			System.out.println("Dime el segundo numero");
			String nota2Str = buffer.readLine();
			double nota2 = Double.parseDouble(nota2Str);
			System.out.println("Dime el tercer numero");
			String nota3Str = buffer.readLine();
			double nota3 = Double.parseDouble(nota3Str);
			System.out.println("Dime el  cuarto numero");
			String nota4Str = buffer.readLine();
			double nota4 = Double.parseDouble(nota4Str);
			System.out.println("Dime el quinto numero");
			String nota5Str = buffer.readLine();
			double nota5 = Double.parseDouble(nota5Str);
			System.out.println("Dime el sexto numero");
			String nota6Str = buffer.readLine();
			double nota6 = Double.parseDouble(nota1Str);
			System.out.println("Dime el septimo numero");
			String nota7Str = buffer.readLine();
			double nota7 = Double.parseDouble(nota2Str);
			System.out.println("Dime el octavo numero");
			String nota8Str = buffer.readLine();
			double nota8 = Double.parseDouble(nota3Str);
			System.out.println("Dime el  noveno numero");
			String nota9Str = buffer.readLine();
			double nota9 = Double.parseDouble(nota4Str);
			System.out.println("Dime el decimo numero");
			String nota10Str = buffer.readLine();
			double nota10 = Double.parseDouble(nota5Str);
			
			notas.add(nota1);
			notas.add(nota2);
			notas.add(nota3);
			notas.add(nota4);
			notas.add(nota5);
			notas.add(nota6);
			notas.add(nota7);
			notas.add(nota8);
			notas.add(nota9);
			notas.add(nota10);

			
			for (Double nota : notas){
				
				if (nota < 0){
					System.out.println("El valor: " + nota + " es negativo");}
				else if (nota >= 0 ){
					System.out.println("El valor introducido no es negativo: ");}
				
			}
			
		}
		
		catch (Exception e){
		}
	}	
}