import java.util.Scanner;
import java.io.*;

public class ifelse14{

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("introduzca un mes del a�o");
		int mesAny=sc.nextInt();
		
		
		String mesA�oStr=null;
		int diasStr;
		int any;
		switch (mesAny){
		case (1):mesA�oStr="enero tiene 31 d�as";break;
		case (2):mesA�oStr="febrero, debes especificar el a�o para poder decirte los d�as";break;
		case (3):mesA�oStr="marzo tiene 31 d�as";break;
		case (4):mesA�oStr="abril tiene 30 d�as";break;
		case (5):mesA�oStr="mayo tiene 31 d�as";break;
		case (6):mesA�oStr="junio tiene 31 d�as";break;
		case (7):mesA�oStr="julio tiene 31 d�as";break;
		case (8):mesA�oStr="agosto tiene 31 d�as";break;
		case (9):mesA�oStr="septiembre tiene 30 d�as";break;
		case (10):mesA�oStr="octubre tiene 31 d�as";break;

		case (11):mesA�oStr="noviembretiene 31 d�as";diasStr=30;break;
		case (12):mesA�oStr="diciembre tiene 30 d�as";break;

	
		default: mesA�oStr = "Has introducido un mes inv�lido";
        break;

		}
		System.out.print("el mes introducido es " + mesA�oStr);
		if (mesAny==2){
		System.out.println("Ahora dime el a�o");
		String anyStr =sc.nextLine();
		int a�oInt=Integer.parseInt(anyStr);
		 if(a�oInt % 4 == 0 && a�oInt % 100 != 0 || a�oInt % 400 == 0){
	         System.out.println("El a�o "+a�oInt+" Si es bisiesto por lo tanto febrero tiene 28 dias ");
	     }else{
	         System.out.println("El a�o "+a�oInt+" No es bisiesto por tanto febrero tiene 29 dias ");
	     }
		
		
		}
		}
	
	}
	}