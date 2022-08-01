/*
 */
package Entidades;

public class Polideportivo extends Edificios {

    protected String nombre;
    protected boolean techado;

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo(String nombre, boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {

        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public double calcularSuperficie() {
        double superficie = largo * ancho;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = alto * ancho * largo;
        return volumen;
    }

}
