import java.io.*;
import java.util.*;
public class repe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner=new Scanner(System.in);
			//int cantidad=0;
			int cont50=0;
			int cont20=0;
			int cont10=0;
			int cont5=0; 
			int cont2=0;
			int cont1=0;
		
			System.out.println("Introduce una cantidad para dar el equivalente en centimos");
			int cantidad=scanner.nextInt();
			do{
				if (cantidad-50>=0){
					cantidad=cantidad-50;
					cont50++;
				}
				else if (cantidad-20>=0){
					cantidad=cantidad-20;
					cont20++;
					
				}
				else if (cantidad-10>=0){
					cantidad=cantidad-10;
					cont10++;
					
				}
				else if (cantidad-5>=0){
					cantidad=cantidad-5;
					cont5++;
					
				}
				else if(cantidad-2>=0){
					cantidad=cantidad-2;
					cantidad++;
				}
				else if(cantidad-1>=0){
					cantidad=cantidad-1;
					cont1++;
				}
				
			}
			while(cantidad > 0);
			
			System.out.println("El cambio queda por ");
			System.out.println(cont50+"monedas de 50");
			System.out.println(cont20+"monedas de 20");
			System.out.println(cont10+"monedas de 10");
			System.out.println(cont5+"monedas de 5");
			System.out.println(cont1+"monedas de 1");





				
			}
			
			
		
	}


