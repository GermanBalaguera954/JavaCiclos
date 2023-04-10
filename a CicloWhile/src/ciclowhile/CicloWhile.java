package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();

        while (i <= contador) {
            System.out.println(i);
            i+=2;
        }
    }
}
