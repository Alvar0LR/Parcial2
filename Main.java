import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleados empleados = Empleados.darAltaEmpleados();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println("Lista de Empleados:");
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
