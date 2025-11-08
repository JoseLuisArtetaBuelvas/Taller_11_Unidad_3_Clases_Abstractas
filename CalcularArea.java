//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalcularArea {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(30);
        circulo.calcularArea();
        circulo.mostrarArea();
        Rectangulo rectangulo = new Rectangulo(40, 20);
        rectangulo.calcularArea();
        rectangulo.mostrarArea();
    }
}