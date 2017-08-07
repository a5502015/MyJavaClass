abstract class OverTunnel{

	private double speed,tunnel;
	private double trainLen;

	public OverTunnel(){}

	public OverTunnel(double sp,double tl){
		setSpeed(sp);
		setTunnel(tl);
	}

	public OverTunnel(double sp,double tl,double ln){
		setSpeed(sp);
		setTunnel(tl);
		setTrainLen(ln);
	}

	public void setSpeed(double s){
		if(s>0){
			speed=s;
		}
	}

	public void setTunnel(double t){
		if(t>0){
			tunnel=t;
		}
	}

	public double getSpeed(){
		return speed;
	}

	public double getTunnel(){
		return tunnel;
	}

	public void setTrainLen(double len){
		if(len>0){
			trainLen=len;
		}
	}

	public double getTrainLen(){
		return trainLen;
	}

	public abstract double passTime();//�ŧi����H �j����loverride
	
}


class HeadOverTunnel2 extends OverTunnel{

	public HeadOverTunnel2(){}

	public HeadOverTunnel2(double sp,double tl){
		super(sp,tl);
	}

	public double passTime(){
		return super.getTunnel()/super.getSpeed()*60*60;
	}
}

class TailOverTunnel2 extends OverTunnel{

	public TailOverTunnel2(){}

	public TailOverTunnel2(double sp,double tl,double ln){
		super(sp,tl,ln);
	}

	public double passTime(){
		return (super.getTunnel()+super.getTrainLen())/super.getSpeed()*60*60;
	}

}

class PassTunnel2{
	public static void main(String[] arg){
		HeadOverTunnel2 hot=new HeadOverTunnel2(80,0.8);
		System.out.println("�����t��:" + hot.getSpeed() + "km/h");
		System.out.println("�G�D����:" + hot.getTunnel() + "km");
		System.out.println("�����Y�q�z�G�ɶ�:" + hot.passTime() + "��");
		System.out.println("----------");
		TailOverTunnel2 tot=new TailOverTunnel2(80,0.8,0.2);
		System.out.println("�����t��:" + tot.getSpeed() + "km/h");
		System.out.println("�G�D����:" + tot.getTunnel() + "km");
		System.out.println("��������:" + tot.getTrainLen() + "km");
		System.out.println("�������q�z�G�ɶ�:" + tot.passTime() + "��");

	}

}
