import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CtoF2{
	
	private JFrame frame;
	private JLabel lb1,lb2;
	private JTextField tf1;
	private JButton btn1,btn2;
	

	public CtoF2(){
		frame=new JFrame("攝氏轉華氏溫度");
		frame.setLayout(null);
		
		lb1=new JLabel("請輸入攝氏溫度");
		lb1.setBounds(5,5,100,20);
		frame.add(lb1);
		
		tf1=new JTextField("0");
		tf1.setBounds(110,5,100,20);
		frame.add(tf1);
		
		btn1=new JButton("求華氏溫度");
		btn1.setBounds(5,30,100,20);
		frame.add(btn1);
		//方法 1.2  將1.1實作類別載入記憶體(建立按鈕的監聽物件)
		//BtnListener listener1=new BtnListener();
		//方法 1.3  將1.2的監聽物件設定給按鈕元件
		//btn1.addActionListener(listener1);
		
		//方法 2.2 將2.1的監聽物件設定給按鈕元件
		//btn1.addActionListener(listener1);
		
		//方法 3 將匿名類別的匿名監聽物設定給按鈕元件
		
		btn1.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					double c=0,f=0;
					try{
						c=Double.parseDouble(tf1.getText());
						f=9.0/5.0*c+32;
						String result=String.format("<html>攝氏:%.2f度<br>華氏:%.2f度</html>",c,f);
						
						lb2.setText(result);
						
						btn1.setEnabled(false);
						btn2.setEnabled(true);
						
						
					}catch(NumberFormatException ex){
						JOptionPane.showMessageDialog(null,"沒有輸入內容值","輸入錯誤",JOptionPane.ERROR_MESSAGE);
						tf1.setText("0");
					}
				}
			}
		);
		
		
		btn2=new JButton("清除");
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
	
	//方法 1.1 實作按鈕元件規定的介面
	/*
	class BtnListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e){
			double c=0,f=0;
			try{
				c=Double.parseDouble(tf1.getText());
				f=9.0/5.0*c+32;
				String result=String.format("攝氏:%.2f度,華氏:%.2f度",c,f);
				
				lb2.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"沒有輸入內容值","輸入錯誤",JOptionPane.ERROR_MESSAGE);
				tf1.setText("0");
			}
		}
	}
	*/
	
	
	//方法 2.1 用匿名類別建立並實作按鈕的監聽物件	
	/*
	ActionListener listener1=new ActionListener(){
		public void actionPerformed(ActionEvent e){
			double c=0,f=0;
			try{
				c=Double.parseDouble(tf1.getText());
				f=9.0/5.0*c+32;
				String result=String.format("攝氏:%.2f度,華氏:%.2f度",c,f);
				
				lb2.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"沒有輸入內容值","輸入錯誤",JOptionPane.ERROR_MESSAGE);
				tf1.setText("0");
			}
		}
		
	};
	*/
		
	

}

