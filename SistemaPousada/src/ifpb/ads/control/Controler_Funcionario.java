package ifpb.ads.control;

import ifpb.ads.dto.FuncionarioDTO;
import ifpb.ads.model.Funcionario;
import ifpb.ads.strategy.StrategyCrud;

/**
 *
 * @author Italo
 */
public class Controler_Funcionario implements StrategyCrud{
    private Funcionario funcionario;

    public Controler_Funcionario() {
        funcionario = new Funcionario();
    }
    
    public FuncionarioDTO acessSistem(String cpf, String cargo) throws Exception{
        return funcionario.acessSystem(cpf, cargo);
    }
    
    @Override
    public boolean save(Object obj) throws Exception {
        return funcionario.save(obj);
    }

    @Override
    public Object read() throws Exception {
        return funcionario.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        return funcionario.update(obj);
    }

    @Override
    public boolean delete(int id) throws Exception {
        return funcionario.delete(id);
    }
    
    public void fecharConexoes(){
        funcionario.fecharConexoes();
    }

    @Override
    public Object search(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
