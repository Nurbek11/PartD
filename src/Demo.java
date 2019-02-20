import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.awt.event.ActionListener;


public class Demo extends JFrame implements ActionListener{
    JTextField nameField;
    static  Demo obj1;
    static JTextField p1,p2,s1,s2;

    public Demo(){
        super("Demo");
        setSize(150, 310);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
       JLabel oneLabel = new JLabel("Player 1 :");
       add(oneLabel);
       p1 = new JTextField("",8);
       add(p1);
        JLabel twoLabel = new JLabel("Player 2 :");
        add(twoLabel);
         p2 = new JTextField("",8);
        add(p2);
        JLabel threeLabel = new JLabel("Enter the symbol for 1 :");
        add(threeLabel);
        s1 = new JTextField("",8);
        add(s1);
        JLabel fourLabel = new JLabel("Enter the symbol for 2 :");
        add(fourLabel);
        s2 = new JTextField("",8);
        add(s2);
       JButton exit = new JButton("Start");
       exit.addActionListener(e -> actionPerformed(e));
       add(exit);

    }


   public void actionPerformed(ActionEvent e) {
        new TicTacToeGUI();
                obj1.setVisible(false);

    }
}
