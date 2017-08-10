import java.util.*;


class Student implements Comparable{

	String name;
	int id;
	double gpa;

	public Student(){}
	public Student(String n,int i,double g){
		name=n;
		id=i;
		gpa=g;
	}

	public int compareTo(Object obj){
		Student other=(Student)obj;

		if(this.gpa==other.gpa){
			return 0;
		}else if(this.gpa>other.gpa){
			return -1;
		}else{
			return 1;
		}
	}

	public String toString(){
		return id + "\t"
				+ name + "\t"
				+ gpa;

	}

}

class TestComparable{

	public static void main(String[] arg){
		/*
		TreeSet<Student> set=new TreeSet<>();


		set.add(new Student("Thomas",111,3.8));
		set.add(new Student("John",222,3.9));
		set.add(new Student("George",333,3.4));

		System.out.println("¨ÌGPA±Æ§Ç");
		for(Student tmp:set){
			System.out.println(tmp);
		}
		*/

		ArrayList<Student> list=new ArrayList<>();


		list.add(new Student("Thomas",111,3.8));
		list.add(new Student("John",222,3.9));
		list.add(new Student("George",333,3.4));

		System.out.println("¨ÌGPA±Æ§Ç");
		Collections.sort(list);
		for(Student tmp:list){
			System.out.println(tmp);
		}
		
	}
}
