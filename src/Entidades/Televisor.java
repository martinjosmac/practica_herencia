/*Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
 */
package Entidades;

public class Televisor extends Electrodomesticos {

    protected double resolucion;
    protected boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, String color, char letra, Double peso, double precio) {
        super(color, letra, precio, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.println("ingrese definicion del televisor");
        resolucion = leer.nextDouble();
        System.out.println("¿tiene su televisor un sintonizador tdt?(s/n)");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("S")) {
            sintonizadorTDT = true;
        } else {
            sintonizadorTDT = false;
        }
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
     */
    public void precioFinal() {
        super.precioFinal(); 
        if (resolucion > 40) {
            precio = precio + (precio * 0.3);
        }
        if (sintonizadorTDT == true) {
            precio = precio + 500;
        }
    }

    @Override
    public String toString() {
        return "precio final del televisor es: $" + precio + " y su color es " + color;
    }

}
