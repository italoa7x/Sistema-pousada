package ifpb.ads.model;

import ifpb.ads.dao.ExtraDAO;
import ifpb.ads.dao.ITextraDAO;

/**
 *
 * @author Italo
 */
public class Extra{

    private String extra;
    private int id;
    private ITextraDAO daoExtra;

    public Extra() {
        daoExtra = new ExtraDAO();
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


    public Object read() throws Exception {
        return daoExtra.read();
    }

}
