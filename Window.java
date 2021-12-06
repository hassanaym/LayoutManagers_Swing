import java.awt.Color;
import javax.swing.*;
import java.awt.*;

class Window extends JFrame {
    Window(){
        setTitle("New window");
        setSize(400, 200);
        setVisible(true);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setResizable(true);


        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5,1,20,10));

        JButton b1 = new JButton("Save");
        p.add(b1);

        JButton b2 = new JButton("Save");
        p.add(b2);


        JButton b3 = new JButton("Save");
        p.add(b3);

        JButton b4 = new JButton("Save");
        p.add(b4);

        JButton b5 = new JButton("Save");
        p.add(b5);

        JButton b6 = new JButton("Save");
        p.add(b6);



        add(p);
        
    }

    public static void main (String[] args){
        Window w = new Window(); 
    }
}