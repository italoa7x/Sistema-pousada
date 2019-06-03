package ifpb.ads.model;

import ifpb.ads.dao.Adapter.AdapterFuncionario;
import ifpb.ads.dao.Adapter.ServicePessoa;
import ifpb.ads.dao.FuncionarioDAO;
import ifpb.ads.dto.FuncionarioDTO;
import ifpb.ads.strategy.StrategyCrud;

/**
 *
 * @author Italo
 */
public class Funcionario extends Pessoa implements StrategyCrud{
    private String cargo;
    private ServicePessoa daoFuncionario;
    private FuncionarioDAO fechaCon;
    
    public Funcionario() {
        daoFuncionario = new AdapterFuncionario();
        fechaCon = new FuncionarioDAO();
    }
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public FuncionarioDTO acessSystem(String cpf) throws Exception{
        return (FuncionarioDTO) daoFuncionario.acessar_sistema(cpf);
    }

    @Override
    public boolean save(Object obj) throws Exception {
        return daoFuncionario.salvar(obj);
    }

    @Override
    public Object read() throws Exception {
        return daoFuncionario.exibir();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        return daoFuncionario.atualizar(obj);
    }

    @Override
    public boolean delete(int id) throws Exception {
        return daoFuncionario.excluir(id);
    }
    
    public void fecharConexoes(){
        fechaCon.fecharConexoes();
    }

    public Object acessSistem(String cpf) throws Exception {
        return daoFuncionario.acessar_sistema(cpf);
    }

    @Override
    public Object search(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
