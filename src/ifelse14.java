import java.util.Scanner;
import java.io.*;

public class ifelse14{

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("introduzca un mes del año");
		int mesAny=sc.nextInt();
		
		
		String mesAñoStr=null;
		int diasStr;
		int any;
		switch (mesAny){
		case (1):mesAñoStr="enero tiene 31 días";break;
		case (2):mesAñoStr="febrero, debes especificar el año para poder decirte los días";break;
		case (3):mesAñoStr="marzo tiene 31 días";break;
		case (4):mesAñoStr="abril tiene 30 días";break;
		case (5):mesAñoStr="mayo tiene 31 días";break;
		case (6):mesAñoStr="junio tiene 31 días";break;
		case (7):mesAñoStr="julio tiene 31 días";break;
		case (8):mesAñoStr="agosto tiene 31 días";break;
		case (9):mesAñoStr="septiembre tiene 30 días";break;
		case (10):mesAñoStr="octubre tiene 31 días";break;

		case (11):mesAñoStr="noviembretiene 31 días";diasStr=30;break;
		case (12):mesAñoStr="diciembre tiene 30 días";break;

	
		default: mesAñoStr = "Has introducido un mes inválido";
        break;

		}
		System.out.print("el mes introducido es " + mesAñoStr);
		if (mesAny==2){
		System.out.println("Ahora dime el año");
		String anyStr =sc.nextLine();
		int añoInt=Integer.parseInt(anyStr);
		 if(añoInt % 4 == 0 && añoInt % 100 != 0 || añoInt % 400 == 0){
	         System.out.println("El año "+añoInt+" Si es bisiesto por lo tanto febrero tiene 28 dias ");
	     }else{
	         System.out.println("El año "+añoInt+" No es bisiesto por tanto febrero tiene 29 dias ");
	     }
		
		
		}
		}
	
	}
	}