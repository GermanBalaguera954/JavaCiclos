/*
Ejercicio19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4)
y suspensos.
 */
package ejercicio19_bucles;

import javax.swing.JOptionPane;

public class Ejercicio19_Bucles {

    public static void main(String[] args) {
        float nota;
        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10: "));

            } while (nota < 0 || nota > 10);//Nota entre 0-10.

            if (nota == 4) { // si la nota es igual a 4.
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Cantida de aprobados: " + aprobados);
        System.out.println("Cantida de condicionados: " + condicionados);
        System.out.println("Cantida de suspensos: " + suspensos);
    }

}
