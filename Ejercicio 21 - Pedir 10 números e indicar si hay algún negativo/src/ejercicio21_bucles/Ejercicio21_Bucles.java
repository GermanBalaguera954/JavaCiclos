/*
Ejercicio21: Pedir 10 numeros, y mostrar al final si se ha introducido alguno negativo.
 */
package ejercicio21_bucles;

import javax.swing.JOptionPane;

public class Ejercicio21_Bucles {

    public static void main(String[] args) {
        int numero;
        boolean hayNegativos = false;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            if (numero < 0) {
                hayNegativos = true;
            }
        }
        if (hayNegativos == true) {
            System.out.println("Si existe al menos un numero negativo: ");
        } else {
            System.out.println("No existe ningun numero negativo: ");
        }
    }
}
