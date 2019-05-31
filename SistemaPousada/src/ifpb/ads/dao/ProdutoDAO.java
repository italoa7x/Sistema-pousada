/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.dao;

import ifpb.ads.bd.ConnectionFactory;
import ifpb.ads.dto.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class ProdutoDAO implements ITprodutoDAO {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public ProdutoDAO() {
        con = ConnectionFactory.returnInstance().initConection();
    }

    @Override
    public boolean create(Object obj) throws Exception {
        try {
            ProdutoDTO produto = (ProdutoDTO) obj;
            pst = con.prepareStatement("INSERT INTO produto(nome,valor,quantidade) VALUES (?,?,?)");
            pst.setString(1, produto.getName());
            pst.setFloat(2, produto.getValue());
            pst.setInt(3, produto.getAmount());
            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao salva funcionário. " + e.getMessage());
        }
    }

    @Override
    public Object read() throws Exception {
        ProdutoDTO retorno = new ProdutoDTO();
        ArrayList<ProdutoDTO> vetor = new ArrayList<ProdutoDTO>();
        try {
            pst = con.prepareStatement("SELECT *FROM produto");
            rs = pst.executeQuery();
            while (rs.next()) {
                ProdutoDTO atual = new ProdutoDTO();
                atual.setName(rs.getString("nome"));
                atual.setValue(rs.getFloat("valor"));
                atual.setAmount(rs.getInt("quantidade"));
                atual.setId(rs.getInt("id"));
                vetor.add(atual);
            }
            retorno.setAllProdutos(vetor);
            return retorno;
        } catch (Exception e) {
            throw new Exception("Erro ao consultar produtos. " + e.getMessage());
        }
    }

    @Override
    public boolean delete(int id) throws Exception {
        try {
            pst = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            pst.setInt(1, id);
            pst.execute();
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao excluir produto. " + e.getMessage());
        }
    }

    @Override
    public ProdutoDTO search(String name) throws Exception {
        try {
            ProdutoDTO produto = new ProdutoDTO();
            pst = con.prepareStatement("SELECT *FROM produto WHERE nome LIKE ? LIMIT 1");
            pst.setString(1, name);
            rs = pst.executeQuery();
            while (rs.next()) {
                produto.setName(rs.getString("nome"));
                produto.setValue(rs.getFloat("valor"));
                produto.setId(rs.getInt("id"));
            }
            return produto;
        } catch (Exception e) {
            throw new Exception("Erro ao excluir produto. " + e.getMessage());
        }
    }

}
