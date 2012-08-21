/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.pronosticos.errores;

/**
 *
 * @author alpocr
 */
public class ErrorAbsolutoPorcentualMedia implements ICalcularErrores {

    private double x;
    private double p;
    private double n;

    /**
     * Constructor
     */
    public ErrorAbsolutoPorcentualMedia() {
    }

    public ErrorAbsolutoPorcentualMedia(double x, double p, double n) {
        this.x = x;
        this.p = p;
        this.n = n;
        calcularError();
    }

    /**
     *
     * @return el resultado del error absoluto porcentual de la media
     */
    @Override
    public double calcularError() {
        double error = 0;
        
        for (int i = 1; i <= getN(); i++) {
            error += getX()-getP()/getX();
        }
        
        return (error*100)/getN();
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getP() {
        return p;
    }

    /**
     * @param y the y to set
     */
    public void setP(double y) {
        this.p = p;
    }

    /**
     * @return the n
     */
    public double getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(double n) {
        this.n = n;
    }
}
