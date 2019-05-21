package ifpb.ads.dao;

import ifpb.ads.bd.ConnectionFactory;
import ifpb.ads.dto.HospedeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class HospedeDAO implements IThospedeDAO {

    private Connection con;
    private ResultSet rs;
    private PreparedStatement pst;

    public HospedeDAO() {
        con = ConnectionFactory.returnInstance().initConection();
    }

    @Override
    public boolean create(HospedeDTO obj) throws Exception {
        String sql = "INSERT INTO tbl_hospede(nome,cpf,telefone,email) VALUES (?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getName());
            pst.setString(2, obj.getCpf());
            pst.setString(3, obj.getTelephone());
            pst.setString(4, obj.getEmail());
            pst.execute();
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao salvar cliente. "+e.getMessage());
        }finally{
            ConnectionFactory.returnInstance().finallyConnection(con, pst);
        }
    }

    @Override
    public HospedeDTO read() throws Exception {
        HospedeDTO retorno = new HospedeDTO();
        ArrayList<HospedeDTO> vetor = new ArrayList<HospedeDTO>();
        try{
            String sql = "SELECT *FROM tbl_hospede";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                HospedeDTO h = new HospedeDTO();
                h.setName(rs.getString("nome"));
                h.setCpf(rs.getString("cpf"));
                h.setTelephone(rs.getString("telefone"));
                h.setId(rs.getInt("id"));
                h.setEmail(rs.getString("email"));
                vetor.add(h);
            }
            retorno.setAllHospedes(vetor);
        }catch(Exception e){
            ConnectionFactory.returnInstance().finallyConnection(con, pst, rs);
        }
        return retorno;
    }

    @Override
    public boolean delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(HospedeDTO obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
