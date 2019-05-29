package ifpb.ads.dao;

/**
 *
 * @author Italo
 */
public interface ITprodutoDAO {

    public boolean create(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean delete(int id) throws Exception;

}
