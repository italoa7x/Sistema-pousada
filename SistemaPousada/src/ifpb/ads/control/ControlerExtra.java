/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.control;

import ifpb.ads.model.Extra;

/**
 *
 * @author italo
 */
public class ControlerExtra{

    private Extra extra;

    public ControlerExtra() {
        extra = new Extra();
    }

    public Object read() throws Exception {
        return extra.read();
    }

}
