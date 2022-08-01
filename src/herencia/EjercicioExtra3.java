/*
 */
package herencia;

import Servicios.ServivciosExtra3;
import java.util.Scanner;

public class EjercicioExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "null";
        ServivciosExtra3 sx3 = new ServivciosExtra3();
        sx3.crearHoteles();
        do {
            sx3.mostrarAlojamientos();
            System.out.println("repertir opciones (s/n)");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s"));
    }
}
