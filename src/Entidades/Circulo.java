/*
 */
package Entidades;

public class Circulo implements CalculoFormas {
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2

    public double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Perímetro circulo: PI * diámetro.
    @Override
    public double calculoPerimetro() {
        double perimetro = (float) (pi * (radio * 2));
        return perimetro;
    }

    @Override
    public double calculoArea() {
        double area = (float) (pi * (radio * radio));
        return area;
    }

}
