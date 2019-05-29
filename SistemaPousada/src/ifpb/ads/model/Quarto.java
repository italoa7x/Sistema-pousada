package ifpb.ads.model;

import ifpb.ads.dao.ITquartoDAO;
import ifpb.ads.dao.QuartoDAO;
import ifpb.ads.dto.ExtraDTO;
import ifpb.ads.dto.QuartoDTO;
import ifpb.ads.strategy.StrategyCrudPessoa;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class Quarto implements StrategyCrudPessoa {

    private int accommodations;
    private double daily;
    private int id;
    private String status;

    private ITquartoDAO daoQuarto;

    public Quarto() {
        daoQuarto = new QuartoDAO();
    }

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

    @Override
    public boolean save(Object obj) throws Exception {
        QuartoDTO quarto = (QuartoDTO) obj;
        int id = daoQuarto.create(quarto);
        return salvaExtra(quarto.getListExtras(), id);
    }

    private boolean salvaExtra(ArrayList<ExtraDTO> extras, int idQuarto) throws Exception {
        return daoQuarto.salvarExtras(extras, idQuarto);
    }

    @Override
    public Object read() throws Exception {
        return daoQuarto.read();
    }

    @Override
    public boolean update(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) throws Exception {
        return daoQuarto.delete(id);
    }

}
