package ifpb.ads.model;
/**
 *
 * @author Italo
 */
public class Reserva {
    private int id_hospede;
    private int id_funcionario;
    private int id_quarto;
    private int quantidade_dias;
    private double soma_diaria;
    private int id;

    public int getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(int id_hospede) {
        this.id_hospede = id_hospede;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    public int getQuantidade_dias() {
        return quantidade_dias;
    }

    public void setQuantidade_dias(int quantidade_dias) {
        this.quantidade_dias = quantidade_dias;
    }

    public double getSoma_diaria() {
        return soma_diaria;
    }

    public void setSoma_diaria(double soma_diaria) {
        this.soma_diaria = soma_diaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
