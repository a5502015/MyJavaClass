import java.util.*;


class Score {
	
	String name;
	int id;
	int chn,eng,math;
	
	public Score(){}
	public Score(String n,int i,int c,int e,int m){
		name=n;
		id=i;
		chn=c;
		eng=e;
		math=m;
	}
	
	
	public int sum(){
		return chn+eng+math;
	}
	
	public int avg(){
		return sum()/3;
	}
	
	
	public String toString(){
		return id + "\t"
				+ name + "\t"
				+ chn + "\t"
				+ eng + "\t"
				+ math + "\t"
				+ sum() + "\t"
				+ avg() + "\n";
	}

}


class SumSort implements Comparator<Score>{
	public int compare(Score x1,Score x2){
		
		if(x1.sum()==x2.sum()){
			return 0;
		}else if(x1.sum()>x2.sum()){
			return 1;
		}else{
			return -1;
		}
	}
}

class NameSort implements Comparator<Score>{
	public int compare(Score x1,Score x2){
		return x1.name.compareTo(x2.name);
	}
}

class ChnSort implements Comparator<Score>{
	public int compare(Score x1,Score x2){
		
		if(x1.chn==x2.chn){
			return 0;
		}else if(x1.chn>x2.chn){
			return 1;
		}else{
			return -1;
		}
	}
}

class TestComparator2{

	public static void main(String[] arg){
				
		SumSort ss=new SumSort();
		NameSort ns=new NameSort();
		ChnSort cs=new ChnSort();
		
		ArrayList<Score> list=new ArrayList<>();
	
		list.add(new Score("Thomas",1,57,67,56));
		list.add(new Score("John",2,87,78,89));
		list.add(new Score("George",3,65,76,56));
		
		System.out.println("依總分排序");
		Collections.sort(list,ss);
		for(Score tmp:list){
			System.out.println(tmp);
		}
		
		System.out.println("依Name排序");
		Collections.sort(list,ns);
		for(Score tmp:list){
			System.out.println(tmp);
		}
		
		System.out.println();
		
		System.out.println("依國文排序");
		Collections.sort(list,cs);
		for(Score tmp:list){
			System.out.println(tmp);
		}
		
		System.out.println();
		
		TreeMap<String,Score> map=new TreeMap<>();
		
		map.put("B班",new Score("Thomas",1,57,67,56));
		map.put("A班",new Score("John",2,87,78,89));
		map.put("C班",new Score("George",3,65,76,56));
		//map.put(1,"Test");
		
		//System.out.println(map);
		
		for(Object obj:map.keySet()){
			System.out.print(obj + ":\t");
			System.out.println(map.get(obj));
		}
		
	}
}