package ifpb.ads.model;

import ifpb.ads.dao.PedidoDAO;
import ifpb.ads.dao.ProdutoDAO;
import java.sql.Date;
import ifpb.ads.strategy.StrategyCrud;

/**
 *
 * @author Italo
 */
public class Pedido implements StrategyCrud {

    private int id_hospede;
    private int id_produto;
    private int id_funcionario;
    private Date data;
    private int id;

    private PedidoDAO pedidoDao;

    public Pedido() {
        pedidoDao = new PedidoDAO();
    }

    public int getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(int id_hospede) {
        this.id_hospede = id_hospede;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean save(Object obj) throws Exception {
        return pedidoDao.create(obj);
    }

    @Override
    public Object read() throws Exception {
        return pedidoDao.read();
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
