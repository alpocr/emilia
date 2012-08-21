 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.graficos;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.data.time.*;
import org.jfree.data.xy.XYDataset;

/**
 * Esta clase contiene todo lo relacionado con los graficos lineales.
 *
 * @author alpocr
 */
public class GraficoLineal extends JFrame implements IGraficar {

    private String tituloApp;
    private String tituloGrafico;
    private String tituloEjeX;
    private String titutloEjeY;
    private List<Double> lista;

    /**
     * Constructor vacio
     */
    public GraficoLineal() {
    }

    /**
     * 
     * @param tituloApp el titulo de la aplicacion
     * @param tituloGrafico el titulo del grafico
     * @param tituloEjeX el titulo del eje X
     * @param titutloEjeY el titulo del eje Y
     * @param lista la lista
     * @throws HeadlessException 
     */
    public GraficoLineal(String tituloApp, String tituloGrafico, String tituloEjeX, String titutloEjeY, List<Double> lista) throws HeadlessException {
        this.tituloApp = tituloApp;
        this.tituloGrafico = tituloGrafico;
        this.tituloEjeX = tituloEjeX;
        this.titutloEjeY = titutloEjeY;
        this.lista = lista;
        this.tituloApp = tituloApp;
        this.tituloGrafico = tituloGrafico;
        this.tituloEjeX = tituloEjeX;
        this.titutloEjeY = titutloEjeY;
        XYDataset dataset = crearDataset();
        JFreeChart grafico = crearGrafico(dataset);
        ChartPanel panel = new ChartPanel(grafico);
        panel.setPreferredSize(new Dimension(500, 270));
        panel.setMouseZoomable(true, false);
        setContentPane(panel);
    }

    /**
     * @return the tituloApp
     */
    public String getTituloApp() {
        return tituloApp;
    }

    /**
     * @param tituloApp the tituloApp to set
     */
    public void setTituloApp(String tituloApp) {
        this.tituloApp = tituloApp;
    }

    /**
     * @return the tituloGrafico
     */
    public String getTituloGrafico() {
        return tituloGrafico;
    }

    /**
     * @param tituloGrafico the tituloGrafico to set
     */
    public void setTituloGrafico(String tituloGrafico) {
        this.tituloGrafico = tituloGrafico;
    }

    /**
     * @return the tituloEjeX
     */
    public String getTituloEjeX() {
        return tituloEjeX;
    }

    /**
     * @param tituloEjeX the tituloEjeX to set
     */
    public void setTituloEjeX(String tituloEjeX) {
        this.tituloEjeX = tituloEjeX;
    }

    /**
     * @return the titutloEjeY
     */
    public String getTitutloEjeY() {
        return titutloEjeY;
    }

    /**
     * @param titutloEjeY the titutloEjeY to set
     */
    public void setTitutloEjeY(String titutloEjeY) {
        this.titutloEjeY = titutloEjeY;
    }

    /**
     * Recoge los datos y devuelve la coleccion.
     *
     * @return
     */
    @Override
    public XYDataset crearDataset() {
        TimeSeries serieTiempo = new TimeSeries(getTituloGrafico(), Year.class);

        for (int i = 0; i < getLista().size(); i++) {
            serieTiempo.add(new Year(i + 1), getLista().get(i));
        }
        TimeSeriesCollection tsc = new TimeSeriesCollection();
        tsc.addSeries(serieTiempo);
        return tsc;
    }

    @Override
    public JFreeChart crearGrafico(XYDataset dataset) {
        JFreeChart grafico = ChartFactory.createTimeSeriesChart(getTituloApp(), 
                getTituloEjeX(), getTitutloEjeY(), dataset, true, true, false);
        
        return grafico;
    }

    /**
     * @return the lista
     */
    public List<Double> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Double> lista) {
        this.lista = lista;
    }
}
