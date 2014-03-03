/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Zone;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author weddou
 */
@Local
public interface ZoneFacadeLocal {

    void create(Zone zone);

    void edit(Zone zone);

    void remove(Zone zone);

    Zone find(Object id);

    List<Zone> findAll();

    List<Zone> findRange(int[] range);

    int count();
    
}
