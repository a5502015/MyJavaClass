class Swap <T>{
 T o1,o2;
 public Swap(T x,T y){
   o1 = x;
   o2 = y;
 }
 public void change(){
   T temp = o1;
   o1 = o2;
   o2 = temp;
 }
}
class TestSwap{
  public static void main(String[] args) {
    Swap<Integer> sw1 = new Swap<>(10,20);
    System.out.println("before :" + sw1.o1 + " " + sw1.o2);
    sw1.change();
    System.out.println("after :" + sw1.o1 + " " + sw1.o2);

    //Swap<float> sw2 = new Swap<>(10.0F,20.0F);
    /*不可以用基本資料型別!!
    TestSwpa.java:20: error: unexpected type
    Swap<float> sw2 = new Swap<>(10.0F,20.0F);
         ^
  required: reference
  found:    float
    */
    Swap<Float> sw2 = new Swap<>(10.0F,20.0F);
    System.out.println("before :" + sw2.o1 + " " + sw2.o2);
    sw2.change();
    System.out.println("after :" + sw2.o1 + " " + sw2.o2);
  }

}
