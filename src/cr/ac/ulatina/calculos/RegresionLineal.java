/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.calculos;

import java.util.List;

/**
 * Esta clase aplica Regresion Lineal para pronosticar una serie.
 * @author alpocr
 */
public class RegresionLineal implements ICalcularSerie{
    
    private List<Double> x;
    private List<Double> y;
    private int n;
    

    /**
     * Constructor
     */
    public RegresionLineal(){
        
    }
    
    @Override
    public double calcular() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public double calcularPendiente(){
        
        
        return 0;
    }
    
    public double calcularIntercepcion(){
        
        
        return 0;
    }


    
}
