/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.graficos;

import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;

/**
 * Esta clase contiene todo lo relacionado con los gráficos de dispersión.
 *
 * @author alpocr
 */
public class GraficoDispersion implements IGraficar {

    /**
     * Constructor
     */
    public GraficoDispersion() {
    }

    @Override
    public XYDataset crearDataset() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public JFreeChart crearGrafico(XYDataset dataset) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
