/*
 */
package Entidades;

public class EdificioDeOficina extends Edificios {

    protected int nroOficinas;
    protected int nroPisos;
    protected int qPersonasOfi;

    public EdificioDeOficina() {
    }

    public EdificioDeOficina(int nroOficinas, int nroPisos, int qPersonasOfi, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.nroPisos = nroPisos;
        this.qPersonasOfi = qPersonasOfi;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    public int getqPersonasOfi() {
        return qPersonasOfi;
    }

    public void setqPersonasOfi(int qPersonasOfi) {
        this.qPersonasOfi = qPersonasOfi;
    }

    @Override
    public double calcularSuperficie() {
        double superficie = ancho * largo * nroPisos;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = ancho * alto * largo;
        return volumen;
    }

    public String cantidadPersonas() {
        double total = qPersonasOfi * nroPisos * nroOficinas;
        double totalPorPiso = qPersonasOfi * nroOficinas;
        return "total de personas en el edificio: " + total + "total personas por piso: " + totalPorPiso;
    }
}
