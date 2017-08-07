package health.master;

import health.bmi.*;
import health.std.*;


class TestBmi4{
	public static void main(String[] arg){
		Health body1=new Bmi4(70,1.7);
		System.out.println("體重:" + body1.getWeight() + "公斤");
		System.out.println("身高:" + body1.getHeight() + "公尺");
		System.out.println("BMI值:" + body1.getValue());
		System.out.println("體重狀態:" + body1.status());
		
		System.out.println("--------");
		body1=new StdWeight4(70,1.7);
		System.out.println("體重:" + body1.getWeight() + "公斤");
		System.out.println("身高:" + body1.getHeight() + "公尺");
		System.out.println("標準體重範圍:" + ((StdWeight4)body1).min() + " ~ " + ((StdWeight4)body1).max() + "公斤" );
		System.out.println("體重狀態:" + body1.status());
		
	}

}