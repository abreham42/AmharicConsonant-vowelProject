package getinet;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Getinet {

    JFrame f = new JFrame("BAHIR DAR   NEAR TO TANA");
    JPanel p = new JPanel();
    JButton b = new JButton("ok");
    JButton b1 = new JButton(" Cancel");
    JLabel l = new JLabel(" First  Name");
    JLabel l1 = new JLabel("Second Name");
    JTextField t1 = new JTextField(12);
    JTextField t = new JTextField(12);
    JPanel l2 = new JPanel();
    JButton b2 = new JButton("1");
    JButton b3 = new JButton("2");
    JButton b4 = new JButton("3");
    JButton b5 = new JButton("4");

    public Getinet() {
      // Getinet();

        p.add(l);
        p.add(t);
        f.add(p);
        p.add(l1);
        p.add(t1);
        p.setVisible(true);
        
         f.setVisible(true);
        f.setSize(300, 300);
        f.setBackground(Color.red);
        p.setBackground(Color.green);
        p.add(b);
        p.add(b1);
        l2.add(b2);
        l2.add(b3);
        l2.add(b4);
        l2.add(b5);
         f.add(l2);
        f.setVisible(true);
        f.setSize(300, 300);
        f.setBackground(Color.red);
        //   p.setLayout(new GridBagLayout());
    }

    public static void main(String[] args) {
        Getinet bn = new Getinet();
    }

}
