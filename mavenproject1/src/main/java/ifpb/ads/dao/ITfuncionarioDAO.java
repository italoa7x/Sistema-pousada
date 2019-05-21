package ifpb.ads.dao;

/**
 *
 * @author Italo
 */
public interface ITfuncionarioDAO {

    public boolean create(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean update(Object obj) throws Exception;

    public boolean delete(int id) throws Exception;

}
