/*
 */
package Entidades;

import java.util.Scanner;

public class Electrodomesticos {
//atributos precio, color, consumo energético (letras entre A y F) y peso.

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String color;
    protected Double precio = 1000.0;
    protected char letra;
    protected Double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(String color, char letra, double precio, Double peso) {

        this.color = color;
        this.letra = letra;
        this.precio = precio;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public char getConsumoEnergetico() {
        return letra;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.letra = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
     */
    public void comprobarConsumoEnergetico(char letra) {
        if (letra != 'a' && letra != 'b' && letra != 'c' && letra != 'd' && letra != 'e' && letra != 'f') {
            this.letra = 'f';

        } else {
            this.letra = letra;

        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
     */
    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            this.color = "blanco";

        } else {
            this.color = color;
        }
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
     */
    //precio, color, consumo energético (letras entre A y F) y peso
    public void crearElectrodomestico() {
        System.out.println("ingrese el color del electrodomestico");
        color = leer.next();
        comprobarColor(color);
        System.out.println("ingrese la letra de consumo");
        letra = leer.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        System.out.println("ingrese el peso");
        peso = leer.nextDouble();
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:
     */
    public void precioFinal() {

        switch (letra) {
            case 'a':
                precio += 1000;
                break;
            case 'b':
                precio += 800;
                break;
            case 'c':
                precio += 600;
                break;
            case 'd':
                precio += 500;
                break;
            case 'e':
                precio += 300;
                break;
            case 'f':
                precio += 100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        }
        if (peso >= 20 && peso <= 49) {
            precio += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precio += 800;
        }
        if (peso >= 80) {
            precio += 1000;
        }
    }
}
