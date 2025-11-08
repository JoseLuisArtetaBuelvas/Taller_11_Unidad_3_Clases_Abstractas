public class Circulo extends Figura{
    private double PI = 3.1416;
    private double radioCuadrado;
    private double area;

    public Circulo(double radioCuadrado){
        this.radioCuadrado = radioCuadrado;
    }

    @Override
    public void calcularArea(){
        double elevarRadio = Math.pow(this.radioCuadrado, 2);
        area = PI * elevarRadio;
    }

    @Override
    public void mostrarArea(){
        System.out.println("El area del circulo es: " + area);
    }
}
