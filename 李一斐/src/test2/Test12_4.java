package test2;

import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

class ThisPanel extends Panel{
	public ThisPanel(){
		this.add(new JButton("JButton1"));
		this.add(new JButton("JButton2"));
		this.add(new JButton("JButton3"));
	}
}
public class Test12_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame frame=new JFrame("Exercise12_4");
		frame.setLayout(new FlowLayout());
		frame.setSize(800, 300);
		ThisPanel pane1 =new ThisPanel();
		ThisPanel pane2 =new ThisPanel();
		frame.add(pane1);
		frame.add(pane2);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

