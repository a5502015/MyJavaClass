import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Bmi{
		private double weight,height;

		public Bmi(){}

		public Bmi(double w,double h){
			setWeight(w);
			setHeight(h);
		}

		public void setHeight(double ht){
			if(ht>=0.9){
				height=ht;
			}
		}

		public void setWeight(double wt){
			if(wt>=35){
				weight=wt;
			}
		}

		public double getWeight(){
			return weight;
		}

		public double getHeight(){
			return height;
		}


		public double getValue(){
			return weight/height/height;
		}

		public String status(){
			double bmi=getValue();

			return bmi>24 ? "過重" : bmi<18.5 ? "過輕" : "標準";
		}

		public String toString(){
			return String.format("<html>BMI值:%.2f<br>體重狀態:%s<html>",getValue(),status());
		}


}
class BmiGui {

	JFrame frame;
	JLabel lb1,lb2,lb3;
	JTextField tf1,tf2;
	JButton btn1,btn2;


	public BmiGui(){
		frame=new JFrame("BMI");
		frame.setLayout(null);

		lb1=new JLabel("請輸入體重(公斤)");
		lb1.setBounds(5,5,100,20);
		frame.add(lb1);

		tf1=new JTextField("0");
		tf1.setBounds(110,5,100,20);
		frame.add(tf1);

		lb2=new JLabel("請輸入身高(公分)");
		lb2.setBounds(5,30,100,20);
		frame.add(lb2);

		tf2=new JTextField("0");
		tf2.setBounds(110,30,100,20);
		frame.add(tf2);

		btn1=new JButton("求BMI");
		btn1.setBounds(5,55,100,20);
		frame.add(btn1);
		btn1.addActionListener(listener);

		btn2=new JButton("清除");
		btn2.setBounds(110,55,100,20);
		frame.add(btn2);
		btn2.addActionListener(listener);
		btn2.setEnabled(false);

		lb3=new JLabel("");
		lb3.setBounds(5,80,200,40);
		frame.add(lb3);

		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] arg){
		new BmiGui();
	}
	ActionListener listener = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==btn1){
				double kg=0,m=0;
				try{
					kg = Double.parseDouble(tf1.getText());
					m = Double.parseDouble(tf2.getText())/100;
					lb3.setText(new Bmi(kg,m).toString());
					btn1.setEnabled(false);
					btn2.setEnabled(true);
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null,"NO Enter!!","Enter Error",JOptionPane.ERROR_MESSAGE);
				}
			}else if(e.getSource()==btn2){
				tf1.setText("0");
				tf2.setText("0");
				lb3.setText("");
				btn1.setEnabled(true);
				btn2.setEnabled(false);
			}
		}
	};
}
