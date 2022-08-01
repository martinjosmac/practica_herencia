/*    
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ejercicio1 {

    public static void main(String[] args) {

        Animal per1 = new Perro("Juan", "pedigree", 4, "labrador");
        per1.alimentarse();

        Animal gat10 = new Gato("pedro", "whiskas", 8, "gatito");
        gat10.alimentarse();

        Animal cab1 = new Caballo("lobunito", "alfa", 10, "peruano");
        cab1.alimentarse();
    }

}
