import java.util.*;
class TestSet3{
  public static void main(String[] args) {
    TreeSet tree = new TreeSet();
    tree.add("one");
    tree.add("two");
    tree.add("three");
    tree.add("four");
    tree.add("five");

    System.out.println(tree);
    //tree.add(10);
    /*
    Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot
be cast to java.lang.Integer
      at java.lang.Integer.compareTo(Unknown Source)
      at java.util.TreeMap.put(Unknown Source)
      at java.util.TreeSet.add(Unknown Source)
      at TestSet3.main(TestSet3.java:12)
    */
    //tree.add(null);
    /*
    Exception in thread "main" java.lang.NullPointerException
      at java.util.TreeMap.put(Unknown Source)
      at java.util.TreeSet.add(Unknown Source)
      at TestSet3.main(TestSet3.java:21)
    */
  }
}
