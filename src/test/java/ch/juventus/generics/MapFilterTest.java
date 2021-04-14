package ch.juventus.generics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class MapFilterTest {

  private final MapFilter mapFilter = new MapFilter();

  @Test
  public void testCleanupString() {
    Map<Integer, String> map = new HashMap<>();
    map.put(0, "A");
    map.put(1, "B");
    map.put(2, "C");
    map.put(3, "A");
    map.put(4, "B");
    map.put(5, "C");

    Map<Integer, String> cleanedMap = mapFilter.cleanup(map, "A");

    assertEquals(2, cleanedMap.size());
    assertTrue(cleanedMap.entrySet().stream().allMatch(entry -> entry.getValue().equals("A")));
  }

  @Test
  public void testCleanupInteger() {
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 0);
    map.put("B", 1);
    map.put("C", 2);
    map.put("D", 1);
    map.put("E", 4);
    map.put("F", 1);

    Map<String, Integer> cleanedMap = mapFilter.cleanup(map, 1);

    assertEquals(3, cleanedMap.size());
    assertTrue(cleanedMap.entrySet().stream().allMatch(entry -> entry.getValue().equals(1)));
  }
}
