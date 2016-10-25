import java.io.*;
public class ifelse19 {
	public static void main (String[]args) throws IOException{
		BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduce un número del 1 al 12");
		String numeroStr=buffer.readLine();
		int numero=Integer.parseInt(numeroStr);
		
		switch (numero){
		case 1:System.out.println("El número introducido corresponde al mes de Enero");break;
		case 2:System.out.println("El número introducido corresponde al mes de Febrero");break;
		case 3:System.out.println("El número introducido corresponde al mes de Marzo");break;
		case 4:System.out.println("El número introducido corresponde al mes de Abril");break;
		case 5:System.out.println("El número introducido corresponde al mes de Mayo");break;
		case 6:System.out.println("El número introducido corresponde al mes de Junio");break;
		case 7:System.out.println("El número introducido corresponde al mes de Julio");break;
		case 8:System.out.println("El número introducido corresponde al mes de Agosto");break;
		case 9:System.out.println("El número introducido corresponde al mes de Septiembre");break;
		case 10:System.out.println("El número introducido corresponde al mes de Octubre");break;
		case 11:System.out.println("El número introducido corresponde al mes de Noviembre");break;
		case 12:System.out.println("El número introducido corresponde al mes de Diciembre");break;
		default:System.out.println("El número que has introducido no entra en el rango solicitado");break;

		}
		

}
}