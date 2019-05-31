package ifpb.ads.model;

import ifpb.ads.dao.Adapter.AdapterHospede;
import ifpb.ads.dao.Adapter.ServicePessoa;
import ifpb.ads.dao.HospedeDAO;
import ifpb.ads.dto.HospedeDTO;
import ifpb.ads.strategy.StrategyCrudPessoa;

/**
 *
 * @author Italo
 */
public class Hospede extends Pessoa implements StrategyCrudPessoa {

    private ServicePessoa adpHospede;
    private String email;

    public Hospede() {
        adpHospede = new AdapterHospede();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean save(Object obj) throws Exception {
        return adpHospede.salvar((HospedeDTO) obj);
    }

    @Override
    public Object read() throws Exception {
        return adpHospede.exibir();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        return adpHospede.atualizar((HospedeDTO) obj);
    }

    @Override
    public boolean delete(int id) throws Exception {
        return adpHospede.excluir(id);
    }

    @Override
    public Object search(String name) throws Exception {
        return (HospedeDTO) adpHospede.buscar_por_nome(name);
    }
}
