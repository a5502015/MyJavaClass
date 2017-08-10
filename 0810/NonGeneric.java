import java.util.*;

class NonGeneric{
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(10);
    list.add(20);
    list.add(30);
    //list.add("dsdfdf");
    int sum = 0;

    for(Object v: list){
      Integer tmp = (Integer)v;
      sum = sum+tmp;
    }
    System.out.println(sum);
  }
}
