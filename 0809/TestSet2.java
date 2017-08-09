import java.util.LinkedHashSet;
class TestSet2{
  public static void main(String[] args) {
    LinkedHashSet set = new LinkedHashSet();
    set.add(1);
    set.add("2");
    set.add(3.0);
    set.add(false);
    set.add("2");
    set.add("four");

    for(Object tmp: set){
      System.out.println(tmp);
    }
    System.out.println("===================");
    System.out.println(set);
    System.out.println("有 " + set.size() + "個");
    System.out.println("is set empty ? " + set.isEmpty());
    System.out.println("is 3.0 inside ? " + set.contains(3.0));
    System.out.println("delete 3.0 " + set.remove(3.0));
    System.out.println(set);
    System.out.println("clear set");
    set.clear();
    System.out.println(set);
    System.out.println("有 " + set.size() + "個");
    System.out.println("is set empty ? " + set.isEmpty());
  }
}
