/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.pronosticos.errores;

/**
 *
 * @author alpocr
 */
public class ErrorCuadraticoMedia implements ICalcularErrores {

    private double x;
    private double p;
    private double n;

    /**
     * Constructor
     */
    public ErrorCuadraticoMedia() {
    }

    public ErrorCuadraticoMedia(double x, double p, double n) {
        this.x = x;
        this.p = p;
        this.n = n;
        calcularError();
    }

    /**
     *
     * @return el resultado del error cuadratico de la media
     */
    @Override
    public double calcularError() {
        double error = 0;

        for (int i = 1; i <= getN(); i++) {
            error += Math.pow((getX() - getP()) / getX(), 2);
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
     * @param p the p to set
     */
    public void setP(double p) {
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
