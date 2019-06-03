/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.view.factoryControl;

import ifpb.ads.control.Controler_Quarto;
import ifpb.ads.dto.QuartoDTO;

/**
 *
 * @author italo
 */
public class FactoryQuarto implements ITfactory{

    @Override
    public Object gerar(String tipo) {
         if(tipo.equalsIgnoreCase("control")){
            return new Controler_Quarto();
        }else if(tipo.equalsIgnoreCase("dto")){
            return new QuartoDTO();
        }
        return null;
    }
    
}
