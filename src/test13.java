import java.util.Scanner;

public class test13 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int cantidadLitro,f,valor,promedio;
        int codigoArt,precioLitro;
        
        for(f=1;f<=3;f++) {
            System.out.print("Indica el codigo del articulo: ");
            valor=teclado.nextInt();
            codigoArt=codigoArt+valor;
        }
        for(f=1;f<=3;f++) {
            System.out.print("Indica la cantidad vendida del artículo en litros: ");
            valor=teclado.nextInt();
            cantidadLitro=cantidadLitro+valor;
        }
        for(f=1;f<=3;f++) {
            System.out.print("Indica el precio por litro: ");
            valor=teclado.nextInt();
            precioLitro=precioLitro+valor;
        }
        
        System.out.print("La facturación total es de: ");
        System.out.println(suma);
        promedio=suma/10;
        System.out.print("El promedio es:");
        System.out.print(promedio);
    }
}