package ifpb.ads.dto;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class HospedeDTO extends PessoaDTO{
    private String email;
    private ArrayList<HospedeDTO> allHospedes;

    public ArrayList<HospedeDTO> getAllHospedes() {
        return allHospedes;
    }

    public void setAllHospedes(ArrayList<HospedeDTO> allHospedes) {
        this.allHospedes = allHospedes;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
