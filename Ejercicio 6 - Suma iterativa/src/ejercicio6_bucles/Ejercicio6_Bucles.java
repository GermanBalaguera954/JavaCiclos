/*
Ejercicio6: Pedir numeros hasta que se teclee 0, mostrar la suma de todos los numeros.
 */
package ejercicio6_bucles;

import javax.swing.JOptionPane;

public class Ejercicio6_Bucles {

    public static void main(String[] args) {
        int numero, suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            suma += numero;
            
        } while (numero != 0);
        System.out.println("La suma es: "+suma);
    }
}
