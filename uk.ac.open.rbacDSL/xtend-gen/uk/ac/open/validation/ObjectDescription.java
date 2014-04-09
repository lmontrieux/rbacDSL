package uk.ac.open.validation;

import com.google.common.base.Objects;
import java.util.List;

@SuppressWarnings("all")
public class ObjectDescription {
  public Object name = null;
  
  private List<String> actions = null;
  
  public ObjectDescription(final String name, final List<String> actions) {
    this.name = name;
    this.actions = actions;
  }
  
  public boolean hasAction(final String action) {
    for (final String current : this.actions) {
      boolean _equals = Objects.equal(action, current);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasAllActions(final List<String> actions) {
    for (final String action : actions) {
      boolean _hasAction = this.hasAction(action);
      boolean _not = (!_hasAction);
      if (_not) {
        return false;
      }
    }
    return true;
  }
  
  public void addActions(final List<String> actions) {
    for (final String action : actions) {
      boolean _contains = this.actions.contains(action);
      boolean _not = (!_contains);
      if (_not) {
        this.actions.add(action);
      }
    }
  }
}
