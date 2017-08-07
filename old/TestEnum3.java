class TestEnum3{
  enum Week{
    Sunday("java,photoshop"),
    Monday("c,c++"),
    Tuesday("android,3D"),
    Wednesday("Python,java"),
    Thursday("C#,c/c++"),
    Friday("PHP,CAD"),
    Saturday("PYTHON");

    private String course;

    private Week(String s){
      course = s;
    }
    public String getCourse(){
      return "½Òµ{ :" + course;
    }

  }
  public static void main(String[] args) {
    for(Week temp: Week.values()){
      System.out.println(temp + temp.getCourse());
    }
    System.out.println("===============");
    System.out.println(Week.Sunday + Week.Sunday.getCourse());
  }
}
