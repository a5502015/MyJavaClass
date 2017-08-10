import java.util.*;
class TestStack{
  public static void main(String[] args) {
    Stack st = new Stack();
    st.push("TOM");
    st.push("KAN");
    st.push("MARY");
    st.push("LIN");
    System.out.println(st);
    System.out.println(st.peek());
    System.out.println("¥ýÀR­Ô¥X");

    while(! st.isEmpty()){
      System.out.println(st.pop());
    }
    System.out.println(st);
  }
}
