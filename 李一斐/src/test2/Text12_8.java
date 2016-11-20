package test2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Text12_8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame frame=new JFrame("Exercise12_6");
		frame.setLayout(new GridLayout(2,3));		//创建网格布局
		frame.setSize(300, 200);
		Border bd = BorderFactory.createLineBorder(Color.GREEN,2);	//创建边界线
		Font myFont = new Font("TimesRoman",1,20);		//创建一个字体对象  字体名称是TimesRoman 1是表示黑体   20是表示大小
		
		JLabel jb1 = new JLabel("black");
        jb1.setBorder(bd);
        jb1.setFont(myFont);			
        jb1.setForeground(Color.BLACK);        //设置字体颜色
        jb1.setToolTipText("black");			//设置工具提示内容
        
		JLabel jb2 = new JLabel("blue");
        jb2.setBorder(bd);
        jb2.setFont(myFont);
        jb2.setForeground(Color.BLUE);
        jb2.setToolTipText("blue");
        
		JLabel jb3 = new JLabel("cyan");
        jb3.setBorder(bd);
        jb3.setFont(myFont);
        jb3.setForeground(Color.CYAN);
        jb3.setToolTipText("cyan");
        
		JLabel jb4 = new JLabel("green");
        jb4.setBorder(bd);
        jb4.setFont(myFont);
        jb4.setForeground(Color.GREEN);
        jb4.setToolTipText("green");
        
		JLabel jb5 = new JLabel("magenta");
        jb5.setBorder(bd);
        jb5.setFont(myFont);
        jb5.setForeground(Color.MAGENTA);
        jb5.setToolTipText("magenta");
        
		JLabel jb6 = new JLabel("orange");
        jb6.setBorder(bd);
        jb6.setFont(myFont);
        jb6.setForeground(Color.ORANGE);
        jb6.setToolTipText("orange");
        
        frame.add(jb1);
        frame.add(jb2);
        frame.add(jb3);
        frame.add(jb4);
        frame.add(jb5);
        frame.add(jb6);
        frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	

        

	}

}



