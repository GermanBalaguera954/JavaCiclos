package ciclo_dowhile;

import java.util.Scanner;

public class Ciclo_dowhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Digite la cantidad de numeros: ");
        contador = entrada.nextInt();

        do {
            System.out.println(i);
            i++;
        } while (i <= contador);
    }

}
