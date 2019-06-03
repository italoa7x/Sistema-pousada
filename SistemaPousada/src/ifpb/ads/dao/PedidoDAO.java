package ifpb.ads.dao;

import ifpb.ads.bd.ConnectionFactory;
import ifpb.ads.dto.PedidoDTO;
import ifpb.ads.dto.ProdutoDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class PedidoDAO implements ITpedidoDAO {

    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    private ProdutoDAO produtodao;

    public PedidoDAO() {
        con = ConnectionFactory.returnInstance().initConection();
        produtodao = new ProdutoDAO();
    }

    @Override
    public boolean create(Object obj) throws Exception {
        PedidoDTO pedido = (PedidoDTO) obj;
        int idPedido = -1;
        try {
            pst = con.prepareStatement("INSERT INTO pedido (id_hospede,id_funcionario) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, pedido.getId_hospede());
            pst.setInt(2, pedido.getId_funcionario());
            pst.execute();
            rs = pst.getGeneratedKeys();

            while (rs.next()) {
                idPedido = rs.getInt("id");
            }

        } catch (Exception e) {
            throw new Exception("Erro ao salvar pedido. " + e.getMessage());
        }
        if (idPedido > -1) {
            if (this.salvaProdutoPedido(idPedido, pedido.getListaProdutos())) {
                this.solicitaSubtracaoProd(pedido.getListaProdutos());
                return true;

            }
        }
        return false;
    }

    @Override
    public Object read() throws Exception {
        ArrayList<String[]> lista = new ArrayList<String[]>();
        try {
            pst = con.prepareStatement("select p.id as codigo, h.nome hospede, prod.nome as produto, (pp.quantidade * prod.valor) as total from \n"
                    + "pedido p inner join produto_pedido pp on (p.id = pp.id_pedido) inner join produto prod\n"
                    + "on (pp.id_produto = prod.id) inner join hospede h on (h.id = p.id_hospede)");

            rs = pst.executeQuery();
            while (rs.next()) {
                String[] dados = new String[4];
                dados[0] = rs.getInt("codigo") + "";
                dados[1] = rs.getString("hospede");
                dados[2] = rs.getString("produto");
                dados[3] = rs.getDouble("total") + "";
                lista.add(dados);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao buscar registro de pedidos. " + e.getMessage());
        }
        return lista;
    }

    @Override
    public boolean delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean salvaProdutoPedido(int idPedido, ArrayList<ProdutoDTO> listaProdutos) throws Exception {
        try {
            pst = con.prepareStatement("INSERT INTO produto_pedido (id_pedido, id_produto, quantidade) VALUES (?,?,?)");
            for (ProdutoDTO x : listaProdutos) {
                pst.setInt(1, idPedido);
                pst.setInt(2, x.getId());
                pst.setInt(3, x.getAmount());
                pst.execute();
            }
            return true;
        } catch (Exception e) {
            throw new Exception("Erro ao salvar produtos do pedido. " + e.getMessage());
        }
    }

    @Override
    public boolean solicitaSubtracaoProd(ArrayList<ProdutoDTO> listaProdutos) throws Exception {
        int atualizados = 0;
        for (int i = 0; i < listaProdutos.size(); i++) {
            produtodao.subtrairEstoque(listaProdutos.get(i).getId(), listaProdutos.get(i).getAmount());
        }
        if (atualizados > 0) {
            return true;
        }
        return false;
    }

}
