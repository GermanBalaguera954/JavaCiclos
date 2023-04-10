/*
Ejercicio22: Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso.
 */
package ejercicio22_bucles;

import javax.swing.JOptionPane;

public class Ejercicio22_Bucles {

    public static void main(String[] args) {
        float calificacion;
        boolean haySuspensos = false;

        for (int i = 1; i <= 5; i++) {
            do {
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10: "));

            } while (calificacion < 0 || calificacion > 10);

            if (calificacion < 5) {
                haySuspensos = true;
            }
        }
        if (haySuspensos == true) {
            System.out.println("Si exiten alumnos suspensos: ");
        } else {
            System.out.println("No hay ningun alumno suspenso: ");
        }
    }
}
