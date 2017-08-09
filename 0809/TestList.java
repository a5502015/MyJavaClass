import java.util.*;
class TestList{
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(1);
    list.add("2");
    list.add(2.0);
    list.add(true);
    list.add("2");
    list.add("four");

    System.out.println(list);

    list.add(2,"5.5");
    list.set(3,3.3);
    System.out.println(list);

    System.out.println("for:");
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
    System.out.println("=========================");
    System.out.println("從集合前端向後搜尋有2的索引值" + list.indexOf("2"));
    System.out.println("從集合尾端向前搜尋有2的索引值" + list.lastIndexOf("2"));
  }
}
