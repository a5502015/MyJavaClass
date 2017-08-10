import java.util.*;
class TestMap1{
  public static void main(String[] args) {
    HashMap map = new HashMap();

    map.put(1,"one");
    map.put(2,"two");
    map.put("3rd",true);
    map.put(true,true);
    map.put("2","two");

    System.out.println(map);

    System.out.println("3rd is " + map.containsKey("3rd"));
    System.out.println("is two in map ? " + map.containsValue("two"));
    System.out.println("del key is true in map " + map.remove(true));
    System.out.println("key" + map.keySet());
    System.out.println("value " + map.values());

    for(Object key: map.keySet()){
      System.out.println("Key :" + key + " value :" + map.get(key));
    }

  }
}
