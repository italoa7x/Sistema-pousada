package ifpb.ads.control;

import ifpb.ads.dto.ProdutoDTO;
import ifpb.ads.model.Produto;
import ifpb.ads.strategy.StrategyCrudPessoa;

/**
 *
 * @author Italo
 */
public class Controler_Produto implements StrategyCrudPessoa{
    private Produto produto;

    public Controler_Produto() {
        produto = new Produto();
    }
    
    
    @Override
    public boolean save(Object obj) throws Exception {
        return produto.save(obj);
    }

    @Override
    public Object read() throws Exception {
        return produto.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws Exception {
        return produto.delete(id);
    }

    @Override
    public Object search(String name) throws Exception {
        return (ProdutoDTO) produto.search(name);
    }

 
}
