package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrder(){

        ButtonGroup discountGroup = new ButtonGroup();
        discountGroup.add(rbNone);
        discountGroup.add(rb5);
        discountGroup.add(rb10);
        discountGroup.add(rb15);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double total = 0;
                if(cPizza.isSelected()) total += 100;
                if(cBurger.isSelected()) total += 80;
                if(cFries.isSelected()) total += 65;
                if(cSoftDrinks.isSelected()) total += 55;
                if(cTea.isSelected()) total += 50;
                if(cSundae.isSelected()) total += 40;

                double discount = 0;
                if(rb5.isSelected()){
                    discount = 0.05;
                }
                else if (rb10.isSelected()){
                    discount = 0.1;
                }
                else if (rb15.isSelected()){
                    discount = 0.15;
                }
                else if (rbNone.isSelected()){
                    discount = 0;
                }

                double FinalCost = total - (total * discount);
                JOptionPane.showMessageDialog(null, "The total price is  Php " +FinalCost);
            }
        });
    }

    public static void main(String[] args) {
        FoodOrder food = new FoodOrder();
        food.setTitle("Food Ordering System");
        food.setContentPane(food.panel1);
        food.setSize(600, 600);
        food.setDefaultCloseOperation(EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
