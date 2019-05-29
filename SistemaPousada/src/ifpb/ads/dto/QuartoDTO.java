package ifpb.ads.dto;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class QuartoDTO {

    private int accommodations;
    private float daily;
    private int id;
    private String status;
    private ArrayList<QuartoDTO> allQuartos;
    private ArrayList<ExtraDTO> listExtras;
    
    
    
    public int getAccommodations() {
        return accommodations;
    }

    public ArrayList<ExtraDTO> getListExtras() {
        return listExtras;
    }

    public void setListExtras(ArrayList<ExtraDTO> listExtras) {
        this.listExtras = listExtras;
    }

    public void setAccommodations(int accommodations) {
        this.accommodations = accommodations;
    }

    public float getDaily() {
        return daily;
    }

    public void setDaily(float daily) {
        this.daily = daily;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<QuartoDTO> getAllQuartos() {
        return allQuartos;
    }

    public void setAllQuartos(ArrayList<QuartoDTO> allQuartos) {
        this.allQuartos = allQuartos;
    }

}
