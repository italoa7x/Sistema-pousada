package ifpb.ads.dao;

import ifpb.ads.bd.ConnectionFactory;
import ifpb.ads.dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Italo
 */
public class FuncionarioDAO implements ITfuncionarioDAO{
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public FuncionarioDAO() {
        con = ConnectionFactory.returnInstance().initConection();
    }
    
    
    @Override
    public boolean create(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object acessSystem(String name, String cpf) throws Exception {
        FuncionarioDTO logado = new FuncionarioDTO();
        try{
            pst = con.prepareStatement("SELECT *FROM funcionario WHERE nome = ? AND cpf = ? LIMIT 1");
            pst.setString(1, name);
            pst.setString(2, cpf);
            rs = pst.executeQuery();
            while(rs.next()){
                logado.setName(rs.getString("nome"));
                logado.setCargo(rs.getString("cargo"));
                logado.setId(rs.getInt("id"));
                logado.setTelephone(rs.getString("telefone"));
            }
            
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            ConnectionFactory.returnInstance().finallyConnection(con, pst, rs);
        }
        return logado;
    }


}
