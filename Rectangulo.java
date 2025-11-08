public class Rectangulo extends Figura{
    private double base;
    private double altura;
    private double area;
    public  Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea(){
        area = base*altura;
    }

    @Override
    public void mostrarArea(){
        System.out.println("El area del Rectangulo es: " + area);
    }
}
