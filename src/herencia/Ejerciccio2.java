/*
 */
package herencia;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

public class Ejerciccio2 {

    public static void main(String[] args) {
//
//        Lavadora n1 = new Lavadora();
//        n1.crearLavadora();
//        n1.precioFinal();
//        System.out.println(n1);
//        Televisor q1=new Televisor();
//        q1.crearTelevisor();
//        q1.precioFinal();
//        System.out.println(q1);
        ArrayList<Electrodomesticos> varios = new ArrayList<>();
        Lavadora l1 = new Lavadora("azul", 'a', 1000, 15d, 10);
        Lavadora l2 = new Lavadora("blanco", 'f', 1000, 25d, 25);
        Televisor t1 = new Televisor(45d, true, "gris", 'e', 45d, 1000);
        Televisor t2 = new Televisor(35d, false, "rojo", 'd', 30d, 1000);

        varios.add(t1);
        varios.add(t2);
        varios.add(l1);
        varios.add(l2);
//con este for llamo el metodo precio final para todos los elementos
        for (int i = 0; i < varios.size(); i++) {
            varios.get(i).precioFinal();
        }
        double suma = 0;

        for (int i = 0; i < varios.size(); i++) {
            suma = suma + varios.get(i).getPrecio();
        }
        System.out.println("Total de los electrodomesticos comprados es de:  " + suma);

        System.out.println("--------------------");
//for para mostrar todos los elementos
        for (int i = 0; i < varios.size(); i++) {
            System.out.println(varios.get(i));
        }
    }

}
