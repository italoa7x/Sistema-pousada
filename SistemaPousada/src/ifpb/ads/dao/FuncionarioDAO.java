package ifpb.ads.dao;

import ifpb.ads.bd.ConnectionFactory;
import ifpb.ads.dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
        try{
            FuncionarioDTO funcionario = (FuncionarioDTO) obj;
            pst = con.prepareStatement("INSERT INTO funcionario(nome,telefone,cpf,cargo) VALUES (?,?,?,?)");
            pst.setString(1, funcionario.getName());
            pst.setString(2, funcionario.getTelephone());
            pst.setString(3, funcionario.getCpf());
            pst.setString(4, funcionario.getCargo());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            throw new Exception("Erro ao salva funcionário. " +e.getMessage());
        }
    }

    @Override
    public Object read() throws Exception {
        FuncionarioDTO retorno = new FuncionarioDTO();
        ArrayList<FuncionarioDTO> vetor = new ArrayList<FuncionarioDTO>();
        try{
            pst = con.prepareStatement("SELECT *FROM funcionario");
            rs = pst.executeQuery();
            while(rs.next()){
                FuncionarioDTO f = new FuncionarioDTO();
                f.setName(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setTelephone(rs.getString("telefone"));
                f.setCargo(rs.getString("cargo"));
                f.setId(rs.getInt("id"));
                vetor.add(f);
            }
            retorno.setAllFuncionarios(vetor);
            return retorno;
        }catch(Exception e){
            throw new Exception("Erro ao consultar funcionários. " + e.getMessage());
        }
    }

    @Override
    public boolean update(Object obj) throws Exception {
        try{
            FuncionarioDTO funcionario = (FuncionarioDTO) obj;
            pst = con.prepareStatement("UPDATE funcionario SET nome = ?, cpf = ?, cargo = ?, telefone = ? WHERE id = ?");
            pst.setString(1, funcionario.getName());
            pst.setString(2, funcionario.getCpf());
            pst.setString(3, funcionario.getCargo());
            pst.setString(4, funcionario.getTelephone());
            pst.setInt(5, funcionario.getId());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            throw new Exception("Erro ao atualizar dado do funcionário. " +e.getMessage());
        }
    }

    @Override
    public boolean delete(int id) throws Exception {
        try{
            pst = con.prepareStatement("DELETE FROM funcionario WHERE id = ?");
            pst.setInt(1, id);
            pst.execute();
            return true;
        }catch(Exception e){
            throw new Exception("Erro ao excluir funcionário. " + e.getMessage());
        }
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
            throw new Exception("Erro ao acessar o sistema. " + e.getMessage());
        }
        return logado;
    }


    @Override
    public void fecharConexoes() {
        ConnectionFactory.returnInstance().finallyConnection(con, pst, rs);
    }
}
