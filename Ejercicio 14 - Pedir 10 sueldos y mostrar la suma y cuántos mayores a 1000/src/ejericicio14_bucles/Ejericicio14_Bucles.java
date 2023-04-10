/*
Ejercicio14: Pedir 10 sueldos. Mostrar su suma y cuantos sueldos son mayores 1000.
 */
package ejericicio14_bucles;

import javax.swing.JOptionPane;

public class Ejericicio14_Bucles {

    public static void main(String[] args) {
        float sueldo, suma = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite un suledo: "));

            if (sueldo > 1000) {//si el sueldo supera 1000
                contador++; //Aumentamos a uno contador

            }
            suma += sueldo; //suma iterativa de los sueldos.
        }
        System.out.println("La suma de todos los sueldo es: $" + suma);
        System.out.println("Cantidad de sueldos mayores a 1000 es: " + contador);
    }

}
