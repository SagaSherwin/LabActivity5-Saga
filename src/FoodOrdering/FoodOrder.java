package FoodOrdering;

import javax.swing.*;

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

    }

    public static void main(String[] args) {
        FoodOrder food = new FoodOrder();
        food.setContentPane(food.panel1);
        food.setSize(600, 600);
        food.setDefaultCloseOperation(EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
