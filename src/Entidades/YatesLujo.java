/*
 */
package Entidades;

import java.util.Date;

public class YatesLujo extends BarcoMotor implements CalculoAlquilerBarco {

    protected Integer nroCamarotes;

    public YatesLujo() {
    }

    public YatesLujo(Integer nroCamarotes, Double CV, String matricula, double eslora, Integer anioFabricacion) {
        super(CV, matricula, eslora, anioFabricacion);
        this.nroCamarotes = nroCamarotes;
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    public Double getCV() {
        return CV;
    }

    public void setCV(Double CV) {
        this.CV = CV;
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
        return "YatesLujo{" + "nroCamarotes= " + nroCamarotes + " CV= " + CV + " matricula= " + matricula + ", eslora= " + eslora + ", anioFabricacion= " + anioFabricacion + '}';

    }

    @Override
    public double calculoAlquiler() {
        return 0;

    }
}
