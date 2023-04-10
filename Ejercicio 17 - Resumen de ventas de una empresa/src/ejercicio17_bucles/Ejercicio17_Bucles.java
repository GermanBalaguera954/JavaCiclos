/*
Ejercicio17: Una empresa que se dedica a la venta de desinfectantes necesita un programa
para gestionar las facturas. En cada factura figura: el codigo del articulo, la cantidad vendida
en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturacion total, cantidad
en litros vendidos del articulo 1 y cuantas facturas se emitieron de mas de $600.
 */
package ejercicio17_bucles;

import javax.swing.JOptionPane;

public class Ejercicio17_Bucles {

    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMayor600 = 0;
        float precioLitro, importeFactura, facturacionTotal = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite el cantida: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N°" + i + "\nDigite el precio por litro: "));

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
        System.out.println("Facturacion total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600 dolares: "+conteoMayor600);
    }
}
