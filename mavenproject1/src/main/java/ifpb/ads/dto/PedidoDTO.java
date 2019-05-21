package ifpb.ads.dto;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class PedidoDTO {
    private int id_hospede;
    private int id_produto;
    private int id_funcionario;
    private Date data;
    private int id;
    private ArrayList<PedidoDTO> allPedidos;

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

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
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
