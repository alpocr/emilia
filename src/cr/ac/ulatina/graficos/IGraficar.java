/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.graficos;

import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;

/**
 * Ésta interfaz contiene los métodos básicos para graficar.
 * @author alpocr
 */
public interface IGraficar {
    
    /**
     * Dibuja el gráfico.
     */
    JFreeChart crearGrafico(XYDataset dataset);
    
    //String getTituloGrafico();
    
    //String getTituloApp();
    
    XYDataset crearDataset();
    
    
}
