/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.pronostico.metodos;

import java.util.List;

/**
 * Esta clase implementa de ISerieTiempo
 *
 * @author alpocr
 */
public class PromedioMovil implements ISerieTiempo {

    private int unidad;
    private List<Double> lista;

    /**
     * Constructor
     */
    public PromedioMovil() {
    }

    public PromedioMovil(int unidad, List<Double> lista) {
        this.unidad = unidad;
        this.lista = lista;
        calcular();
    }

    /**
     *
     * @return el valor del promedio movil
     */
    @Override
    public double calcular() {
        double promedio = 0;

        for (int i = 0; i <= getUnidad(); i++) {
            promedio += getLista().get(i);
        }

        return promedio;
    }

    /**
     * @return the unidad
     */
    public int getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(int unidad) {
        this.unidad = unidad;
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