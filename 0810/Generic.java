import java.util.*;

class Generic{
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    //list.add("dsdfdf");
    int sum = 0;

    for(Integer v: list){
      //Integer tmp = (Integer)v;
      sum = sum+v;
    }
    System.out.println(sum);
  }
}
