import java.util.Scanner;

import static java.lang.Integer.*;

public class Calculator {
    public String firstOperand;
    private int result = 0;

    public static void main(String[] args) {
     Calculator calc = new Calculator();
     calc.start();
}

    public void start() {
        do {
            showMenu();
            firstOperand = readInput("Please write operand");

            if (firstOperand.equals("+")) {
                result = result + readNumber("Please enter a number");
            } else if (firstOperand.equals("-")) {
                result = result - readNumber("Please enter a number");
            } else if (firstOperand.equals("*")) {
                result = result * readNumber("Please enter a number");
            } else if (firstOperand.equals("/")) {
                result = result / readNumber("Please enter a number");
            } else if (!firstOperand.equals("Q")) {
                System.out.println("Invalid command.");
            }
        } while (!firstOperand.equals("Q"));
    }


    public void showMenu(){
        System.out.println("+) Add");
        System.out.println("-) Deduct");
        System.out.println("*) Multiply");
        System.out.println("/) Divide");
        System.out.println("Q) Quit");
        System.out.println("Your current value is " + result);

    }

    public String readInput (String message){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int readNumber (String message){
        boolean validNumber = true;
        int number = 0;
        do {
            try {
                number = Integer.parseInt(readInput (message));
            } catch (NumberFormatException ex) {
                validNumber = false;
                System.out.println("This is not a valid number. Please try again");
            }
        } while(!validNumber);

        return number;
    }
}

