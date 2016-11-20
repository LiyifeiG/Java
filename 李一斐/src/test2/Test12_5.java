package test2;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Test12_5 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame frame=new JFrame("Exercise12_5");
		frame.setLayout(new GridLayout(1, 4));
		frame.setSize(300, 200);
		Border bd = BorderFactory.createLineBorder(Color.GREEN,2);
		JLabel labe1 = new JLabel("a");
		labe1.setBorder(bd);
		JLabel labe2 = new JLabel("b");
        labe2.setBorder(bd);
        JLabel labe3 = new JLabel("c");
        labe3.setBorder(bd);
        JLabel labe4 = new JLabel("d");
        labe4.setBorder(bd);
        frame.add(labe1);
        frame.add(labe2);
        frame.add(labe3);
        frame.add(labe4);
        frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	
	}
}
