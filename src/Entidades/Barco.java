/*Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
 */
package Entidades;


public class Barco implements CalculoAlquilerBarco {

    protected String matricula;
    protected double eslora;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
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
        return "Barco{" + "matricula= " + matricula + ", eslora= " + eslora + ", anioFabricacion= " + anioFabricacion  + '}';
    }

    @Override
    public double calculoAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
