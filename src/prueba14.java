//package ejercicio0314;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prueba14 {

	public static void main(String[] args) {
		 
		try{

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			
			
			System.out.println("Dime el numero de un mes de el año");
			String mes1 = buffer.readLine();
			int mes11 = Integer.parseInt(mes1);
		
			
			
			
			String mes11String = null;
			switch (mes11) {
            case 1:  mes11String = "Gener i té 31 dies";
                     break;
            case 2: mes11String ="Febrero pero me tendras que decir el año para decirte el numero de dias exactos" ;
                     break;
                     
            case 3:  mes11String = "Març i té 31 dies";
                     break;
            case 4:  mes11String = "Abril i té 30 dies";
                     break;
            case 5:  mes11String = "Maig i té 31 dies";
                     break;
            case 6:  mes11String = "Juny i té 31 dies";
                     break;
            case 7:  mes11String = "Juliol i té 31 dies";
                     break;
            case 8:  mes11String = "Augost i té 31 dies";
                     break;
            case 9:  mes11String = "Setembre i té 30 dies";
                     break;
            case 10: mes11String = "Octubre i té 31 dies";
                     break;
            case 11: mes11String = "Novembre i té 31 dies";
                     break;
            case 12: mes11String = "Decembre i té 30 dies";
                     break;
            default: mes11String = "Invalid month";
                     break;
        }
        System.out.println("El mes de l'any es "+mes11String);
    	if (mes11==2){
        System.out.println("Ahora dime el año para que pueda decirte los dias");}
		
    	String año1 = buffer.readLine();
		int año11 = Integer.parseInt(año1);
		
		 if(año11 % 4 == 0 && año11 % 100 != 0 || año11 % 400 == 0){
	         System.out.println("El año "+año11+" Si es bisiesto por lo tanto febrero tiene 28 dias ");
	     }else{
	         System.out.println("El año "+año11+" No es bisiesto por tanto febrero tiene 29 dias ");
	     }
		
		
	
    

			
			
			 
	 
			
			
			
			
		
		


		
		
		
			
			
		
			
		
			
		
			
			
		}
			
		catch (Exception e){
		
		
				
		}	
	}
}