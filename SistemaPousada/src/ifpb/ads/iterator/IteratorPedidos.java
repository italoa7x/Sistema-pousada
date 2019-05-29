package ifpb.ads.iterator;

import ifpb.ads.dto.PedidoDTO;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class IteratorPedidos implements Iterator {

    private ArrayList<PedidoDTO> lista;
    private int quantidade;

    public IteratorPedidos(ArrayList<PedidoDTO> vetor) {
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
        PedidoDTO novo = lista.get(quantidade);
        quantidade++;
        return novo;
    }

}
