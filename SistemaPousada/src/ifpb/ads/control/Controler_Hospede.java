package ifpb.ads.control;

import ifpb.ads.model.Hospede;
import ifpb.ads.strategy.StrategyCrud;

/**
 *
 * @author Italo
 */
public class Controler_Hospede implements StrategyCrud{
    private Hospede hospede;

    public Controler_Hospede() {
        hospede = new Hospede();
    }
    
    @Override
    public boolean save(Object obj) throws Exception {
        return hospede.save(obj);
    }

    @Override
    public Object read() throws Exception {
        return hospede.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        return hospede.update(obj);
    }

    @Override
    public boolean delete(int id) throws Exception {
        return hospede.delete(id);
    }

    @Override
    public Object search(String name) throws Exception {
        return hospede.search(name);
    }


}
