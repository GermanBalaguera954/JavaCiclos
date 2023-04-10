/*
Ejercicio7:´Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
 */
package ejercicio7_bucles;

import javax.swing.JOptionPane;

public class Ejercicio7_Bucles {

    public static void main(String[] args) {
        int numero, elementos = 0, suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0) {
            suma += numero;// suma iterativa
            elementos++; //aumentamos uno a los elementos
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));           
        }
        
        if (elementos  ==  0) {
            System.out.println("Error la division entre cero no exite");
        }else{
        media = (float)suma / elementos;
            System.out.println("La media es: "+media);
        }

    }

}
