/*tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
 */
package Entidades;

import java.util.Date;
import java.util.List;
public class Alquileres {

    public String nombrCliente;
    public Long dni;
    public Date alquilerFechaInicio;
    public Date devolucion;
    public int posicionAmarre;
    public List<Barco> barcoAmarrado;

    public Alquileres() {
    }

    public Alquileres(String nombre, Long dni, Date alquiler, Date devolucion, int posicionAmarre, List<Barco> barcoAmarrado) {
        this.nombrCliente = nombre;
        this.dni = dni;
        this.alquilerFechaInicio = alquiler;
        this.devolucion = devolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoAmarrado = barcoAmarrado;
    }

    public String getNombre() {
        return nombrCliente;
    }

    public void setNombre(String nombre) {
        this.nombrCliente = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Date getAlquiler() {
        return alquilerFechaInicio;
    }

    public void setAlquiler(Date alquiler) {
        this.alquilerFechaInicio = alquiler;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public List<Barco> getBarcoAmarrado() {
        return barcoAmarrado;
    }

    public void setBarcoAmarrado(List<Barco> barcoAmarrado) {
        this.barcoAmarrado = barcoAmarrado;
    }

    @Override
    public String toString() {
        return "Alquileres{" + "nombrCliente=" + nombrCliente + ", dni=" + dni + ", alquilerFechaInicio=" + alquilerFechaInicio + ", devolucion=" + devolucion + ", posicionAmarre=" + posicionAmarre + ", barcoAmarrado=" + barcoAmarrado + '}';
    }

}
