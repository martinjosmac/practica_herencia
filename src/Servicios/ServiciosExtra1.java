/*
 */
package Servicios;

import Entidades.Alquileres;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Veleros;
import Entidades.YatesLujo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ServiciosExtra1 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Barco> barcos = new ArrayList<>();
    Alquileres n1 = new Alquileres();

    public ArrayList<Barco> crearBarcos() {

        Barco v1 = new Veleros(2, "ert158", 30, 1995);
        Barco v2 = new Veleros(3, "xv456", 40, 2017);
        Barco v3 = new Veleros(5, "poi789", 60, 2020);
        Barco bm1 = new BarcoMotor(150.0, "btc159", 15, 1970);
        Barco bm2 = new BarcoMotor(250.0, "eth753   ", 25, 2010);
        Barco bm3 = new BarcoMotor(200.0, "dgc", 23, 2019);
        Barco yl1 = new YatesLujo(5, 300d, "rfv147", 15, 1995);
        Barco yl2 = new YatesLujo(10, 350d, "plm429", 20, 1998);
        Barco yl3 = new YatesLujo(15, 500d, "zer852", 45, 2021);

        barcos.add(v1);
        barcos.add(v2);
        barcos.add(v3);
        barcos.add(bm1);
        barcos.add(bm2);
        barcos.add(bm3);
        barcos.add(yl1);
        barcos.add(yl2);
        barcos.add(yl3);
        return barcos;

    }
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado
//con la fecha de alquiler y devolución), por un valor módulo de cada barco
//(obtenido simplemente multiplicando por 10 los metros de eslora).
//En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
//modulo normal y sumándole el atributo particular de cada barco. En los veleros
//se suma el número de mástiles, en los barcos a motor se le suma la potencia en
//CV y en los yates se suma la potencia en CV y el número de camarotes.
//Utilizando la herencia de forma apropiada, deberemos programar en Java, las
//clases y los métodos necesarios que permitan al usuario elegir el barco que
//quiera alquilar y mostrarle el precio final de su alquiler.

//public String nombrCliente;
//    public Long dni;
//    public Date alquilerFechaInicio;
//    public Date devolucion;
//    public int posicionAmarre;
//    public List<Barco> barcoAmarrado;
    public void alquilerAmarre() {

        System.out.println("ingrese datos del barco q desea amarrar");
        n1.setAlquiler(new Date());

        System.out.println("fecha de inicio " + n1.getAlquiler().toLocaleString());

        System.out.println("ingrese la fecha de salida");

        System.out.println("ingrese dia");
        int dia = leer.nextInt();
        System.out.println("ingrese mes");
        int mes = leer.nextInt();
        System.out.println("ingrese año");
        int anio = leer.nextInt();
        n1.setDevolucion(new Date(anio - 1900, mes - 1, dia));

        System.out.println("fecha de salida " + n1.getDevolucion().toGMTString());

        System.out.println("ingrese en q muelle quiere amarrar el barco");
        n1.setPosicionAmarre(leer.nextInt());
        System.out.println("la posicion de amarre es: " + n1.getPosicionAmarre());

        System.out.println("ingrese cual es la matricula del barco q desea amarrar");
        String matricula = leer.next();
        int cont = 0;
        for (int i = 0; i < barcos.size(); i++) {

            if (matricula.equalsIgnoreCase(barcos.get(i).getMatricula())) {
                System.out.println(barcos.get(i));

                if (barcos.get(i) instanceof Veleros) {
                    Veleros object = (Veleros) barcos.get(i);
                    double alquilerAPagar = diasAlquiler() * ((barcos.get(i).getEslora() + ((Veleros) barcos.get(i)).getMastiles()) * 10);
                    System.out.println("el alquiler a pagar es de: " + alquilerAPagar);

                }
                if (barcos.get(i) instanceof BarcoMotor) {
                    BarcoMotor object = (BarcoMotor) barcos.get(i);
                    double alquilerAPagar = diasAlquiler() * ((barcos.get(i).getEslora() + ((BarcoMotor) barcos.get(i)).getCV()) * 10);

                    System.out.println("asd" + alquilerAPagar);
                }
                if (barcos.get(i) instanceof YatesLujo) {
                    YatesLujo object = (YatesLujo) barcos.get(i);
                    double alquilerAPagar = diasAlquiler() * ((barcos.get(i).getEslora() + (((YatesLujo) barcos.get(i)).getCV()) + ((YatesLujo) barcos.get(i)).getNroCamarotes()) * 10);
                    System.out.println("alquiler a pagar " + alquilerAPagar);
                }

            } else {
                cont++;

            }
        }
        if (cont == barcos.size()) {
            System.out.println("el barco no existe");
        }
//        for (Barco aux : barcos) {
//            if (aux instanceof Veleros) {
//                Veleros object = (Veleros) aux;
//                double alquilerAPagar = costoAlquiler() * ((aux.getEslora() + ((Veleros) aux).getMastiles()) * 10);
//                System.out.println("el alquiler a pagar es de: " + alquilerAPagar);
//            }
//
//        }

    }
    int totalDias;

    public double diasAlquiler() {

        int años = n1.getDevolucion().getYear() - n1.getDevolucion().getYear();

        int mes = n1.getDevolucion().getMonth() - n1.getAlquiler().getMonth();

        int dias = n1.getDevolucion().getDay() - n1.getAlquiler().getDay();

        totalDias = dias + (mes * 30) + (años * 12 * 30);

        return totalDias;

    }
}
