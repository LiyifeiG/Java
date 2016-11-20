package 事件驱动编程和动画;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class Test16_4 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Exercise16_4");
		frame.setLayout(new FlowLayout());
		JPanel pane1 = new JPanel(new FlowLayout());
		frame.add(new Label("Number"));
		JTextField a=new JTextField(8);
		frame.add(a);
		frame.add(new Label("Number"));
		JTextField b=new JTextField(8);
		frame.add(b);
		frame.add(new Label("Result"));
		JTextField c=new JTextField(8);
		frame.add(c);
		System.out.println();
		frame.setSize(600, 300);
		JPanel pane = new JPanel(new FlowLayout());
		JButton add=new JButton("Add");
        pane.add(add);
        JButton subtract=new JButton("Subtract");
        pane.add(subtract);
        JButton multiply=new JButton("Multiply");
        pane.add(multiply);
        JButton divide=new JButton("Divide");
        pane.add(divide);
        frame.add(pane);
        frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		ActionListener OnClick = new ActionListener() {
			            public void actionPerformed(ActionEvent e) {
			                double n1 = Double.parseDouble(a.getText());
			                double n2 = Double.parseDouble(b.getText());
			                double result = 0;
			                switch (e.getActionCommand()){
			                    case "Add": result = n1 + n2; break;
			                    case "Subtract": result = n1 - n2; break;
			                    case "Multiply": result = n1 * n2; break;
			                    case "Divide": if (n2 == 0) { c.setText("除数不能为0"); break;}
			                        result = n1 / n2; break;
			                    default:break;
			                }
			                DecimalFormat format = new DecimalFormat();
			                format.setMaximumFractionDigits(4);
			                if (c.getText() != "") c.setText(format.format(result) + "");
			            }
			        };
			        
			        
			        add.addActionListener(OnClick);
			        subtract.addActionListener(OnClick);
			        multiply.addActionListener(OnClick);
			        divide.addActionListener(OnClick);
	}
}