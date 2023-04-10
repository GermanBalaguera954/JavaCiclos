/*
Ejercicio3: Leer numeros hasta que se introduzca un cero. para cada uno indica si es par o impar.
 */
package ejercicio3_bucles;

import javax.swing.JOptionPane;

public class Ejercicio3_Bucles {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es PAR");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
    }

}
