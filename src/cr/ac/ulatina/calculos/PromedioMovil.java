/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.calculos;

import java.util.List;

/**
 * Esta clase implementa de ICalcularSerie
 *
 * @author alpocr
 */
public class PromedioMovil implements ICalcularSerie {

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

        for (int i = 0; i < getLista().lastIndexOf(i) - getUnidad(); i++) {
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