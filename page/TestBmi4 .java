package health.master;

import health.bmi.*;
import health.std.*;


class TestBmi4{
	public static void main(String[] arg){
		Health body1=new Bmi4(70,1.7);
		System.out.println("�魫:" + body1.getWeight() + "����");
		System.out.println("����:" + body1.getHeight() + "����");
		System.out.println("BMI��:" + body1.getValue());
		System.out.println("�魫���A:" + body1.status());
		
		System.out.println("--------");
		body1=new StdWeight4(70,1.7);
		System.out.println("�魫:" + body1.getWeight() + "����");
		System.out.println("����:" + body1.getHeight() + "����");
		System.out.println("�з��魫�d��:" + ((StdWeight4)body1).min() + " ~ " + ((StdWeight4)body1).max() + "����" );
		System.out.println("�魫���A:" + body1.status());
		
	}

}