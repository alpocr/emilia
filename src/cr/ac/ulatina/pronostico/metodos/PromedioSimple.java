/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.pronostico.metodos;

import java.util.List;

/**
 * Esta clase implementa de ISerieTiempo, y acopla los métodos para calcular
 * el Promedio Simple de una serie de valores.
 *
 * @author alpocr
 */
public class PromedioSimple implements ISerieTiempo {

    private List<Double> lista;

    /**
     * Constructor
     */
    public PromedioSimple() {
    }

    public PromedioSimple(List<Double> lista) {
        this.lista = lista;
        calcular();
    }

    /**
     *
     * @return el promedio simple (a+b+c)/n
     */
    @Override
    public double calcular() {
        double promedio = 0;

        for (int i = 0; i <= getLista().size(); i++) {
            promedio += getLista().get(i);

        }

        return promedio / getLista().size();
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