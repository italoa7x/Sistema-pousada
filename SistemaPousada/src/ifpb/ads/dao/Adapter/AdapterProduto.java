/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.dao.Adapter;

import ifpb.ads.dao.ProdutoDAO;
import ifpb.ads.dto.ProdutoDTO;

/**
 *
 * @author italo
 */
public class AdapterProduto extends ProdutoDAO implements ServicePessoa {

    @Override
    public boolean salvar(Object obj) throws Exception {
        return super.create(obj);
    }

    @Override
    public Object exibir() throws Exception {
        return super.read();
    }

    @Override
    public boolean excluir(int id) throws Exception {
        return super.delete(id);
    }

    @Override
    public boolean atualizar(Object obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object acessar_sistema(String senha) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar_por_nome(String nome) throws Exception {
        return (ProdutoDTO) super.search(nome);
    }

}
