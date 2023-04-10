/*
Ejercicio1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que
se introduzca un numero negativo.
 */
package ejercicio1_bucles;

import javax.swing.JOptionPane;

public class Ejercicio1_Bucles {

    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0) { // mientra el numero sea cero o positivo            
            cuadrado = (int) Math.pow(numero, 2);

            JOptionPane.showMessageDialog(null, "El numero " + numero + " elevado al cuadrado es: " + cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
    }
}
