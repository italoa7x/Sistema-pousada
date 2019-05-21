package ifpb.ads.dto;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class FuncionarioDTO extends PessoaDTO{
    private String cargo;
    private ArrayList<FuncionarioDTO> allFuncionarios;
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<FuncionarioDTO> getAllFuncionarios() {
        return allFuncionarios;
    }

    public void setAllFuncionarios(ArrayList<FuncionarioDTO> allFuncionarios) {
        this.allFuncionarios = allFuncionarios;
    }
}
