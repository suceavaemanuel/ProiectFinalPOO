import Pachet.*;

import javax.swing.*;
import java.awt.*;


public class ProiectFinalPOO {
    private JButton raspuns1;
    private JButton raspuns3;
    private JButton raspuns2;
    private JList list1;
    private JLabel problema;
    private JPanel rootPanel;
    private JButton ajuta;
    private JButton verifica;

    public static void main(String[] args) {
        //Desenam tot.
        JFrame frame = new JFrame();
        frame.setContentPane(new ProiectFinalPOO().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
