package ifpb.ads.model;

import ifpb.ads.dao.ITprodutoDAO;
import ifpb.ads.dao.ProdutoDAO;
import ifpb.ads.strategy.StrategyCrudPessoa;

/**
 *
 * @author Italo
 */
public class Produto implements StrategyCrudPessoa{
    private String name;
    private int amount;
    private double value;
    private int id;
    
    private ITprodutoDAO daoProduto;

    public Produto() {
        daoProduto = new ProdutoDAO();
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean save(Object obj) throws Exception {
        return daoProduto.create(obj);
    }

    @Override
    public Object read() throws Exception {
        return daoProduto.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws Exception {
        return daoProduto.delete(id);
    }

    
}
