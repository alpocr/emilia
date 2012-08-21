/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.pronosticos.errores;

import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 *
 * @author alpocr
 */
public class ErrorAbsolutoMedia implements ICalcularErrores {

    private double x;
    private double p;
    private int n;

    /**
     * Constructor
     */
    public ErrorAbsolutoMedia() {
    }

    public ErrorAbsolutoMedia(double x, double p, int n) {
        this.x = x;
        this.p = p;
        this.n = n;
        calcularError();
    }



    /**
     *
     * @return el resultado del error absoluto de la media
     */
    @Override
    public double calcularError() {

        double error = 0;

        for (int i = 1; i <= getN(); i++) {
            error += Math.abs(getX()) - Math.abs(getP());
        }
        return error;
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
     * @return the p
     */
    public double getP() {
        return p;
    }

    /**
     * @param p the y to set
     */
    public void setP(double p) {
        this.p = p;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
}
