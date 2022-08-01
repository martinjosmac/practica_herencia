/*
 */
package Entidades;

public class BarcoMotor extends Barco implements CalculoAlquilerBarco {

    protected Double CV;

    public BarcoMotor() {
    }

    public BarcoMotor(Double CV, String matricula, double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;
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
        return "BarcoMotor{" + "CV= " + CV + " matricula= " + matricula + ", eslora= " + eslora + ", anioFabricacion= " + anioFabricacion + '}';
    }

    @Override
    public double calculoAlquiler() {
        return 0;
    }

}
