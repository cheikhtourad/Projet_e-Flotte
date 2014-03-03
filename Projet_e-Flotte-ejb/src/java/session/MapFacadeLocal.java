/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Map;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author weddou
 */
@Local
public interface MapFacadeLocal {

    void create(Map map);

    void edit(Map map);

    void remove(Map map);

    Map find(Object id);

    List<Map> findAll();

    List<Map> findRange(int[] range);

    int count();
    
}
