/*En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
 */
package Entidades;

public class AlojamientoExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected double m2;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, double m2, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.m2 = m2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

}
