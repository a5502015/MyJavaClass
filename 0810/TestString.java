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

    System.out.println("s1 & s2 �O�_�a�}�ۦP? " + (s1==s2));
    System.out.println("s3 & s4 �O�_�a�}�ۦP? " + (s3==s4));
    System.out.println("s3 & s5 �O�_�a�}�ۦP? " + (s3==s5));
    System.out.println("s1 & s2 �O�_���e�ۦP? " + s1.equals(s2));
    System.out.println("s5 & s3 �O�_���e�ۦP? " + s5.equals(s3));
    System.out.println("s1 & s5 �O�_���e�ۦP? " + s1.equals(s5));
    System.out.println("s1 & s3 �O�_���e�ۦP? " + s1.equals(s3));

    if(s4.compareTo(s5)==0){
      System.out.println("s4 == s5");
    }else if(s4.compareTo(s5)>0){
      System.out.println("s4 > s5");
    }else{
      System.out.println("s4 < s5");
    }

    System.out.println("s5����" + s5.length());
    System.out.println("s5 �Ĥ@�Ӧr" + s5.charAt(1));
    System.out.println("s5 �}�Y�O�_�Oab " + s5.startsWith("ab"));
    System.out.println("s5 �����O�_�Oab " + s5.endsWith("ab"));
    s5 = s5.concat("aef");
    System.out.println(s5);
    System.out.println("�qs5�r��e�ݧ�a����m " + s5.indexOf("a"));
    System.out.println("�qs5�r����ݧ�a����m " + s5.lastIndexOf("a"));
    System.out.println(s5.toUpperCase());
    System.out.println(s5.toUpperCase().toString());
    System.out.println(s5.replace("a","A"));
    System.out.println(s5);

    System.out.println(s5.substring(1,4));
  }
}
