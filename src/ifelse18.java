import java.io.*;

public class ifelse18 {
	public static void main(String[] args) throws IOException{

	
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduce un número entre el 1 y el 7.");
		String numStr= buffer.readLine();
		int num =Integer.parseInt(numStr);
		switch (num){
		// TODO Auto-generated method stub
		

		case 1:System.out.println("El número corresponde al dia lunes");break;
		case 2:System.out.println("El número corresponde al dia martes");break;
		case 3:System.out.println("El número corresponde al dia miercoles");break;
		case 4:System.out.println("El número corresponde al dia jueves");break;
		case 5:System.out.println("El número corresponde al dia viernes");break;
		case 6:System.out.println("El número corresponde al dia sabado");break;
		case 7:System.out.println("El número corresponde al dia domingo");break;
		
		default:
			System.out.println("Ha introducido un número que no entra en el rango solicitado");
		break;
		
	}
}
}

