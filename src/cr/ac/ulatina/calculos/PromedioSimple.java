/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ulatina.calculos;

import java.util.List;

/**
 * Esta clase implementa de ICalcularSerie, y acopla los métodos para calcular
 * el Promedio Simple de una serie de valores.
 *
 * @author alpocr
 */
public class PromedioSimple implements ICalcularSerie {

    private List<Double> lista;

    /**
     * Constructor
     */
    public PromedioSimple() {
        
        
    }

    /**
     * ESTE METODO NO SERA SOPORTA MAS POR FAVOR USAR CALCULAR().
     *
     * @param lista son los valores que recibe para promediar.
     * @return el promedio simple de todos los valores.
     */
    private double calcularPromedioSimple() {

        double promedio = 0;

        for (int i = 0; i < getLista().size(); i++) {
            promedio = promedio + getLista().get(i);
        }
        
        return promedio / getLista().size();
    }

    /**
     *
     * @return el promedio simple (a+b+c)/n
     */
    @Override
    public double calcular() {
        double promedio = 0;

        for (int i = 0; i < getLista().size(); i++) {
            promedio = promedio + getLista().get(i);

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