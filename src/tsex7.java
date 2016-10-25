

import java.io.*;

public class tsex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
			
		//primer numer
			System.out.println("Dime el año actual");
		
		String dato1= buffer.readLine();
		int valor1=Integer.parseInt(dato1);
		
		
		//segundo numero
		System.out.println("dime el año de tu nacimiento");
		String dato2=buffer.readLine();
		int valor2=Integer.parseInt(dato2);
		
		
       

       System.out.println("Tu edad es ");
       System.out.println(valor1 - valor2);
       
      
     





       
       

	}
		catch (Exception e){
		System.out.println("error");
	}
	}
}

	
