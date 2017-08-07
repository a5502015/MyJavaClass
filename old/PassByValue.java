class Employee{
  int id;
  String name;
  public Employee(){}
  public Employee(String n,int eid){
    name = n;
    id = eid;
  }
}

class PassByValue{
  public static void  method1(Employee x)  {
    //x.name = "Tommy";
    x = new Employee("°í«ù",123);
    System.out.println("name = " + x.name);
    System.out.println("id = " + x.id);
    System.out.println("method1 end");
  }

  public static void main(String[] args) {
    Employee em = new Employee("Tom" ,101);
    System.out.println("name = " + em.name);
    System.out.println("id = " + em.id);
    System.out.println("call method1");
    method1(em);
    System.out.println("name = " + em.name);
    System.out.println("id = " + em.id);
  }
}
