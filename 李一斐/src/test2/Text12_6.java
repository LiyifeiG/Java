package test2;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Text12_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame frame=new JFrame("Exercise12_6");
		frame.setLayout(new GridLayout(2,2));		//创建网格布局
		frame.setSize(1000, 500);
		Border bd = BorderFactory.createLineBorder(Color.GREEN,2);	//创建边界线
		JLabel labe1 = new JLabel(new ImageIcon("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\benbenla-08b.jpg"));
        labe1.setBorder(bd);
        JLabel labe2 = new JLabel(new ImageIcon("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\139-150602120030.jpg"));
        labe2.setBorder(bd);
        JLabel labe3 = new JLabel(new ImageIcon("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\20150718160110_CjanP.thumb.700_0.jpeg"));
        labe3.setBorder(bd);
        JLabel labe4 = new JLabel(new ImageIcon("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\139-150FQ13250.jpg"));
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





////public class G12_6 {
////
////    public static void main(String[] args){
////
////        JFrame jf = new JFrame();
////
////        jf.setLayout(new GridLayout(2,2));
////
////        jf.setSize(300,200);
////
////        Border bd = BorderFactory.createLineBorder(Color.BLACK,1);
////
//        JLabel jb1 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\1.jpg"));
//
//        jb1.setBorder(bd);
//
////        JLabel jb2 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\2.jpg"));
////
////        jb2.setBorder(bd);
////
////        JLabel jb3 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\3.jpg"));
////
////        jb3.setBorder(bd);
////
////        JLabel jb4 = new JLabel(new ImageIcon("F:\\杨帆\\Pictures\\4.jpg"));
////
////        jb4.setBorder(bd);
////
////        jf.add(jb1);
////
////        jf.add(jb2);
////
////        jf.add(jb3);
////
////        jf.add(jb4);
////
////        jf.setVisible(true);
////
////    }
////
////}
