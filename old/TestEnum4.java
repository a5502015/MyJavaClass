class TestEnum4{
  enum Week{
    Sunday{public String toString(){return "�P����";}},
    Monday{public String toString(){return "�P���@";}},
    Tuesday{public String toString(){return "�P��2";}},
    Wednesday{public String toString(){return "�P��3";}},
    Thursday{public String toString(){return "�P��4";}},
    Friday{public String toString(){return "�P��5";}},
    Saturday{public String toString(){return "�P��6";}};
  }

  public static void main(String[] args) {
    for(Week temp: Week.values()){
      System.out.println(temp);
    }
  }
}
