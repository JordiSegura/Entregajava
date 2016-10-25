import java.io.*;

public class ifelse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Declara un valor");
	String dato1=buffer.readLine();
	int numero1=Integer.parseInt(dato1);
	
	
	if(numero1%2==0 && numero1%5==0){
		
		System.out.println("el numero "+ numero1+ "es multiple de 2 y de 5");
	}
		else if(numero1%2==0){
			System.out.println("el numero "+ numero1+ "es multiple de 2 ");

			
		}
		else if(numero1%2==0){
			
			System.out.println("el numero "+ numero1+ "es multiple de 5");

		}
		
	
	
	
}
catch (Exception e){
	
}
}
	}


