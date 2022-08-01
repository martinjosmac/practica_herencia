/*se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package herencia;

import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        Circulo c1 = new Circulo();

        System.out.println("ingrese el radio del circulo: ");

        c1.setRadio(leer.nextDouble());

        System.out.println("el area del circulo: " + c1.calculoArea());

        System.out.println("el perimetro circulo: " + c1.calculoPerimetro());

        Rectangulo r1 = new Rectangulo();

        System.out.println("ingrese la base del rectangulo");

        r1.setBase(leer.nextFloat());

        System.out.println("ingrese la altura del rectangulo");

        r1.setAltura(leer.nextFloat());

        System.out.println("area rectangulo: " + r1.calculoArea());

        System.out.println("perimetro rectangulo: " + r1.calculoPerimetro());
    }

}
