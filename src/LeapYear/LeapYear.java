package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class NotValidException extends Exception {

}


public class LeapYear extends JFrame{

    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYear(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(tfYear.getText());
                    if(year <= 0){
                        throw (new NotValidException());
                    }
                    if( (year % 4 == 0) && (year % 100 != 0) || (year%400==0) ){
                        JOptionPane.showMessageDialog(null, "Leap Year");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Not a Leap Year");
                    }
                }
                catch (NotValidException | NumberFormatException a){
                    JOptionPane.showMessageDialog(null, "Not valid");
                }

            }
        });
    }

    public static void main(String[] args) {
        LeapYear year = new LeapYear();
        year.setContentPane(year.panel1);
        year.setSize(400, 300);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setVisible(true);
    }
}
