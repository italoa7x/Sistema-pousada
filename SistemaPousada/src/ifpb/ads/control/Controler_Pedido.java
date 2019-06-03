package ifpb.ads.control;

import ifpb.ads.model.Pedido;
import ifpb.ads.strategy.StrategyCrud;

/**
 *
 * @author Italo
 */
public class Controler_Pedido implements StrategyCrud{
    private Pedido pedido;

    public Controler_Pedido() {
        pedido = new Pedido();
    }
    
    @Override
    public boolean save(Object obj) throws Exception {
        return pedido.save(obj);
    }

    @Override
    public Object read() throws Exception {
        return pedido.read();
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
