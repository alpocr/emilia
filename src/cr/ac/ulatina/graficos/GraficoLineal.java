 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.graficos;

/**
 * Esta clase contiene todo lo relacionado con los graficos lineales.
 *
 * @author alpocr
 */
public class GraficoLineal implements IGraficar {

    private String tituloApp;
    private String tituloGrafico;

    /**
     * Constructor
     */
    public GraficoLineal() {
    }

    public GraficoLineal(String tituloApp, String tituloGrafico) {
        this.tituloApp = tituloApp;
        this.tituloGrafico = tituloGrafico;
    }

    @Override
    public void dibujar() {
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
}
