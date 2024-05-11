package problema.pkg1_Deber;
public class Problema1_VentaEjecutor {



   private double prec;
    private int cant;
    private double preF;
    private double desc;

    public Problema1_VentaEjecutor(int cantidad,double precio) {
        this.prec = prec;
        this.cant = cant;
    }

    public void calcularDescuento() {

        if (this.prec >= 1000 && this.cant >= 10) {
            this.desc=(this.cant*this.prec)*0.1;
        }else{
            this.desc=(this.cant*this.prec)*0.05;
        }
    }
    
    public void calcularPrecioFinal(){
        this.preF=(this.cant*this.prec)-this.desc;
    }

    @Override
    public String toString() {
        return "Problema1_VentaProductosClaseBase{" + "precio=" + prec + ", cantidad=" + cant + ", descuento=" + desc + ", precioFin=" + preF + '}';
    }
    
    

    public double getPrecio() {
        return prec;
    }

    public void setPrecio(double precio) {
        this.prec = precio;
    }

    public int getCantidad() {
        return cant;
    }

    public void setCantidad(int cantidad) {
        this.cant = cantidad;
    }
}
