/*Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todas las residencias que tienen descuento.
 */
package Servicios;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4Estrellas;
import Entidades.Hotel5Estrellas;
import Entidades.Hoteles;
import Entidades.Residencias;
import java.util.ArrayList;
import java.util.Scanner;

public class ServivciosExtra3 {

    Scanner leer = new Scanner(System.in);
    ArrayList<Alojamiento> alojamientos = new ArrayList<>();
    int cont = 0;

    public void crearHoteles() {
        Hotel4Estrellas h1 = new Hotel4Estrellas('B', "la corzuela", 100, 40, 80, 10, 4000d, "Hotel Sheraton", "san martin 229", "san miguel de tucuman", "juan perez");
        Hotel5Estrellas h2 = new Hotel5Estrellas('A', "la querencia", 200, 5, 20, 10, 100, 200, 5, 8000d, "Hotel Hilton", "24 de septiembre 1061", "yerba buena", "pedro albornoz");
        Camping c1 = new Camping(200, 10, true, true, 1000, "Camping El siambon", "ruta 9 km 95", "raco", "julian alvarez");
        Residencias r1 = new Residencias(20, false, false, false, 400d, "Residencia Las cortaderas", "25 de mayo 452", "tafi del valle", "martin machado");
        alojamientos.add(h1);
        alojamientos.add(h2);
        alojamientos.add(c1);
        alojamientos.add(r1);

    }
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todas las residencias que tienen descuento.

    public void mostrarAlojamientos() {
        System.out.println("ingrese la opcion deseada: ");
        System.out.println("1- mostrar todos los alojamientos disponibles");
        System.out.println("2- mostrar los hoteles del mas caro al mas barato");
        System.out.println("3- mostrar los camping con restaurante");
        System.out.println("4-mostrar las residencias que tienen descuentos");
        String respuesta = leer.next();
        switch (respuesta) {
            case "1":
                System.out.println("los alojamientos disponibles son: ");
                for (Alojamiento alojamiento : alojamientos) {
                    System.out.print("-" + alojamiento.getNombre());
                    System.out.println(" ");

                }
                break;
            case "2":
                for (Alojamiento alojamiento : alojamientos) {
                    if (alojamiento instanceof Hotel4Estrellas) {
                        Hotel4Estrellas object = (Hotel4Estrellas) alojamiento;
                        System.out.println("El precio del " + object.getNombre() + " por noche es de: " + object.precioNoche());
                    }
                    if (alojamiento instanceof Hotel5Estrellas) {
                        Hotel5Estrellas object = (Hotel5Estrellas) alojamiento;
                        System.out.println("El precio del " + object.getNombre() + " por noche es: " + object.precioNoche());
                    }
                }
                break;
//                calcular precios

            case "3":
//                mostrar los campings con restaurant
                System.out.println("Camping con restaurante: ");
                for (Alojamiento alojamiento : alojamientos) {
                    if (alojamiento instanceof Camping) {
                        Camping object = (Camping) alojamiento;
                        if (object.isRestaurante() == true) {
                            System.out.println("-" + object.getNombre());
                            cont++;
                        }
                    }
                }
                if (cont > 0) {

                } else {
                    System.out.println("no hay");
                }
                break;
            case "4":
                int cont1=0;
                System.out.println("Residencias con descuento para gremio: ");
                for (int i = 0; i < alojamientos.size(); i++) {
                    if (alojamientos.get(i) instanceof Residencias) {
                        Residencias object = (Residencias) alojamientos.get(i);
                        if (object.isDescuentoGremio() == true) {
                            System.out.println("-" + object.getNombre());
                            cont1++;
                        }
                    }
                }
                if (cont1 > 0) {

                } else {
                    System.out.println("no hay");
                }
//                mostrar residencias con descuento

        }

    }
}
