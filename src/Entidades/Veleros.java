/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

public class Veleros extends Barco implements CalculoAlquilerBarco {

    protected Integer mastiles;

    public Veleros() {

    }

    public Veleros(Integer mastiles, String matricula, double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Veleros{" + "mastiles=" + mastiles + " matricula= " + matricula + ", eslora= " + eslora + ", anioFabricacion= " + anioFabricacion + '}';
    }

    @Override
    public double calculoAlquiler() {
        return 0;

    }

}
