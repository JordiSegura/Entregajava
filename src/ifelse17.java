
import java.io.*;

public class ifelse17{
	public static void main(String[] args) {
	

		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Cuál es la nota del examen?");
			String notaStr = buffer.readLine();
			double nota = Double.parseDouble(notaStr);

		


if (nota<=4.99){
	System.out.println("La nota "+nota+"equivale a un suspenso");
}
else if (nota>=5 && nota<=6.99){
	System.out.println("La nota "+nota+" equivale a un aprobado");
}
else if (nota>=7&&nota<=8.99){
	System.out.println("La nota "+nota+" equivale a un notable");

}
else if (nota>=9 && nota<=9.99){
	System.out.println("La nota "+nota+" equivale a un excelente");

}
else if (nota==10){
	System.out.println("La nota "+nota+" equivale a un excelente");

}
			}
	
	
		
		catch (Exception e) {
			System.out.println("Has introducido una nota incoherente");

		}

	}
}
