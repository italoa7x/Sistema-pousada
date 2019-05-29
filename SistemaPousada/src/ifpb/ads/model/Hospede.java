package ifpb.ads.model;

import ifpb.ads.dao.HospedeDAO;
import ifpb.ads.dto.HospedeDTO;
import ifpb.ads.strategy.StrategyCrudPessoa;

/**
 *
 * @author Italo
 */
public class Hospede extends Pessoa implements StrategyCrudPessoa{
    private HospedeDAO daoHospede;

    public Hospede() {
        daoHospede = new HospedeDAO();
    }
    
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean save(Object obj) throws Exception {
        return daoHospede.create((HospedeDTO) obj);
    }

    @Override
    public Object read() throws Exception {
        return daoHospede.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        return daoHospede.update((HospedeDTO) obj);
    }

    @Override
    public boolean delete(int id) throws Exception {
        return daoHospede.delete(id);
    }

    @Override
    public Object acessSistem(String name, String cpf) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fecharConexoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
