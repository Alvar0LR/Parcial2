/**
 * La clase Empleado representa a un empleado con su nombre, cargo y salario.
 */
class Empleado {
    /** Nombre del empleado */
    String nombre;
    /** Cargo del empleado */
    String cargo;
    /** Salario del empleado */
    double salario;

    /**
     * Constructor para crear un nuevo objeto Empleado.
     * 
     * @param nombre  El nombre del empleado.
     * @param cargo   El cargo del empleado.
     * @param salario El salario del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Método para aumentar el salario de un empleado en un porcentaje dado.
     * 
     * @param porcentaje El porcentaje de aumento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        salario *= (1 + porcentaje / 100);
    }

    /**
     * Devuelve una representación en forma de cadena del objeto Empleado.
     * 
     * @return Una cadena que representa al empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}

/**
 * La clase Empleados gestiona una lista de objetos Empleado.
 */
class Empleados {
    /** Array que almacena la lista de empleados */
    private Empleado[] lista;

    /**
     * Constructor para inicializar la lista de empleados.
     * 
     * @param lista Un array de objetos Empleado.
     */
    public Empleados(Empleado[] lista) {
        this.lista = lista;
    }

    /**
     * Método para mostrar los detalles de todos los empleados en la lista.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Método para aumentar el salario de todos los empleados en la lista en un
     * porcentaje dado.
     * 
     * @param porcentaje El porcentaje de aumento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            empleado.aumentarSalario(porcentaje);
        }
    }

    /**
     * Método estático para crear una nueva instancia de la clase Empleados con una
     * lista predefinida de empleados.
     * 
     * @return Una nueva instancia de Empleados con una lista predefinida de
     *         empleados.
     */
    public static Empleados darAltaEmpleados() {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);
        return new Empleados(empleados);
    }

    /**
     * Método para obtener la lista de empleados.
     * 
     * @return Un array de objetos Empleado que representa la lista de empleados.
     */
    public Empleado[] getLista() {
        return lista;
    }

    /**
     * Método para establecer la lista de empleados.
     * 
     * @param lista Un array de objetos Empleado que se asignará como la nueva lista
     *              de empleados.
     */
    public void setLista(Empleado[] lista) {
        this.lista = lista;
    }
}
