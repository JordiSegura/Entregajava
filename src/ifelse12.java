import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifelse12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Indica las horas trabajadas por semana");
String horasMes = buffer.readLine();
int horasMesInt = Integer.parseInt(horasMes);
//40 horas o menos=16$/hora --més de 40 hores=16€ per40 hores i 20€ per cada hora extra Dar sueldo semanal

if (horasMesInt<=40){
	int calculo1=horasMesInt*16;
	System.out.println("El sueldo que le corresponde es"+ calculo1);
	
	
}
 
 else if (horasMesInt>40){
	 int horasExtra=horasMesInt-40;
	 int calculo2=horasMesInt*16;
	 int sueldoExtra=horasExtra*20;
	 int valorTotal=calculo2 +sueldoExtra;
	 
	 System.out.println("El sueldo que le corresponde es de "+ valorTotal);
}
	}

}
