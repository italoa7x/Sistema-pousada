package ifpb.ads.dao;

import ifpb.ads.dto.ProdutoDTO;

/**
 *
 * @author Italo
 */
public interface ITprodutoDAO {

    public boolean create(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean delete(int id) throws Exception;

    public ProdutoDTO search(String name) throws Exception;
    
    public boolean subtrairEstoque(int idProd, int quantSubtraida) throws Exception;
    
    public int buscaQuantidade(int idProduto) throws Exception;
}
