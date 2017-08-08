import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CtoF2{
	
	private JFrame frame;
	private JLabel lb1,lb2;
	private JTextField tf1;
	private JButton btn1,btn2;
	

	public CtoF2(){
		frame=new JFrame("�����ؤ�ū�");
		frame.setLayout(null);
		
		lb1=new JLabel("�п�J���ū�");
		lb1.setBounds(5,5,100,20);
		frame.add(lb1);
		
		tf1=new JTextField("0");
		tf1.setBounds(110,5,100,20);
		frame.add(tf1);
		
		btn1=new JButton("�D�ؤ�ū�");
		btn1.setBounds(5,30,100,20);
		frame.add(btn1);
		//��k 1.2  �N1.1��@���O���J�O����(�إ߫��s����ť����)
		//BtnListener listener1=new BtnListener();
		//��k 1.3  �N1.2����ť����]�w�����s����
		//btn1.addActionListener(listener1);
		
		//��k 2.2 �N2.1����ť����]�w�����s����
		//btn1.addActionListener(listener1);
		
		//��k 3 �N�ΦW���O���ΦW��ť���]�w�����s����
		
		btn1.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					double c=0,f=0;
					try{
						c=Double.parseDouble(tf1.getText());
						f=9.0/5.0*c+32;
						String result=String.format("<html>���:%.2f��<br>�ؤ�:%.2f��</html>",c,f);
						
						lb2.setText(result);
						
						btn1.setEnabled(false);
						btn2.setEnabled(true);
						
						
					}catch(NumberFormatException ex){
						JOptionPane.showMessageDialog(null,"�S����J���e��","��J���~",JOptionPane.ERROR_MESSAGE);
						tf1.setText("0");
					}
				}
			}
		);
		
		
		btn2=new JButton("�M��");
		btn2.setBounds(110,30,100,20);
		btn2.setEnabled(false);
		frame.add(btn2);
		btn2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					tf1.setText("0");
					lb2.setText("");
					btn2.setEnabled(false);
					btn1.setEnabled(true);
				}
				
			}
		);
		
		
		lb2=new JLabel("[]");
		lb2.setBounds(5,55,200,40);
		frame.add(lb2);
		
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] arg){
		new CtoF2();
		
	}
	
	//��k 1.1 ��@���s����W�w������
	/*
	class BtnListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e){
			double c=0,f=0;
			try{
				c=Double.parseDouble(tf1.getText());
				f=9.0/5.0*c+32;
				String result=String.format("���:%.2f��,�ؤ�:%.2f��",c,f);
				
				lb2.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"�S����J���e��","��J���~",JOptionPane.ERROR_MESSAGE);
				tf1.setText("0");
			}
		}
	}
	*/
	
	
	//��k 2.1 �ΰΦW���O�إߨù�@���s����ť����	
	/*
	ActionListener listener1=new ActionListener(){
		public void actionPerformed(ActionEvent e){
			double c=0,f=0;
			try{
				c=Double.parseDouble(tf1.getText());
				f=9.0/5.0*c+32;
				String result=String.format("���:%.2f��,�ؤ�:%.2f��",c,f);
				
				lb2.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"�S����J���e��","��J���~",JOptionPane.ERROR_MESSAGE);
				tf1.setText("0");
			}
		}
		
	};
	*/
		
	

}

