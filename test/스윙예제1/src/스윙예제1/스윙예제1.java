package ½ºÀ®¿¹Á¦1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ½ºÀ®¿¹Á¦1 extends JFrame{
	private ImageIcon[]icon= {
			new ImageIcon("img\\p1.jpg"),
			new ImageIcon("img\\p2.jpeg"),
			new ImageIcon("img\\p3.jpeg")
	};
	private JLabel imgLabel=new JLabel(icon[0]);
	public ½ºÀ®¿¹Á¦1() {
		setTitle("¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		JButton btn2=new JButton("<");
		btn2.addActionListener(new MyActionListener2());
		JButton btn=new JButton(">");
		btn.addActionListener(new MyActionListener());
		c.add(imgLabel, BorderLayout.CENTER);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn, BorderLayout.EAST);
		setSize(500, 400);		
		setVisible(true);
		
	}
	int num=0;
	private class MyActionListener implements ActionListener{	
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(num<=1) {
				num++;
				imgLabel.setIcon(icon[num]);
			}
		}
	}
	private class MyActionListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(num>=1) {
				num--;
				imgLabel.setIcon(icon[num]);
			}
		}
	}
	public static void main(String[]args) {
		new ½ºÀ®¿¹Á¦1();
	}
}