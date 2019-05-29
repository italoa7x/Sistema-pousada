package ifpb.ads.model;

import ifpb.ads.dao.FuncionarioDAO;
import ifpb.ads.dto.FuncionarioDTO;
import ifpb.ads.strategy.StrategyCrudPessoa;

/**
 *
 * @author Italo
 */
public class Funcionario extends Pessoa implements StrategyCrudPessoa{
    private String cargo;
    private FuncionarioDAO daoFuncionario;

    public Funcionario() {
        daoFuncionario = new FuncionarioDAO();
    }
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public FuncionarioDTO acessSystem(String name, String cpf) throws Exception{
        return (FuncionarioDTO) daoFuncionario.acessSystem(name, cpf);
    }

    @Override
    public boolean save(Object obj) throws Exception {
        return daoFuncionario.create(obj);
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
    public boolean delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
