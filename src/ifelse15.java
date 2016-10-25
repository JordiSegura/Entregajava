
import java.io.*;

public class ifelse15 {
	public static void main(String[] args) {
		// int dia;
		// int mes;
		// int año;

		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Indica el dia de nacimiento");
			String diaStr = buffer.readLine();
			double dia1 = Double.parseDouble(diaStr);

			System.out.println("Indica el mes de nacimiento ");
			String mesStr = buffer.readLine();
			double mes1 = Double.parseDouble(mesStr);

			System.out.println("Indica el año de nacimiento");
			String añoStr = buffer.readLine();
			double año1 = Double.parseDouble(añoStr);

			double CalcSuerte = dia1 + mes1 + año1;
			double NumSuerte = CalcSuerte;

			String NumSuerteStr = "" + (int) NumSuerte;

			int TotalSuma=0;
			for (int i = 0; i < NumSuerteStr.length(); i++) {
				
				TotalSuma=TotalSuma+Integer.parseInt(""+NumSuerteStr.charAt(i));

			}
			System.out.println("El número de la suerte es" + TotalSuma);
		} catch (Exception e) {
			System.out.println("Has introducido una fecha incoherente");

		}

	}
}
