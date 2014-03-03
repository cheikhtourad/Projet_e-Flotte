/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Etat_Mobile;
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
public class Etat_MobileFacade extends AbstractFacade<Etat_Mobile> implements Etat_MobileFacadeLocal {
    @PersistenceContext(unitName = "Projet_e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Etat_MobileFacade() {
        super(Etat_Mobile.class);
    }
    
}
