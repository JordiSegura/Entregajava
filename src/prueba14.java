//package ejercicio0314;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prueba14 {

	public static void main(String[] args) {
		 
		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			
			
			System.out.println("Dime el numero de un mes de el a�o");
			String mes1 = buffer.readLine();
			int mes11 = Integer.parseInt(mes1);
		
			
			
			
			String mes11String = null;
			switch (mes11) {
            case 1:  mes11String = "Gener i t� 31 dies";
                     break;
            case 2: mes11String ="Febrero pero me tendras que decir el a�o para decirte el numero de dias exactos" ;
                     break;
                     
            case 3:  mes11String = "Mar� i t� 31 dies";
                     break;
            case 4:  mes11String = "Abril i t� 30 dies";
                     break;
            case 5:  mes11String = "Maig i t� 31 dies";
                     break;
            case 6:  mes11String = "Juny i t� 31 dies";
                     break;
            case 7:  mes11String = "Juliol i t� 31 dies";
                     break;
            case 8:  mes11String = "Augost i t� 31 dies";
                     break;
            case 9:  mes11String = "Setembre i t� 30 dies";
                     break;
            case 10: mes11String = "Octubre i t� 31 dies";
                     break;
            case 11: mes11String = "Novembre i t� 31 dies";
                     break;
            case 12: mes11String = "Decembre i t� 30 dies";
                     break;
            default: mes11String = "Invalid month";
                     break;
        }
        System.out.println("El mes de l'any es "+mes11String);
    	if (mes11==2){
        System.out.println("Ahora dime el a�o para que pueda decirte los dias");}
		
    	String a�o1 = buffer.readLine();
		int a�o11 = Integer.parseInt(a�o1);
		
		 if(a�o11 % 4 == 0 && a�o11 % 100 != 0 || a�o11 % 400 == 0){
	         System.out.println("El a�o "+a�o11+" Si es bisiesto por lo tanto febrero tiene 28 dias ");
	     }else{
	         System.out.println("El a�o "+a�o11+" No es bisiesto por tanto febrero tiene 29 dias ");
	     }
		
		
	
    

			
			
			 
	 
			
			
			
			
		
		


		
		
		
			
			
		
			
		
			
		
			
			
		}
			
		catch (Exception e){
		
		
				
		}	
	}
}