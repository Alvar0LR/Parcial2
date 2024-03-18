
/**
 * Esta clase representa un sistema de gestión de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Array que almacena los empleados gestionados por el sistema.
     */
    private Empleado[] empleados;

    /**
     * Constructor para inicializar el sistema con una lista de empleados.
     * 
     * @param empleados Un array de objetos Empleado que se asignará al sistema.
     */
    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    /**
     * Método para aumentar el salario de todos los empleados en un porcentaje dado.
     * 
     * @param porcentaje El porcentaje de aumento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.salario * (1 + porcentaje / 100);
            empleado.salario = nuevoSalario;
        }
    }

    /**
     * Método para obtener la lista de empleados gestionados por el sistema.
     * 
     * @return Un array de objetos Empleado que representa la lista de empleados.
     */
    public Empleado[] getEmpleados() {
        return empleados;
    }

    /**
     * Método para establecer la lista de empleados gestionados por el sistema.
     * 
     * @param empleados Un array de objetos Empleado que se asignará al sistema.
     */
    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
}