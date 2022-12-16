package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{

    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYear(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double year = Double.parseDouble(tfYear.getText());

            }
        });
    }

    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        year.setContentPane(year.panel1);
        year.setSize(400, 600);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setVisible(true);
    }
}
