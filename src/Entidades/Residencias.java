/*Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas.
 */
package Entidades;

public class Residencias extends AlojamientoExtraHotelero {

    protected int cantHabitaciones;
    protected boolean descuentoGremio;
    protected boolean campoDeportivo;

    public Residencias() {

    }

    public Residencias(int cantHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privado, double m2, String nombre, String direccion, String localidad, String encargado) {
        super(privado, m2, nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
//restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
        

}
