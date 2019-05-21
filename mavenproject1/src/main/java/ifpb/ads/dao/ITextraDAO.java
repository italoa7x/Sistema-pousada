package ifpb.ads.dao;

/**
 *
 * @author Italo
 */
public interface ITextraDAO {

    public boolean save(Object obj) throws Exception;

    public Object read() throws Exception;
}
