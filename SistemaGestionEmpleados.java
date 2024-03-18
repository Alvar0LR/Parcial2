public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.salario * (1 + porcentaje / 100);
            empleado.salario = nuevoSalario;
        }
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
}
