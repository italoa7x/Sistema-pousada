package ifpb.ads.control;

import ifpb.ads.model.Quarto;
import ifpb.ads.strategy.StrategyCrudPessoa;

/**
 *
 * @author Italo
 */
public class Controler_Quarto implements StrategyCrudPessoa{
    private Quarto quarto;

        
    public Controler_Quarto() {
        quarto = new Quarto();
    }
    
    
    @Override
    public boolean save(Object obj) throws Exception {
        return quarto.save(obj);
    }

    @Override
    public Object read() throws Exception {
        return quarto.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws Exception {
        return quarto.delete(id);
    }

}
