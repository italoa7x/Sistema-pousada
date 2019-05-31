package ifpb.ads.dao;

import ifpb.ads.bd.ConnectionFactory;
import ifpb.ads.dto.ExtraDTO;
import ifpb.ads.dto.QuartoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class QuartoDAO implements ITquartoDAO {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public QuartoDAO() {
        con = ConnectionFactory.returnInstance().initConection();
    }

    @Override
    public int create(Object obj) throws Exception {
        QuartoDTO quarto = (QuartoDTO) obj;
        int idQuarto = 0;
        try {
            pst = con.prepareStatement("INSERT INTO quarto (acomodacoes,diaria,status) VALUES (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setInt(1, quarto.getAccommodations());
            pst.setFloat(2, quarto.getDaily());
            pst.setString(3, quarto.getStatus());
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();

            while (rs.next()) {
                idQuarto = rs.getInt(1);
            }
        } catch (Exception e) {
            throw new Exception("Erro ao salvar quarto. " + e.getMessage());
        }
        return idQuarto;
    }

    @Override
    public Object read() throws Exception {
        QuartoDTO retorno = new QuartoDTO();
        ArrayList<QuartoDTO> vetor = new ArrayList<QuartoDTO>();
        try {
            pst = con.prepareStatement("SELECT *FROM quarto");
            rs = pst.executeQuery();
            while (rs.next()) {
                QuartoDTO q = new QuartoDTO();
                q.setAccommodations(rs.getInt("acomodacoes"));
                q.setDaily(rs.getFloat("diaria"));
                q.setStatus(rs.getString("status"));
                q.setId(rs.getInt("id"));
                vetor.add(q);
            }
            retorno.setAllQuartos(vetor);
            return retorno;
        } catch (Exception e) {
            throw new Exception("Erro ao consultar quartos. " + e.getMessage());
        }
    }

    @Override
    public boolean delete(int id) throws Exception {
        try {
            pst = con.prepareStatement("DELETE FROM quarto WHERE id = ?");
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao excluir quarto. " + e.getMessage());
        }
    }

    @Override
    public boolean salvarExtras(ArrayList<ExtraDTO> lista, int idQuarto) throws Exception {
        try {
            pst = con.prepareStatement("INSERT INTO quarto_extra (id_quarto, id_extra) VALUES (?,?)");
            for (int i = 0; i < lista.size(); i++) {
                pst.setInt(1, idQuarto);
                pst.setInt(2, lista.get(i).getId());
                pst.execute();
            }
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao salvar extras do quarto." + e.getMessage());
        }
    }

    @Override
    public ArrayList<String> viewAllExtras(int idQuarto) throws Exception {
        ArrayList<String> extras = new ArrayList<String>();
        try{
            pst = con.prepareStatement("select e.extra from quarto_extra qe inner join quarto as q on (q.id = qe.id_quarto)\n" +
"inner join extra as e on (qe.id_extra = e.id) where q.id = ?");
            pst.setInt(1, idQuarto);
            rs = pst.executeQuery();
            
            while(rs.next()){
                extras.add(rs.getString("extra"));
            }
        }catch(Exception e){
            throw new Exception("Erro ao buscar extras do quarto.");
        }
        return extras;
    }

}
