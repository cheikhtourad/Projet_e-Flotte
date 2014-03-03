/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Type_Objet;
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
public class Type_ObjetFacade extends AbstractFacade<Type_Objet> implements Type_ObjetFacadeLocal {
    @PersistenceContext(unitName = "Projet_e-Flotte-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Type_ObjetFacade() {
        super(Type_Objet.class);
    }
    
}
