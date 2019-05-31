/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.dao.Adapter;

/**
 *
 * @author Italo
 */
public interface ServicePessoa {
    
    public  boolean salvar(Object obj) throws Exception;
    
    public Object exibir() throws Exception;
    
    public boolean excluir (int id) throws Exception;
    
    public boolean atualizar(Object obj) throws Exception;
    
    public Object acessar_sistema(String cpf) throws Exception;
    
    public Object buscar_por_nome(String nome) throws Exception;
}
