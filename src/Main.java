import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){


        try {

            // Initialized a Scanner Object Class
            Scanner s = new Scanner(System.in);


            // get two values
            System.out.println("Please give me first number : ");
            Double num1 = s.nextDouble();

            System.out.println("Now, give me the second one : ");
            Double num2 = s.nextDouble();


            // logic
            Double biggest = (num1 > num2) ? num1 : num2;
            Double second = (num2 < num1) ? num2 : num1;

            // Print result
            System.out.println("Biggest Number : " + biggest);

            System.out.println("Second one Number : " + second);
        } catch (Exception e){
            System.out.println("Error : " + e + ", please write right values");
            main(args);
            System.exit(0);
        }




    }
}