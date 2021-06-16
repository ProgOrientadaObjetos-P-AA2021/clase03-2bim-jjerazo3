/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author USUARIO 2020
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String r, ArrayList<Policia> lista) {
        super(r);
        setLista(lista);
    }

    public void setPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + getLista().get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }
    
    public void setLista(ArrayList<Policia> li) {
        this.lista = lista;
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sReporte de policias:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s %s - %d\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad());
        }
        cadena = String.format("%s *Promedio de matrículas: %.2f", cadena,
                getPromedioEdades());
        return cadena;
    }

}