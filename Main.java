import java.util.Scanner;

/**
 * La clase Main es la clase principal que contiene el método main y es la
 * entrada del programa.
 * Se encarga de ejecutar la lógica principal del programa.
 */
public class Main {
    /**
     * El método main es el punto de entrada del programa.
     * Aquí se inicializa el sistema de gestión de empleados, se solicita al usuario
     * un porcentaje de aumento de salario,
     * se aumenta el salario de los empleados y se muestra la lista actualizada de
     * empleados en la consola.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             programa).
     */
    public static void main(String[] args) {
        // Inicializar el sistema de gestión de empleados con los empleados
        // predefinidos.
        Empleados empleados = Empleados.darAltaEmpleados();

        // Crear un objeto Scanner para leer la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca el porcentaje de aumento de salario.
        System.out.print(Magic.MENSAJE_PORCENTAJE_SALARIO);
        double porcentaje = scanner.nextDouble();

        // Aumentar el salario de los empleados según el porcentaje proporcionado por el
        // usuario.
        empleados.aumentarSalario(porcentaje);

        // Mostrar la lista actualizada de empleados en la consola.
        System.out.println(Magic.LISTA_EMPLEADOS);
        empleados.mostrarEmpleados();

        // Cerrar el objeto Scanner para liberar recursos.
        scanner.close();
    }
}
