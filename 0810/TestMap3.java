import java.util.*;
class TestMap3{
  public static void main(String[] args) {
    TreeMap map = new TreeMap();

    map.put("Tom",23);
    map.put("Kan",30);
    map.put("Ban",23);
    map.put("Marry",26);
    map.put("Helen",25);

    System.out.println(map);
/*
    System.out.println("3rd is " + map.containsKey("3rd"));
    System.out.println("is two in map ? " + map.containsValue("two"));
    System.out.println("del key is true in map " + map.remove(true));
    System.out.println("key" + map.keySet());
    System.out.println("value " + map.values());
*/
    for(Object key: map.keySet()){
      System.out.println("Key :" + key + " value :" + map.get(key));
    }

  }
}
