import java.util.*;
class TestQue2{
  public static void main(String[] args) {
    PriorityQueue st = new PriorityQueue();
    st.offer("TOM");
    st.offer("KAN");
    st.offer("MARY");
    st.offer("LIN");
    System.out.println(st);
    //System.out.println(st.peek());
    System.out.println("¥ýÀR¥ý¥X");

    while(! st.isEmpty()){
      System.out.println(st.poll());
    }
    System.out.println(st);
  }
}
