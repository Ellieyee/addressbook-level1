package seedu.addressbook;

import java.util.Comparator;
import java.util.HashMap;

public abstract class HashmapComparator implements Comparator<HashMap<String, String>>{
  private final String key;

  public HashmapComparator(String key) {
    this.key = key;
  }

  public int compare(HashMap<String, String> first, HashMap<String, String> second) {
    String firstValue = first.get(key);
    String secondValue = second.get(key);
    return firstValue.compareTo(secondValue);
  }
}
