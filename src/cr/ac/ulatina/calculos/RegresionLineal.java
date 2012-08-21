/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.calculos;

import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * Esta clase aplica Regresion Lineal para pronosticar una serie.
 *
 * @author alpocr
 */
public class RegresionLineal extends SimpleRegression implements ISerieTiempo {

    private double x;
    private double y;

    /**
     * Constructor
     */
    public RegresionLineal() {
    }

    public RegresionLineal(double x, double y) {
        this.x = x;
        this.y = y;
        calcular();
    }

    @Override
    public double calcular() {
        SimpleRegression regresion = new SimpleRegression();
        
        regresion.addData(getX(), getY());
        
        return regresion.getIntercept() +  (regresion.getSlope() * getN());
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
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
}