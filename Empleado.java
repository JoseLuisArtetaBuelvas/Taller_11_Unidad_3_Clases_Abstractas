public abstract class Empleado {
    protected String nombre;
    protected int anosTrabajados;

    public Empleado(String nombre, int anosTrabajados) {
        this.nombre = nombre;
        this.anosTrabajados = anosTrabajados;
    }
    public abstract void calcularSalario();
    public abstract void mostrarDetalles();
    public void anosTrabajados(){}
    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }
}
