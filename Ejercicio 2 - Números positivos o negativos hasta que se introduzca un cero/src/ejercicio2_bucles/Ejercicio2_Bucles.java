/*
Ejercicio2: Leer un número e indicar si es positivo o negativo. El proceso se repetira
hasta que se introduzca un cero.
 */
package ejercicio2_bucles;

import javax.swing.JOptionPane;

public class Ejercicio2_Bucles {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero != 0) {//mientras sea diferente de cero     
            if (numero > 0) {
                JOptionPane.showMessageDialog(null,"El numero " + numero + " es positivo");
            } else {
                JOptionPane.showMessageDialog(null,"El numero " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }

    }

}
