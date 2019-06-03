package ifpb.ads.model;

import ifpb.ads.dao.Adapter.AdapterProduto;
import ifpb.ads.dao.Adapter.ServicePessoa;
import ifpb.ads.dto.ProdutoDTO;
import ifpb.ads.strategy.StrategyCrud;

/**
 *
 * @author Italo
 */
public class Produto implements StrategyCrud{
    private String name;
    private int amount;
    private double value;
    private int id;
    
    private ServicePessoa daoProduto;

    public Produto() {
        daoProduto = (AdapterProduto) new AdapterProduto();
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
        return daoProduto.salvar(obj);
    }

    @Override
    public Object read() throws Exception {
        return daoProduto.exibir();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws Exception {
        return daoProduto.excluir(id);
    }

    @Override
    public Object search(String name) throws Exception {
        return (ProdutoDTO) daoProduto.buscar_por_nome(name);
    }

    
}
