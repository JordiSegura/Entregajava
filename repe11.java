import javax.swing.*;
import java.util.Random;

/**
 * Created by usu21 on 27/10/2016.
 */
public class repe11 {

        public static void main(String[] args) {
            Random r = new Random();
            int intentos=0;
            int adivinar = r.nextInt(101); // genera un número entre 0 y 99
            int apuesta = input("Adivina el número secreto entre 0 y 100. ¿Que número es?");

            while (adivinar != apuesta && intentos<9) { // si el número dado es distinto al sorteado repite
                if (adivinar > apuesta) {
                    apuesta = input("El número a adivinar es más grande. \n Intentelo otra vez");

                } else {
                    apuesta = input("El número a adivinar es más chico. \n Intentelo otra vez");
                    //intentos++;
                }

                intentos++;


            }

            if (adivinar==apuesta){
                JOptionPane.showMessageDialog(null,
                        "Felicitaciones ha dado con el número con " + intentos + " intentos fallidos");
            }
            else {
                System.out.println("Has agotado el número máximo de intentos, la respuesta era: "+adivinar);
            }


        }

        /**
         * Muestra una ventana con el mensaje text y solicita una respuesta
         *
         * @param text
         * @return devuelve un número int
         */
        private static int input(String text) {
            return Integer.parseInt(JOptionPane.showInputDialog(text));
        }
    }

