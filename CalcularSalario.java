public class CalcularSalario {
    public static void main(String[] args) {
        //Error al instanciar clase abstracta
        //Empleado empleado = new Empleado() {}
        Vendedor vendedor = new Vendedor("Stefany",5,2000000, 200000);
        vendedor.calcularSalario();
        vendedor.mostrarDetalles();
        Gerente gerente = new Gerente("Jose Arteta", 10,4000000, 400000);
        gerente.calcularSalario();
        gerente.mostrarDetalles();
    }
}
