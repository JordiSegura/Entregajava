
import java.io.*;

public class t2ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
			
		System.out.println("Dime una cifra para sumar");
		
		String dato1= buffer.readLine();
		int valor1=Integer.parseInt(dato1);
		System.out.println("La primera cifra a sumar es: "+ dato1);
		
       System.out.println("Dime una segunda cifra para sumar");
       String dato2=buffer.readLine();
	int valor2=Integer.parseInt(dato2);

       System.out.println("La segunda cifra a sumar es "+dato2);
       
      int valor3=Integer.parseInt( dato1+ dato2);
       System.out.println("El resultado de la suma es ");
       System.out.println(valor1+valor2);
       

	}
		catch (Exception e){
		System.out.println("error al intentar reproducir el resultado");
	}
	}
}

	
