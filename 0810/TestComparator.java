import java.util.*;


class Student2 {
	
	String name;
	int id;
	double gpa;
	
	public Student2(){}
	public Student2(String n,int i,double g){
		name=n;
		id=i;
		gpa=g;
	}
	
	
	
	public String toString(){
		return id + "\t"
				+ name + "\t"
				+ gpa;
		
	}

}


class GpaSort implements Comparator{
	public int compare(Object obj1,Object obj2){
		Student2 x1=(Student2)obj1;
		Student2 x2=(Student2)obj2;
		
		if(x1.gpa==x2.gpa){
			return 0;
		}else if(x1.gpa>x2.gpa){
			return 1;
		}else{
			return -1;
		}
	}
}


class NameSort implements Comparator{
	public int compare(Object obj1,Object obj2){
		Student2 x1=(Student2)obj1;
		Student2 x2=(Student2)obj2;
		
		return x1.name.compareTo(x2.name);
	}
}



class TestComparator{

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
		
		GpaSort gs=new GpaSort();
		NameSort ns=new NameSort();
		
		ArrayList<Student2> list=new ArrayList<>();
	
		list.add(new Student2("Thomas",111,3.8));
		list.add(new Student2("John",222,3.9));
		list.add(new Student2("George",333,3.4));
		
		System.out.println("¨ÌGPA±Æ§Ç");
		Collections.sort(list,gs);
		for(Student2 tmp:list){
			System.out.println(tmp);
		}
		
		System.out.println("¨ÌName±Æ§Ç");
		Collections.sort(list,ns);
		for(Student2 tmp:list){
			System.out.println(tmp);
		}
		
		System.out.println();
		
		TreeMap<String,Student2> map=new TreeMap<>();
		
		map.put("B¯Z",new Student2("Thomas",111,3.8));
		map.put("A¯Z",new Student2("John",222,3.9));
		map.put("C¯Z",new Student2("George",333,3.4));
		//map.put(1,"Test");
		
		//System.out.println(map);
		
		for(Object obj:map.keySet()){
			System.out.print(obj + ":");
			System.out.println(map.get(obj));
		}
		
	}
}