import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleados empleados = Empleados.darAltaEmpleados();

        Scanner scanner = new Scanner(System.in);
        System.out.print(Magic.MENSAJE_PORCENTAJE_SALARIO);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);

        System.out.println(Magic.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        scanner.close();
    }
}
