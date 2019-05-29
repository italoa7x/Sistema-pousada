package ifpb.ads.dto;

import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class QuartoDTO {

    private int accommodations;
    private double daily;
    private int id;
    private String status;
    private ArrayList<QuartoDTO> allQuartos;
    
    public int getAccommodations() {
        return accommodations;
    }

    public void setAccommodations(int accommodations) {
        this.accommodations = accommodations;
    }

    public double getDaily() {
        return daily;
    }

    public void setDaily(double daily) {
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
