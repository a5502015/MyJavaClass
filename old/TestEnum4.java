class TestEnum4{
  enum Week{
    Sunday{public String toString(){return "星期天";}},
    Monday{public String toString(){return "星期一";}},
    Tuesday{public String toString(){return "星期2";}},
    Wednesday{public String toString(){return "星期3";}},
    Thursday{public String toString(){return "星期4";}},
    Friday{public String toString(){return "星期5";}},
    Saturday{public String toString(){return "星期6";}};
  }

  public static void main(String[] args) {
    for(Week temp: Week.values()){
      System.out.println(temp);
    }
  }
}
