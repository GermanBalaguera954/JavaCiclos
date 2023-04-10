/*
Ejercicio13: Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de los numeros 
negativos y la cantidad de ceros.
 */
package ejercicio13_bucles;

import javax.swing.JOptionPane;

public class Ejercicio13_Bucles {

    public static void main(String[] args) {
        int numero, sumaPos = 0, conteoPos = 0, sumaNeg = 0, conteoNeg = 0, conteoCeros = 0;
        float mediaPos, mediaNeg;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

            if (numero == 0) { //si el numero es cero
                conteoCeros++; // aumentamos en 1 el conteo de ceros
            } else if (numero > 0) {//si el numero es positivo.
                sumaPos += numero; //suma iterativa de positivos.
                conteoPos++;
            } else {//si el numero es negativo.
                sumaNeg += numero;
                conteoNeg++;
            }
        }

        //tratamos con los positivos
        if (conteoPos == 0) {
            System.out.println("No se puede sacar la media de los positivos");
        } else {
            mediaPos = (float) sumaPos / conteoPos;
            System.out.println("La media de los numeros positivos es: " + mediaPos);
        }
        //tratamos con los Negativos

        if (conteoNeg == 0) {
            System.out.println("No se puede sacar la media de los negativos");
        } else {
            mediaNeg = (float) sumaNeg / conteoNeg;
            System.out.println("La media de los numeros positivos es: " + mediaNeg);
        }

        System.out.println("La cantida de ceros es: " + conteoCeros);
    }
}
