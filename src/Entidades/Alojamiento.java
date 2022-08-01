/*Los alojamientos se
identifican por un nombre, una dirección, una localidad y un gerente encargado
del lugar.
 */
package Entidades;

public class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String encargado;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

}
