/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Mobile;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author weddou
 */
@Local
public interface MobileFacadeLocal {

    void create(Mobile mobile);

    void edit(Mobile mobile);

    void remove(Mobile mobile);

    Mobile find(Object id);

    List<Mobile> findAll();

    List<Mobile> findRange(int[] range);

    int count();
    
}
