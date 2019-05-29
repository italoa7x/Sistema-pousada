/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.ads.dao;

import ifpb.ads.dto.HospedeDTO;

/**
 *
 * @author Italo
 */
public interface IThospedeDAO {

    public boolean create(HospedeDTO obj) throws Exception;

    public HospedeDTO read() throws Exception;

    public boolean delete(int id) throws Exception;

    public boolean update(HospedeDTO obj) throws Exception;
}
