/*
 */
package Entidades;

public class Lavadora extends Electrodomesticos {

    protected int carga;

    public Lavadora() {
    }

    public Lavadora(String color, char letra, double precio, Double peso, int carga) {
        super(color, letra, precio, peso);
        this.carga = carga;
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        System.out.println("lavadora");
        crearElectrodomestico();
        System.out.println("ingrese la carga de la lavadora");
        carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {

        super.precioFinal();//2000

        if (carga > 30) {
            precio = precio + 500;
        }

    }

    @Override
    public String toString() {
        return "el precio de la lavadora es: $" + precio + " y su color es: " + color;
    }

}
