

import java.io.*;

public class t2ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
			
		//primer numer
			System.out.println("Dime la primera nota");
		
		String dato1= buffer.readLine();
		double valor1=Double.parseDouble(dato1);
		System.out.println("nota 1: "+ dato1);
		
		//segundo numero
		System.out.println("dime la segunda nota");
		String dato2=buffer.readLine();
		double valor2=Double.parseDouble(dato2);
		//tercer numero
		System.out.println("dime la tercera nota");
		String dato3=buffer.readLine();
		double valor3=Double.parseDouble(dato3);
		
		//cuarto numero
		System.out.println("dime la tercera nota");
		String dato4=buffer.readLine();
		double valor4=Double.parseDouble(dato4);
		
		//quinto numero
		System.out.println("dime la quinta nota");
		String dato5=buffer.readLine();
		double valor5=Double.parseDouble(dato5);
		
		
       

       System.out.println("La nota media es ");
       System.out.println((valor1 + valor2 + valor3 + valor4 + valor5)/5);
       
      
     





       
       

	}
		catch (Exception e){
		System.out.println("error");
	}
	}
}

	
