package problema.pkg1_Deber;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema2_Empleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Problema2_EmpleadosEjecutor> empleados = new ArrayList<>();
        boolean salir = false;

        do {
            System.out.println("\nSeleccione opcion:");
            System.out.println("1. Añadir empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento salarial");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del empleado:");
                    String nomb = scanner.nextLine();

                    System.out.println("Ingrese el salario del empleado:");
                    double sala = scanner.nextDouble();

                    System.out.println("Ingrese la edad del empleado:");
                    int edad = scanner.nextInt();

                    Problema2_EmpleadosEjecutor empleado = new Problema2_EmpleadosEjecutor(nomb, sala, edad);
                    empleados.add(empleado);
                    System.out.println("Empleado agregado correctamente.");
                    break;

                case 2:
                    System.out.println("Información de los empleados:");
                    for (Problema2_EmpleadosEjecutor emp : empleados) {
                        System.out.println(emp.toString());
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el porcentaje de aumento salarial:");
                    double porcentajeAumento = scanner.nextDouble();
                    double salarioPromedio = calcularSalarioPromedio(empleados);
                    for (Problema2_EmpleadosEjecutor emp : empleados) {
                        if (emp.obtenerSalario() < salarioPromedio) {
                            emp.aumentarSalario(porcentajeAumento);
                            System.out.println("Nuevo salario de " + emp.toString());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Chao");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida, intentar de nuevo.");
            }
        } while (!salir); 
    }

    public static double calcularSalarioPromedio(ArrayList<Problema2_EmpleadosEjecutor> empleados) {
        double totalSalarios = 0;
        for (Problema2_EmpleadosEjecutor emp : empleados) {
            totalSalarios += emp.obtenerSalario();
        }
        return totalSalarios / empleados.size();
    }
}

