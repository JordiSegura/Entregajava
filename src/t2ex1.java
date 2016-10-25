import java.io.*;

public class t2ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));
			
		System.out.println("dime tu nombre");
		
		String nombre= buffer.readLine();
		System.out.println("hola "+ nombre);
		
       System.out.println("dime tu edad");
       String edad=buffer.readLine();
       System.out.println("tu edad es "+edad);
       

	}
		catch (Exception e){
		System.out.println("error al intentar reproducir los datos");
	}
	}
}
