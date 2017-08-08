import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CtoF2 {
	private JFrame frame;
	private JLabel hint ,ans;
	private JTextField enter;
	private JButton star ,clear;
	public CtoF2(){
		frame = new JFrame("�����ؤ�ū�");
		frame.setLayout(null);
		hint = new JLabel("�п�J���ū�");
		hint.setBounds(5,5,100,20);
		frame.add(hint);

		enter = new JTextField("0");
		enter.setBounds(110,5,100,20);
		frame.add(enter);

		star = new JButton("�D�ؤ�ū�");
		star.setBounds(5,30,100,20);
		frame.add(star);
		//��k�@
		//BteListenter listener1 = new BteListenter();
		//�@�M�G
		//star.addActionListener(listener1);
		//��k�T
		star.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double c = 0.0,f = 0.0;
				try{
					c = Double.parseDouble(enter.getText());
					f = 9.0/5.0*c+22;
					String result = String.format("<html>��� :%.2f��<br>�ؤ� :%.2f</html>",c,f);
					ans.setText(result);
					star.setEnabled(false);
					clear.setEnabled(true);
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(null,"�S�����e!!","��J���~",JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		clear = new JButton("�M��");
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
	/*��k�@
	class BteListenter implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double c = 0.0,f = 0.0;
			try{
				c = Double.parseDouble(enter.getText());
				f = 9.0/5.0*c+22;
				String result = String.format("��� :%.0f�� �ؤ� :%.2f",c,f);
				ans.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"�S�����e!!","��J���~",JOptionPane.ERROR_MESSAGE);
			}

		}
	}*/
	//��k�G
	/*
	ActionListener listener1 = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			double c = 0.0,f = 0.0;
			try{
				c = Double.parseDouble(enter.getText());
				f = 9.0/5.0*c+22;
				String result = String.format("��� :%.0f�� �ؤ� :%.2f",c,f);
				ans.setText(result);
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null,"�S�����e!!","��J���~",JOptionPane.ERROR_MESSAGE);
			}

		}
	};
	*/
}
