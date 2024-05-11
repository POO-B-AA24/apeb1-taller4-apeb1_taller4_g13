package problema.pkg1_Deber;
public class Problema2_EmpleadosEjecutor {
    private String nombre;
    private double salario;
    private int edad;

    public Problema2_EmpleadosEjecutor(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario: $" + salario + ", Edad: " + edad;
    }
    public double obtenerSalario() {
        return salario;
    }
    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }
}
