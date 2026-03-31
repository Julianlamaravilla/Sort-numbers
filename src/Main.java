import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){


        try {


            // get two values
            Double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please give me first number : "));

            Double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Now, give me the second one : "));


            // logic
            Double biggest = (num1 > num2) ? num1 : num2;
            Double second = (num2 < num1) ? num2 : num1;

            // Print result
            JOptionPane.showMessageDialog(null, "Biggest Number : " + biggest + "\nSecond one Number :" + second);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error : " + e + ", please write right values");
            main(args);
            System.exit(0);
        }

    }
}