package SimpleCalc;

import LeapYear.LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Calc extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public Calc(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tfNumber1.getText());
                    double num2 = Double.parseDouble(tfNumber2.getText());
                    double result;

                    if (cbOperations.getSelectedItem().equals("+")) {
                        result = num1 + num2;
                        String str = String.valueOf(result);
                        lblResult.setText(str);
                    } else if (cbOperations.getSelectedItem().equals("-")) {
                        result = num1 - num2;
                        String str = String.valueOf(result);
                        lblResult.setText(str);
                    } else if (cbOperations.getSelectedItem().equals("*")) {
                        result = num1 * num2;
                        String str = String.valueOf(result);
                        lblResult.setText(str);
                    } else if (cbOperations.getSelectedItem().equals("/")) {
                        result = num1 / num2;
                        String str = String.valueOf(result);
                        lblResult.setText(str);
                    }
                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(null, "Not a Number");
                }
            }
        });
    }

    public static void main(String[] args) {
        Calc cal = new Calc();
        cal.setTitle("Simple Calculator");
        cal.setContentPane(cal.panel1);
        cal.setSize(600, 500);
        cal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cal.setVisible(true);
    }


}
