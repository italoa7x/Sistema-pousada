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
        String sql = "INSERT INTO hospede(nome,cpf,telefone,email) VALUES (?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, obj.getName());
            pst.setString(2, obj.getCpf());
            pst.setString(3, obj.getTelephone());
            pst.setString(4, obj.getEmail());
            pst.execute();
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao salvar cliente. " + e.getMessage());
        }
    }

    @Override
    public HospedeDTO read() throws Exception {
        HospedeDTO retorno = new HospedeDTO();
        ArrayList<HospedeDTO> vetor = new ArrayList<HospedeDTO>();
        try {
            String sql = "SELECT *FROM hospede";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                HospedeDTO h = new HospedeDTO();
                h.setName(rs.getString("nome"));
                h.setCpf(rs.getString("cpf"));
                h.setTelephone(rs.getString("telefone"));
                h.setId(rs.getInt("id"));
                h.setEmail(rs.getString("email"));
                vetor.add(h);
            }
            retorno.setAllHospedes(vetor);
        } catch (Exception e) {
            throw new Exception("Erro ao consultar hospedes. " + e.getMessage());
        }
        return retorno;
    }

    @Override
    public boolean delete(int id) throws Exception {
        try {
            pst = con.prepareStatement("DELETE FROM hospede WHERE id = ?");
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao excluir hospede. " + e.getMessage());
        }
    }

    @Override
    public boolean update(HospedeDTO obj) throws Exception {
        try {
            HospedeDTO hospede = (HospedeDTO) obj;
            pst = con.prepareStatement("UPDATE hospede SET nome = ?, cpf = ?, email = ?, telefone = ? WHERE id = ?");
            pst.setString(1, hospede.getName());
            pst.setString(2, hospede.getCpf());
            pst.setString(3, hospede.getEmail());
            pst.setString(4, hospede.getTelephone());
            pst.setInt(5, hospede.getId());
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao atualizar dado do hospede. " + e.getMessage());
        }
    }

    @Override
    public HospedeDTO search(String name) throws Exception {
        System.out.println(name);
        try {
            HospedeDTO retorno = new HospedeDTO();
            String sql = "SELECT *FROM hospede WHERE nome LIKE ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + name + "%");

            rs = pst.executeQuery();
            while (rs.next()) {
                retorno.setCpf(rs.getString("cpf"));
                retorno.setName(rs.getString("nome"));
                retorno.setId(rs.getInt("id"));
                retorno.setEmail(rs.getString("email"));
                retorno.setTelephone(rs.getString("telefone"));
            }
            return retorno;
        } catch (Exception e) {
            throw new Exception("Erro ao consultar hospedes. " + e.getMessage());
        }
    }

}
