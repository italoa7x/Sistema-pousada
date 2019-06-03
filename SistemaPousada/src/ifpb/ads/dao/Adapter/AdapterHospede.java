package ifpb.ads.dao.Adapter;

import ifpb.ads.dao.HospedeDAO;
import ifpb.ads.dto.HospedeDTO;

public class AdapterHospede extends HospedeDAO implements ServicePessoa {

    @Override
    public boolean salvar(Object obj) throws Exception {
        return super.create((HospedeDTO) obj);
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
        return super.update((HospedeDTO) obj);
    }

    @Override
    public Object acessar_sistema(String cpf) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar_por_nome(String nome) throws Exception {
        return (HospedeDTO) super.search(nome);
    }

}
