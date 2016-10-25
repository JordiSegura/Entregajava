import java.io.*;
public class ifelse20 {

	public static void main (String[]args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));

		System.out.println("introduce un numero");
		String numeroStr=buffer.readLine();
		int numero=Integer.parseInt(numeroStr);
		
		if(numero%2==0){
            System.out.println(numero+" es par");
       }else{
           System.out.println(numero+" es impar");
       }   

	}

}
