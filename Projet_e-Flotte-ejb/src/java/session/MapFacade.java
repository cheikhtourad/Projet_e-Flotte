/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Map;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author weddou
 */
@Stateless
@LocalBean
public class MapFacade extends AbstractFacade<Map> implements MapFacadeLocal {
    @PersistenceContext(unitName = "Projet_e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MapFacade() {
        super(Map.class);
    }
    
}
