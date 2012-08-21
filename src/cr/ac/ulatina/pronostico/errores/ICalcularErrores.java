/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.pronostico.errores;

/**
 * En ésta interfaz se definen los métodos necesarios para calcular
 * los errores en una serie.
 * 
 * @author alpocr
 */
public interface ICalcularErrores {
    
    /**
     * Se invoca al método para calcular el error en una serie de datos
     * y mejor su efectividad.
     * @return 
     */
    double calcularError();
    
}
