package ifpb.ads.dto;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class ExtraDTO {
    private String extra;
    private int id;
    private ArrayList<ExtraDTO> allReservas;

    public ArrayList<ExtraDTO> getAllReservas() {
        return allReservas;
    }

    public void setAllReservas(ArrayList<ExtraDTO> allReservas) {
        this.allReservas = allReservas;
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
