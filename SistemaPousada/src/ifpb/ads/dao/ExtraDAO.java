package ifpb.ads.dao;

import ifpb.ads.bd.ConnectionFactory;
import ifpb.ads.dto.ExtraDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class ExtraDAO implements ITextraDAO {

    @Override
    public Object read() throws Exception {
        ExtraDTO retorno = new ExtraDTO();
        ArrayList<ExtraDTO> vetor = new ArrayList<ExtraDTO>();
        try {
            Connection con = ConnectionFactory.returnInstance().initConection();
            PreparedStatement pst = con.prepareStatement("SELECT *FROM extra");
            ResultSet rs = pst.executeQuery();

            while(rs.next()){
                ExtraDTO atual = new ExtraDTO();
                atual.setExtra(rs.getString("descricao"));
                atual.setId(rs.getInt("id"));
                vetor.add(atual);
            }
            retorno.setAllReservas(vetor);
            return retorno;
        } catch (Exception e) {
            throw new Exception("Erro ao consultas extras. " + e.getMessage());

        }
    }

}
