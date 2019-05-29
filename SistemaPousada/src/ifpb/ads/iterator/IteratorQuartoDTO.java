/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.iterator;

import ifpb.ads.dto.QuartoDTO;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class IteratorQuartoDTO implements Iterator {

    private ArrayList<QuartoDTO> lista;
    private int quantidade;

    public IteratorQuartoDTO(ArrayList<QuartoDTO> vetor) {
        lista = vetor;
        quantidade = 0;
    }

    @Override
    public boolean hasnext() {
        if (quantidade >= lista.size() || lista.get(quantidade) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        QuartoDTO novo = lista.get(quantidade);
        quantidade++;
        return novo;
    }

}
