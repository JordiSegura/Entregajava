import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifelse13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		//int codigoArticulo=0;
		//int cantidadVendida=0;
		//int precioLitro=0;
		
		//Escriure un programa en Java que demani 5 factures. Per a cada factura s’haurà
		//de demanar la informació corresponent (codi de l’article, quantitat venuda en litres, preu per
		//litre). A partir d’aquesta informació, caldrà calcular el següent i mostrar per pantalla amb un
		//missatge de text: Facturació total, quantitat de litre venuts de l’article 1 i nombre de factures
		//que es van emetre amb un import superior a 600€. 
		 
		  
		for (int i=0;i<=3;i++){
		System.out.println("Indica el codigo del articulo");
		String codigoArt = buffer.readLine();
		int codigoInt = Integer.parseInt(codigoArt);
		}
		for (int i=0;i<=3;i++){

		System.out.println("Indica la cantidad vendida del artículo en litros");
		String cantidadArt = buffer.readLine();
		int cantidadInt = Integer.parseInt(cantidadArt);
		}
		for (int i=0;i<=3;i++){

		System.out.println("Indica el precio por litro");
		String precioLitroStr = buffer.readLine();
		int precioInt = Integer.parseInt(precioLitroStr);
		}
		}

}

}
}
