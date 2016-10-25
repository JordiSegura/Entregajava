import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ifelse8 {
	public static void main(String[] args) {
		
		
		try{
			
			List<Integer> notas=new ArrayList<>();
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			
			
		
			
			for (Integer nota : notas){
				
				
					
					
		//		else if (nota >= 4 && nota < 5){
			//		System.out.println("El alumno con la siguiente nota: " + nota + " esta condicionado");}
				//else {
				//System.out.println("El alumno con la siguiente nota: " + nota + " ha suspendido");}
			}
			
			
			int totalPosit=0;
			int conPosit=0;
			
			int totalNegat=0;
			int contNegat=0;
			for(int i=0; i<10; i++ ){
				
				System.out.println("nota");
				String notaStr = buffer.readLine();
				int nota = Integer.parseInt(notaStr);
				
				if (nota>=0){
					totalPosit=totalPosit+nota;
					conPosit++;
				} 
				else{
					totalNegat=totalNegat+nota;
					contNegat++;
				}
				
				
				
			}
			
			
			
					
			
		}
		
		catch (Exception e){
		}
	}	
}