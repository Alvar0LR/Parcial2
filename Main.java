public static void main(String[] args) {
    Empleado[] empleados = new Empleado[3];
    empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
    empleados[1] = new Empleado("María", "Diseñadora", 45000);
    empleados[2] = new Empleado("Pedro", "Gerente", 60000);

    SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(empleados);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduzca el porcentaje de aumento de salario: ");
    double porcentaje = scanner.nextDouble();

    sistema.aumentarSalario(porcentaje);

    System.out.println("Lista de Empleados:");
    for (Empleado empleado : empleados) {
        System.out.println(empleado);
    }

    scanner.close();
}
