package ifpb.ads.dao;

/**
 *
 * @author Italo
 */
public interface ITpedidoDAO {

    public boolean create(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean delete(int id) throws Exception;
}
