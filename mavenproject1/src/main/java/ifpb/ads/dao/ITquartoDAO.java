package ifpb.ads.dao;

/**
 *
 * @author Italo
 */
public interface ITquartoDAO {

    public boolean create(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean delete(int id) throws Exception;
}
