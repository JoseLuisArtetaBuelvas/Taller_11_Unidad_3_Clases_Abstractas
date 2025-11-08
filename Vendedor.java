public class Vendedor extends Empleado{
    private double salarioFinalEmpleado;
    private double bono;
    private double salario;

    public Vendedor(String nombre, int anosTrabajados, double salario, double bono) {
        super(nombre, anosTrabajados);
        this.salario = salario;
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        salarioFinalEmpleado = salario + bono;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " Años Trabajados: " + anosTrabajados + " Salario Empleado: " + salarioFinalEmpleado);
    }

    @Override
    public void anosTrabajados() {
        System.out.println("Los años trabajados del Vendedor son " + anosTrabajados);
    }
}
