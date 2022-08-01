/* Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones. 
 */
package Entidades;

public class Hotel4Estrellas extends Hoteles implements PrecioHabitacion {

    protected char gimnasio;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(char gimnasio, String nombreRestaurant, int capacidadRestaurant, int nroHabitaciones, int nroCamas, int nroPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(nroHabitaciones, nroCamas, nroPisos, precioHabitaciones, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public char isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    int x, g, l;

    @Override
    public double precioNoche() {
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas.
//• $50 si es mayor de 50.
//• $50 si el tipo del gimnasio es A.
//• $30 si el tipo del gimnasio es B.
//• $15 por la cantidad de limosinas del hotel.
        if (capacidadRestaurant < 30) {
            x = 10;
        } else if (capacidadRestaurant > 30 && capacidadRestaurant < 50) {
            x = 30;
        } else if (capacidadRestaurant > 50) {
            x = 50;
        }
        if (gimnasio == 'A') {
            g = 50;
        } else if (gimnasio == 'B') {
            g = 30;
        }
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
//restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
        double costoNoche = 50 + (1 * nroCamas) + (x) + (g);
        return costoNoche;
    }

}
