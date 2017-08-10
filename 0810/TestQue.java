import java.util.*;
class TestQue{
  public static void main(String[] args) {
    ArrayDeque st = new ArrayDeque();
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
