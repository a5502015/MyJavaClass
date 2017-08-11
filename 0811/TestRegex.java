import java.util.regex.*;

class TestRegex{
  public static void main(String[] args) {
    String str = "It was the best of time";
    Pattern pt = Pattern.compile("the");
    Matcher mt = pt.matcher(str);

    System.out.println(str);

    if(mt.find()){
      System.out.println("GET the !!");
    }

     pt = Pattern.compile("w.s");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET was !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("w[a,b,c]s");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET w[a,b,c]s !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("t[^aeo]me");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET t[^aeo]me !!" + mt.group());
     }
     System.out.println("=======================");
     str = "To told me 20 ways to San Jose in 15 minutes";
     pt = Pattern.compile("\\d\\d");
     mt = pt.matcher(str);
     while(mt.find()){
       System.out.println("str = " + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("\\Sin\\S");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET XXinXX !!" + mt.group());
     }
     str = "Longlonglong age, in galaxy far far away";
     System.out.println("================");
     pt = Pattern.compile("gal.{3}");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET gal.{3} !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("(long){2}");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET (long){2} !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("age.*");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET age.* !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("age.*?far");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET age.*?far !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("age.*far");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET age.*far !!" + mt.group());
     }
     System.out.println("========*************========");
     str = "it was the best of times or it was the worst of times";
     pt = Pattern.compile("^it.*?times");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET ^it.*?times !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("\\bor\\b.{3}");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET \\bor\\b.{3} !!" + mt.group());
     }
     System.out.println("================");
     pt = Pattern.compile("\\sit.*times$");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET it.*times$ !!" + mt.group());
     }
     System.out.println("========*************========\n\n");
     str = "george.washington@gmail.com";
     System.out.println("================");
     pt = Pattern.compile("(\\S+?)\\.(\\S+?)@(\\S+)");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println("GET it.*times$ !!" + mt.group(1));
       System.out.println("GET it.*times$ !!" + mt.group(2));
       System.out.println("GET it.*times$ !!" + mt.group(3));
       System.out.println("GET it.*times$ !!" + mt.group(0));
     }
     System.out.println("========*************========\n\n");
     str = "<h1>This is an H1</h1>";
     pt = Pattern.compile("h1");
     mt = pt.matcher(str);
     if(mt.find()){
       System.out.println(mt.replaceAll("p"));
     }
  }
}
