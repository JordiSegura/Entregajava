
import java.io.*;

public class t2ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
			
		System.out.println("Dime la base");
		
		String dato1= buffer.readLine();
		int valor1=Integer.parseInt(dato1);
		System.out.println("La base es: "+ dato1);
		
       System.out.println("Dime la altura");
       String dato2=buffer.readLine();
	int valor2=Integer.parseInt(dato2);

       System.out.println("La altura es "+dato2);
       
      
       System.out.println("El area es "+ Math.sqrt((valor1*valor2)/2)+ " y el perimetro es " + (valor2*3));
       
       

	}
		catch (Exception e){
		System.out.println("error");
	}
	}
}

	
