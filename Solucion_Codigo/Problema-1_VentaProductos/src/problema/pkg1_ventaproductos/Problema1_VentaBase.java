package problema.pkg1_ventaproductos;
import java.util.Scanner;

public class Problema1_VentaBase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto");
        String name = in.nextLine();
        System.out.println("Ingrese precio del producto");
        double price = in.nextDouble();
        System.out.println("Ingrese cantidad del producto");
        int quant = in.nextInt();
        
        Problema1_VentaEjecutor productito = new Problema1_VentaEjecutor(name, price, quant);
        
        productito.calcularDescuento(price, quant);
        productito.calcularPrecioFinal( price, quant, productito.getDescuento());
        
        System.out.println(productito.toString()); 
    }
}

