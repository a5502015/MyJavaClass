class Passtime{
  private double len,t_speed;
  public Passtime(){}
  public Passtime(double l,double s){
    setlen(l);
    setspeed(s);
  }
  public void setlen(double l){
    if(l>0)
      len = l;
  }
  public void setspeed(double s){
    if(s>0)
      t_speed = s;
  }
  public double getlen(){
    return len;
  }
  public double getspeed(){
    return t_speed;
  }
  public double time(){
    return len/t_speed*(60*60);
  }
}
class Reatime extends Passtime{
  private double t_len;
  public Reatime(){}
  public Reatime(double l,double s,double tl){
    super(l,s);
    settlen(tl);
  }
  public void settlen(double l){
    if(l>0)
      t_len = l;
  }
  public double gettlen(){
    return t_len;
  }
  public double time(){
    double alllen;
    alllen = super.getlen()+t_len;
    super.setlen(alllen);
    return super.time();
  }
}
class Caltime{
  public static void main(String[] args) {
    Passtime t1 = new Passtime(1,80);
    Reatime t2 = new Reatime(1,80,0.3);

    System.out.println("t1 = " + t1.time() + " t2 = " + t2.time());

  }
}
