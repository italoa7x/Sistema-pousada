package ifpb.ads.dto;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class ExtraDTO {
    private String extra;
    private int id;
    private ArrayList<ExtraDTO> allExtras;

    public ArrayList<ExtraDTO> getAllReservas() {
        return allExtras;
    }

    public void setAllReservas(ArrayList<ExtraDTO> allReservas) {
        this.allExtras = allReservas;
    }
    
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
