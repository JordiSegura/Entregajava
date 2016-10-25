
import java.io.*;

public class t2ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
			
		System.out.println("Dime el primer numero");
		
		String dato1= buffer.readLine();
		int valor1=Integer.parseInt(dato1);
		System.out.println("numero 1: "+ dato1);
		
       System.out.println("Dime el segundo numero");
       String dato2=buffer.readLine();
	int valor2=Integer.parseInt(dato2);

       System.out.println("numero 2: "+dato2);
       
      
       System.out.println("la suma es ");
       System.out.println(valor1+valor2);
       System.out.println("la multiplicación es");
       System.out.println(valor1*valor2);
       System.out.println("la división es ");
       System.out.println(valor1/valor2);
       System.out.println("la resta es ");
       System.out.println(valor1-valor2);
       System.out.println("el modulo es ");
       System.out.println(valor1%valor2);






       
       

	}
		catch (Exception e){
		System.out.println("error");
	}
	}
}

	
