/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.view.factoryControl;

import ifpb.ads.control.Controler_Produto;
import ifpb.ads.dto.ProdutoDTO;

/**
 *
 * @author italo
 */
public class FactoryProduto implements ITfactory{

    @Override
    public Object gerar(String tipo) {
        if(tipo.equalsIgnoreCase("control")){
            return new Controler_Produto();
        }else if(tipo.equalsIgnoreCase("dto")){
            return new ProdutoDTO();
        }
        return null;
    }
    
}
