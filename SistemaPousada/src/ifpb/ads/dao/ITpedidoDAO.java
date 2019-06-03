package ifpb.ads.dao;

import ifpb.ads.dto.ProdutoDTO;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public interface ITpedidoDAO {

    public boolean create(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean delete(int id) throws Exception;
    
    public boolean salvaProdutoPedido(int idPedido, ArrayList<ProdutoDTO> listaProdutos) throws Exception;
    
    public boolean solicitaSubtracaoProd(ArrayList<ProdutoDTO> listaProdutos) throws Exception;
}
