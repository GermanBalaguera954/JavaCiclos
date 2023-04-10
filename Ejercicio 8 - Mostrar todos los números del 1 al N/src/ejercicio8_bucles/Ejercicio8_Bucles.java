/*
Ejercicio8: Pedir un numero N, y mostrar todos los numero del 1 al N.
 */
package ejercicio8_bucles;

import javax.swing.JOptionPane;

public class Ejercicio8_Bucles {

    public static void main(String[] args) {
        int numero, i = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (i <= numero) {
            System.out.println(i);
            i++;//1 2 3 4 
        }
    }
}
