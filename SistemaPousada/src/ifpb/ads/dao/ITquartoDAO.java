package ifpb.ads.dao;

import ifpb.ads.dto.ExtraDTO;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public interface ITquartoDAO {

    public int create(Object obj) throws Exception;

    public Object read() throws Exception;

    public boolean delete(int id) throws Exception;
    
    public boolean salvarExtras(ArrayList<ExtraDTO> lista, int idQuarto) throws Exception;
}
