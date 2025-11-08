public class Gerente extends Empleado{
    private double salario;
    private double bono;
    private double salarioFinalGerente;

    Gerente(String nombre, int anosTrabajados, double salario, double bono) {
        super(nombre, anosTrabajados);
        this.salario = salario;
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        salarioFinalGerente = salario + bono;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + " Años Trabajados: " + anosTrabajados + " Salario Empleado: " + salarioFinalGerente);
    }

    @Override
    public void anosTrabajados() {
        System.out.println("Los años trabajados del Gerente son " + anosTrabajados);
    }
}
