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
        return daoFuncionario.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        return daoFuncionario.update(obj);
    }

    @Override
    public boolean delete(int id) throws Exception {
        return daoFuncionario.delete(id);
    }
    
    public void fecharConexoes(){
        daoFuncionario.fecharTodasConexoes();
    }

    @Override
    public Object acessSistem(String name, String cpf) throws Exception {
        return daoFuncionario.acessSystem(name, cpf);
    }
}
