class TestString{
  public static void main(String[] args) {
    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = "abc";
    String s4 = "abc";
    String s5 = "abcd";

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("s3 = " + s3);
    System.out.println("s4 = " + s4);
    System.out.println("s5 = " + s5);

    System.out.println("s1 & s2 是否地址相同? " + (s1==s2));
    System.out.println("s3 & s4 是否地址相同? " + (s3==s4));
    System.out.println("s3 & s5 是否地址相同? " + (s3==s5));
    System.out.println("s1 & s2 是否內容相同? " + s1.equals(s2));
    System.out.println("s5 & s3 是否內容相同? " + s5.equals(s3));
    System.out.println("s1 & s5 是否內容相同? " + s1.equals(s5));
    System.out.println("s1 & s3 是否內容相同? " + s1.equals(s3));

    if(s4.compareTo(s5)==0){
      System.out.println("s4 == s5");
    }else if(s4.compareTo(s5)>0){
      System.out.println("s4 > s5");
    }else{
      System.out.println("s4 < s5");
    }

    System.out.println("s5長度" + s5.length());
    System.out.println("s5 第一個字" + s5.charAt(1));
    System.out.println("s5 開頭是否是ab " + s5.startsWith("ab"));
    System.out.println("s5 結尾是否是ab " + s5.endsWith("ab"));
    s5 = s5.concat("aef");
    System.out.println(s5);
    System.out.println("從s5字串前端找a的位置 " + s5.indexOf("a"));
    System.out.println("從s5字串尾端找a的位置 " + s5.lastIndexOf("a"));
    System.out.println(s5.toUpperCase());
    System.out.println(s5.toUpperCase().toString());
    System.out.println(s5.replace("a","A"));
    System.out.println(s5);

    System.out.println(s5.substring(1,4));
  }
}
