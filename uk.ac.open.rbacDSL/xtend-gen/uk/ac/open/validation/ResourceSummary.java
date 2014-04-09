package uk.ac.open.validation;

import java.util.List;
import uk.ac.open.rbacDSL.Permission;

@SuppressWarnings("all")
public class ResourceSummary {
  private Object name = null;
  
  private List<String> permissions = null;
  
  public ResourceSummary(final String name, final List<Permission> permissions) {
    this.name = name;
    for (final Permission permission : permissions) {
      String _name = permission.getName();
      this.permissions.add(_name);
    }
  }
  
  public Object getName() {
    return this.name;
  }
  
  public boolean isEmpty() {
    return this.permissions.isEmpty();
  }
  
  public boolean removePermission(final Permission permission) {
    String _name = permission.getName();
    boolean _remove = this.permissions.remove(_name);
    return _remove;
  }
}
