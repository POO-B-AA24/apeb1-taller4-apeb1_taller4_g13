package problema.pkg1_Deber;
import java.util.Scanner;

public class Problema1_VentaBase {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad a solicitar del producto: ");
        int cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio unitario del producto: ");
        double precio = entrada.nextDouble();

        Problema1_VentaEjecutor venta = new Problema1_VentaEjecutor(cantidad, precio);
        venta.calcularDescuento();
        venta.calcularPrecioFinal();
        System.out.println(venta);
    }
}

