/*para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones.
 */
package Entidades;

public class Camping extends AlojamientoExtraHotelero {

    protected int capacidadMaxCarpas;
    protected int cantidadBaños;
    protected boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaxCarpas, int cantidadBaños, boolean restaurante, boolean privado, double m2, String nombre, String direccion, String localidad, String encargado) {
        super(privado, m2, nombre, direccion, localidad, encargado);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantidadBaños = cantidadBaños;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(int cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }


}
