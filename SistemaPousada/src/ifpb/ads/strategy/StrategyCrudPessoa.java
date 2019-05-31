package ifpb.ads.strategy;

/**
 *
 * @author Italo
 */
public interface StrategyCrudPessoa {

    public boolean save(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean update(Object obj) throws Exception;

    public boolean delete(int id) throws Exception;
    
    public Object search(String name) throws Exception;
    
}
