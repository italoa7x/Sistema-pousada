package ifpb.ads.dao.Adapter;

import ifpb.ads.dao.FuncionarioDAO;


public class AdapterFuncionario extends FuncionarioDAO implements ServicePessoa{

    @Override
    public boolean salvar(Object obj) throws Exception {
        return super.create(obj);
    }

    @Override
    public Object exibir() throws Exception {
        return super.read();
    }

    @Override
    public boolean excluir(int id) throws Exception {
        return super.delete(id);
    }

    @Override
    public boolean atualizar(Object obj) throws Exception {
        return super.update(obj);
    }

    @Override
    public Object acessar_sistema( String cpf) throws Exception {
        return super.acessSystem(cpf);
    }

    @Override
    public Object buscar_por_nome(String nome) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
