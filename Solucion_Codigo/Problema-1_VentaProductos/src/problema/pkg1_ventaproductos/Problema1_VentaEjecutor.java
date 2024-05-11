package problema.pkg1_ventaproductos;
public class Problema1_VentaEjecutor {



    private String nombre;
    private double precio;
    private int cantidad;
    private double descuento;
    private double finalPrecio;

    public Problema1_VentaEjecutor(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void calcularDescuento(double price, int quant) {
        double newPrice;
        if (price >= 1000 && quant >= 10) {

            this.descuento = price * (0.1);

        } else if (price < 1000) {

            this.descuento = price * (0.05);
        } else {
            this.descuento = 0;
        }

    }

    public double getDescuento() {
        return this.descuento;
    }

    public void calcularPrecioFinal(double price,int quant, double desc) {
        this.finalPrecio = (price*quant)-desc;
        
    }
    
    public double getPrecioFinal() {
        return this.finalPrecio;
    }
    
        @Override
    public String toString() { // String BUilderaso
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{");
        sb.append("Nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", descuento=").append(getDescuento());
        sb.append(", Precio Final=").append(getPrecioFinal());
        sb.append('}');
        return sb.toString();
    }
}
