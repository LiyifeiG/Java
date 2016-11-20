package test2;

import java.awt.FlowLayout;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Test12_1 {

	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("Exercise12_1");
		frame.setLayout(new FlowLayout());
		frame.setSize(800, 300);
		JPanel pane1 = new JPanel(new FlowLayout());
        pane1.add(new JButton("Button1"));
        pane1.add(new JButton("Button2"));
        pane1.add(new JButton("Button3"));
        JPanel pane2 = new JPanel(new FlowLayout());
        pane2.add(new JButton("Button4"));
        pane2.add(new JButton("Button5"));
        pane2.add(new JButton("Button6"));
        frame.add(pane1);
        frame.add(pane2);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
