/*
 */
package Entidades;

public class Rectangulo implements CalculoFormas {
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2

    public double base;
    public double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
    @Override
    public double calculoPerimetro() {

        double perimetro = base * altura;
        return perimetro;
    }

    @Override
    public double calculoArea() {
        double area = (base + altura) * 2;
        return area;
    }

}
