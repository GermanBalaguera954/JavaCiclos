/*
Ejercicio18: Hacer unas modificaciones al ejercicio anterior suponiendo que no introduce el precio
por litro. Solo existen tres productos con precio.
1- 0.6/litro
2- 3 /litro
3- 1.25/litro

 */
package ejercicio18_bucles;

import javax.swing.JOptionPane;

public class Ejercicio18_Bucles {

    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMayor600 = 0;
        float precioLitro = 0, importeFactura, facturacionTotal = 0;

        for (int i = 1; i <= 5; i++) {

            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite el codigo: "));
            } while (codigo < 1 || codigo > 3);
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite el cantida: "));

            switch (codigo) {

                case 1:
                    precioLitro = 0.6f;
                    break;
                case 2:
                    precioLitro = 3f;
                    break;
                case 3:
                    precioLitro = 1.25f;
                    break;
            }

            importeFactura = (float) litros * precioLitro; //Importe por factura.
            facturacionTotal += importeFactura; // Suma iterativa de las facturas.

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600) {
                conteoMayor600++;
            }
        }
        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total: " + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600 dolares: " + conteoMayor600);
    }

}
