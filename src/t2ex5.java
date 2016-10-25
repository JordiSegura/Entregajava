
import java.io.*;

public class t2ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
			
		System.out.println("Dime un numero numero");
		
		String numero1= buffer.readLine();
		int valor1=Integer.parseInt(numero1);
		System.out.println("numero 1: "+ numero1);
		
       for (int i=0;i<11;i++) {
    	   System.out.println("1x"+ valor1);
    	   
    	  int resultado=valor1*i;
    	  System.out.println("tabla de multiplicar = " + resultado);
    	   
       }
for (int i=0; i<11; i++){
System.out.println("1+"+ valor1);
int resultado2=valor1+i;
System.out.println("tabla de sumar= "+resultado2);

}




       
       

	}
		catch (Exception e){
		System.out.println("error");
	}
	}
}