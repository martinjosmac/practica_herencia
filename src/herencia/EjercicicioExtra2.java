/*Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas.
 */
package herencia;

import Entidades.Edificios;
import Entidades.EdificioDeOficina;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class EjercicicioExtra2 {

    public static void main(String[] args) {
        ArrayList<Edificios> misEdi = new ArrayList<>();
        Edificios p1 = new Polideportivo("complejo avellaneda", true, 1000d, 10d, 2500d);
        Edificios p2 = new Polideportivo("complejo azucena  ", false, 500d, 8d, 2000d);
        Edificios e1 = new EdificioDeOficina(10, 20, 4, 100d, 50d, 40d);
        Edificios e2 = new EdificioDeOficina(5, 10, 7, 100d, 50d, 40d);
        misEdi.add(p1);
        misEdi.add(p2);
        misEdi.add(e1);
        misEdi.add(e2);
        for (int i = 0; i < misEdi.size(); i++) {

            if (misEdi.get(i) instanceof EdificioDeOficina) {
                EdificioDeOficina object = (EdificioDeOficina) misEdi.get(i);
                object.calcularSuperficie();
                object.calcularVolumen();
                System.out.println("Edificio: " + object + " " + object.cantidadPersonas());
            }
            if (misEdi.get(i) instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) misEdi.get(i);
                System.out.println("la superficie del polideportivo " + object.getNombre() + " es " + object.calcularSuperficie());
                System.out.println("el volumen del polideportivo " + object.getNombre() + " es " + object.calcularVolumen());
                System.out.println("el polideportivo " + object.getNombre() + " es techado " + object.isTechado());
            }
        }
    }

}
