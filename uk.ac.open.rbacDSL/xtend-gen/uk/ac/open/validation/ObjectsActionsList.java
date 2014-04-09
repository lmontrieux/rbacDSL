package uk.ac.open.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import uk.ac.open.rbacDSL.Assignment;
import uk.ac.open.rbacDSL.Permission;
import uk.ac.open.rbacDSL.RBACObject;
import uk.ac.open.rbacDSL.Role;
import uk.ac.open.validation.ObjectDescription;

@SuppressWarnings("all")
public class ObjectsActionsList {
  private List<ObjectDescription> objects = CollectionLiterals.<ObjectDescription>newArrayList();
  
  public ObjectsActionsList(final List<Role> roles) {
    for (final Role role : roles) {
      EList<Assignment> _assignments = role.getAssignments();
      for (final Assignment assignment : _assignments) {
        {
          ArrayList<String> actions = CollectionLiterals.<String>newArrayList();
          EList<Permission> _actions = assignment.getActions();
          for (final Permission permission : _actions) {
            String _name = permission.getName();
            actions.add(_name);
          }
          RBACObject _object = assignment.getObject();
          String _name_1 = _object.getName();
          boolean _hasObject = this.hasObject(_name_1);
          boolean _not = (!_hasObject);
          if (_not) {
            RBACObject _object_1 = assignment.getObject();
            String _name_2 = _object_1.getName();
            ObjectDescription _objectDescription = new ObjectDescription(_name_2, actions);
            this.objects.add(_objectDescription);
          } else {
            RBACObject _object_2 = assignment.getObject();
            String _name_3 = _object_2.getName();
            ObjectDescription _object_3 = this.getObject(_name_3);
            _object_3.addActions(actions);
          }
        }
      }
    }
  }
  
  public boolean hasObject(final String name) {
    for (final ObjectDescription object : this.objects) {
      boolean _equals = Objects.equal(object.name, name);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public ObjectDescription getObject(final String name) {
    for (final ObjectDescription object : this.objects) {
      boolean _equals = Objects.equal(object.name, name);
      if (_equals) {
        return object;
      }
    }
    return null;
  }
  
  public boolean hasAction(final String object, final String action) {
    for (final ObjectDescription description : this.objects) {
      boolean _equals = Objects.equal(description.name, object);
      if (_equals) {
        return description.hasAction(action);
      }
    }
    return false;
  }
  
  public Boolean hasAllActions(final String object, final List<String> actions) {
    for (final ObjectDescription description : this.objects) {
      boolean _equals = Objects.equal(description.name, object);
      if (_equals) {
        return description.hasAllActions(actions);
      }
    }
    return null;
  }
}
