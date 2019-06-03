package ifpb.ads.dto;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class PedidoDTO {

    private int id_hospede;
    private ArrayList<ProdutoDTO> listaProdutos;
    private int id_funcionario;
    private int quantidade;
    private Date data;
    private int id;
    private ArrayList<PedidoDTO> allPedidos;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<PedidoDTO> getAllPedidos() {
        return allPedidos;
    }

    public void setAllPedidos(ArrayList<PedidoDTO> allPedidos) {
        this.allPedidos = allPedidos;
    }

    public int getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(int id_hospede) {
        this.id_hospede = id_hospede;
    }

    public ArrayList<ProdutoDTO> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<ProdutoDTO> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
