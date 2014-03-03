/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Etat_Mobile;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author weddou
 */
@Local
public interface Etat_MobileFacadeLocal {

    void create(Etat_Mobile etat_Mobile);

    void edit(Etat_Mobile etat_Mobile);

    void remove(Etat_Mobile etat_Mobile);

    Etat_Mobile find(Object id);

    List<Etat_Mobile> findAll();

    List<Etat_Mobile> findRange(int[] range);

    int count();
    
}
