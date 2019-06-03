/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.view.factoryControl;

import ifpb.ads.control.Controler_Pedido;
import ifpb.ads.dto.PedidoDTO;

/**
 *
 * @author italo
 */
public class FactoryPedido implements ITfactory{

    @Override
    public Object gerar(String tipo) {
         if(tipo.equalsIgnoreCase("control")){
            return new Controler_Pedido();
        }else if(tipo.equalsIgnoreCase("dto")){
            return new PedidoDTO();
        }
        return null;
    }
    
}
