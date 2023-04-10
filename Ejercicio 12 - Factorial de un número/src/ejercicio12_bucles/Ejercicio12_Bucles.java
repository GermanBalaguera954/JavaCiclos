/*
Ejercicio12: Pedir un numero y calcular su factorial.
 */
package ejercicio12_bucles;

import javax.swing.JOptionPane;

public class Ejercicio12_Bucles {

    public static void main(String[] args) {
        int numero;
        long factorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        for (int i = 1; i <= numero; i++) {
            factorial *= i; //multiplicacion iterativa.     
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
