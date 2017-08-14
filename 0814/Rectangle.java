import java.io.Serializable;

class Rectangle implements Serializable{
	int len,width;
	
	public Rectangle(){}
	
	public Rectangle(int x,int y){
		len=x;
		width=y;
	}
	
	public int area(){
		return len*width;
	}
	

}