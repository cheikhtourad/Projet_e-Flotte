/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Type_Objet;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author weddou
 */
@Local
public interface Type_ObjetFacadeLocal {

    void create(Type_Objet type_Objet);

    void edit(Type_Objet type_Objet);

    void remove(Type_Objet type_Objet);

    Type_Objet find(Object id);

    List<Type_Objet> findAll();

    List<Type_Objet> findRange(int[] range);

    int count();
    
}
