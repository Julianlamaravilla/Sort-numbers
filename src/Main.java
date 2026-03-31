import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){

        /*El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

           Podría ser utilizando operador ternario. */

        Scanner s = new Scanner(System.in);

        System.out.println("Please give me first number : ");
        Double num1 = s.nextDouble();

        System.out.println("Now, give me the second one : ");
        Double num2 = s.nextDouble();

        Double biggest = (num1 > num2) ? num1 : num2;

        Double second = (num2 < num1) ? num2 : num1;

        System.out.println("Biggest Number : " + biggest);

        System.out.println("Second one Number : " + second);

    }
}