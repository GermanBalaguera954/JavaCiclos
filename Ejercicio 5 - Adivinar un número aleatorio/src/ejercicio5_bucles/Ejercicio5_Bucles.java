/*
Ejercicio5: Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0 y 100, y
luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta y mostrar el numero de intentos.
 */
package ejercicio5_bucles;

import javax.swing.JOptionPane;

public class Ejercicio5_Bucles {

    public static void main(String[] args) {

        int numero, aleatorio, contador = 0;

        aleatorio = (int) (Math.random() * 100); // Genera un numero aleatorio entre 0 y 100;   

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            if (aleatorio > numero) {
                System.out.println("Digite un numero mayor: ");
                
            } else {

                System.out.println("Digite un numero menor: ");
            }
            contador++;
        } while (numero != aleatorio);
        System.out.println("\nGenial adivinaste el numero en " + contador + " intentos:");
    }
}
