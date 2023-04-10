/*
Ejercicio10: Pedir 10 numeros y escribir la suma total.
 */
package ejercicio10_bucles;

import javax.swing.JOptionPane;

public class Ejercicio10_Bucles {

    public static void main(String[] args) {
        int numero, suma = 0;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            suma += numero; // suma iterativa
        }
        System.out.println("La suma es: "+suma );
    }

}
