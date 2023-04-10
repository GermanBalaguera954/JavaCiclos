/*
Ejercici4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han 
introducido.
 */
package ejercicio4_bucles;

import javax.swing.JOptionPane;

public class Ejercicio4_Bucles {

    public static void main(String[] args) {
        int numero, contador = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0) {//mientras numero no sea negativo            
            contador++; //aunmentamos el contador en uno
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        System.out.println("Ha introducido " + contador + " no negativos");
    }
}
