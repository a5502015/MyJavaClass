import java.util.Calendar;

class Student{
	private String name;
	private int year,month,day;
	
	public Student(){}
	
	public Student(String n,int y,int m,int d){
		setName(n);
		setBirthday(y,m,d);
	}
	
	public void setName(String n){
		if(n!=null){
			name=n;
		}
	}
	
	public String ggetName(){
		return name;
	}
	
	public void setBirthday(int y,int m,int d){
		boolean isLeap = (y%4==0 && y%100!=0 || year%400==0) ;
		
		if (y>0){
			year=y;
		}
		
		if(m>=1 && m<=12){
			month=m;		
		}
		
		switch(m){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(d>=1 && d<=31){
					day=d;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(d>=1 && d<=30){
					day=d;
				}
				break;
			case 2:
				if(isLeap){
					if(d>=1 && d<=29){
						day=d;
					}
				}else{
					if(d>=1 && d<=28){
						day=d;
					}
				}
				
				break;
		}
		
	}
	
	public boolean equals(Object obj){
		if(obj!=null &&  obj instanceof Student){
			Student tmp=(Student)obj;
			
			if(this.year==tmp.year && this.month==tmp.month && this.day==tmp.day){
				return true;
			}
		}
		
		return false;
	}
	
	public int hashCode(){
		int hash=17;
		hash= 83*hash +year;
		hash= 83*hash +month;
		hash= 83*hash +day;
		return hash;
	}
	
	public String toString(){
		Calendar cal=Calendar.getInstance();
		return name + "�ͤ�:" + year + "�~" + month + "��" + day  + "  �~��:" + (cal.get(Calendar.YEAR)-year); 
	}
	
}


class TestEquals3{
	public static void main(String[] arg){
		Student tom=new Student("Tom",1988,2,3);
		Student mary=new Student("Mary",1988,2,3);
		Student kan=new Student("Kan",1988,2,5);
		System.out.println(tom);
		System.out.println(mary);
		System.out.println(kan);
		System.out.println("tom �� hashCode:" + tom.hashCode());
		System.out.println("mary �� hashCode:" + mary.hashCode());
		System.out.println("kan �� hashCode:" + kan.hashCode());
		
		System.out.println("Tom���ͤ�O�_�PMary�ͤ�ۦP" + tom.equals(mary));
		System.out.println("Tom���ͤ�O�_�PKan�ͤ�ۦP" + tom.equals(kan));
		
		System.out.println("Tom���ͤ�O�_�PMary�ͤ�ۦP" + (tom.hashCode()==mary.hashCode()));
		System.out.println("Tom���ͤ�O�_�PKan�ͤ�ۦP" + (tom.hashCode()==kan.hashCode()));
	}

}