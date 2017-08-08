import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CtoF2 {
	private JFrame frame;
	private JLabel hint ,ans;
	private JTextField enter;
	private JButton star ,clear;
	public CtoF2(){
		frame = new JFrame("攝氏轉華氏溫度");
		frame.setLayout(null);
		hint = new JLabel("請輸入攝氏溫度");
		hint.setBounds(5,5,100,20);
		frame.add(hint);

		enter = new JTextField("0");
		enter.setBounds(110,5,100,20);
		frame.add(enter);

		star = new JButton("求華氏溫度");
		star.setBounds(5,30,100,20);
		frame.add(star);
		//方法一
		//BteListenter listener1 = new BteListenter();
		//一和二
		//star.addActionListener(listener1);
		//方法三
		star.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double c = 0.0,f = 0.0;
				try{
					c = Double.parseDouble(enter.getText());
					f = 9.0/5.0*c+22;
					String result = String.format("<html>攝氏 :%.2f度<br>華氏 :%.2f</html>",c,f);
					ans.setText(result);
					star.setEnabled(false);
					clear.setEnabled(true);
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null,"沒有內容!!","輸入錯誤",JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		clear = new JButton("清除");
		clear.setBounds(110,30,100,20);
		clear.setEnabled(false);
		frame.add(clear);
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				enter.setText("0");
				ans.setText("");
				clear.setEnabled(false);
				star.setEnabled(true);
			}
		});

		ans = new JLabel("");
		ans.setBounds(5,55,200,40);
		frame.add(ans);

		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] arg){
		new CtoF2();

	}
	/*方法一
	class BteListenter implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double c = 0.0,f = 0.0;
			try{
				c = Double.parseDouble(enter.getText());
				f = 9.0/5.0*c+22;
				String result = String.format("攝氏 :%.0f度 華氏 :%.2f",c,f);
				ans.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"沒有內容!!","輸入錯誤",JOptionPane.ERROR_MESSAGE);
			}

		}
	}*/
	//方法二
	/*
	ActionListener listener1 = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			double c = 0.0,f = 0.0;
			try{
				c = Double.parseDouble(enter.getText());
				f = 9.0/5.0*c+22;
				String result = String.format("攝氏 :%.0f度 華氏 :%.2f",c,f);
				ans.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"沒有內容!!","輸入錯誤",JOptionPane.ERROR_MESSAGE);
			}

		}
	};
	*/
}
