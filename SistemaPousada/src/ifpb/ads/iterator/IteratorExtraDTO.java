/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.iterator;

import ifpb.ads.dto.ExtraDTO;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class IteratorExtraDTO implements Iterator {

    private ArrayList<ExtraDTO> lista;
    private int quantidade;

    public IteratorExtraDTO(ArrayList<ExtraDTO> vetor) {
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
        ExtraDTO novo = lista.get(quantidade);
        quantidade++;
        return novo;
    }

}
