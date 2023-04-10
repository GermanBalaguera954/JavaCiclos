/*
Ejercicio20: Pedir un numero N,introducir N sueldos, y mostrar el sueldo maximo.
 */
package ejercicio20_bucles;

import javax.swing.JOptionPane;

public class Ejercicio20_Bucles {

    public static void main(String[] args) {
        int numeroSueldos;
        float sueldo, sueldoMax = 0;

        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldo que desea introducir:"));

        for (int i = 1; i <= numeroSueldos; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo N° " + i + " : "));

            if (sueldo > sueldoMax) {
                sueldoMax = sueldo;
            }
        }
        System.out.println("El sueldo maximo es: " + sueldoMax);
    }
}
