
import java.io.*;

public class ifelse15 {
	public static void main(String[] args) {
		// int dia;
		// int mes;
		// int a�o;

		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Indica el dia de nacimiento");
			String diaStr = buffer.readLine();
			double dia1 = Double.parseDouble(diaStr);

			System.out.println("Indica el mes de nacimiento ");
			String mesStr = buffer.readLine();
			double mes1 = Double.parseDouble(mesStr);

			System.out.println("Indica el a�o de nacimiento");
			String a�oStr = buffer.readLine();
			double a�o1 = Double.parseDouble(a�oStr);

			double CalcSuerte = dia1 + mes1 + a�o1;
			double NumSuerte = CalcSuerte;

			String NumSuerteStr = "" + (int) NumSuerte;

			int TotalSuma=0;
			for (int i = 0; i < NumSuerteStr.length(); i++) {
				
				TotalSuma=TotalSuma+Integer.parseInt(""+NumSuerteStr.charAt(i));

			}
			System.out.println("El n�mero de la suerte es" + TotalSuma);
		} catch (Exception e) {
			System.out.println("Has introducido una fecha incoherente");

		}

	}
}
