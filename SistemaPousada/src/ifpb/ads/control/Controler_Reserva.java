package ifpb.ads.control;

import ifpb.ads.model.Reserva;
import ifpb.ads.strategy.StrategyCrud;

/**
 *
 * @author Italo
 */
public class Controler_Reserva implements StrategyCrud {
    private Reserva reserva;

    public Controler_Reserva() {
        reserva = new Reserva();
    }
    
    
    @Override
    public boolean save(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object search(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
