/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.calculos;

/**
 * Esta clase implementa de ICalcularSerie, y acopla los métodos
 * para calcular el Promedio Simple de una serie de valores.
 * 
 * @author alpocr
 */
public class PromedioSimple implements ICalcularSerie {
    
    
    /**
     * 
     * @param lista son los valores que recibe para promediar.
     * @return el promedio simple de todos los valores.
     */
    private double calcularPromedioSimple(double lista[]){
        
        double promedio = 0;
        
        for (int i = 0; i < lista.length; i++) {
            promedio = promedio + lista[i];
        }
        
        return promedio / lista.length;
    }
    
    /**
     *
     * @return el promedio simple (a+b+c)/n
     */
    @Override
    public double calcular() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
