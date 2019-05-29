package ifpb.ads.iterator;

import ifpb.ads.dto.FuncionarioDTO;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class IteratorFuncionarioDTO implements Iterator{
    private  ArrayList<FuncionarioDTO> lista;
    private int quantidade;

    public IteratorFuncionarioDTO(ArrayList<FuncionarioDTO> vetor) {
        lista = vetor;
        quantidade = 0;
    }
    
    
    @Override
    public boolean hasnext() {
        if(quantidade >= lista.size() || lista.get(quantidade) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        FuncionarioDTO novo = lista.get(quantidade);
        quantidade++;
        return novo;
    }
    
}
