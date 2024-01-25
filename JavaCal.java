import java.util.Scanner;
// importing the Java class that can take in data from the user and parse primitive types and strings using regular expressions.

public class JavaCal {
    
    public void calOperate(String par){
        // creating a Scanner object named answer that takes in input string.
        Scanner answer = new Scanner(System.in);

        if (par.equals("add") || par.equals("minus") || par.equals("div") || par.equals("times")){
        // this is a conditional expression that runs the following code only if the parameter passed in calOperate is either add, minus, div or times.    
            System.out.println("Enter the first number: ");
            // printing out the first instruction.
            int firstnum;
            // assigning the type of the variable firstnum as an integer value, so it can be assigned later without specifying the type again.
            while(true){ //  iteration that repeats until the input satisfies the conditions.
                try {
                    String input = answer.nextLine(); // returns the next line's input as a string value in input.
                    if (input.length() <= 2) {
                        firstnum = Integer.parseInt(input); // converting or parsing the string input to a number.
                        break;
                    } else {
                        System.out.println("Enter a valid two-digit number!");
                    }    
                } catch (NumberFormatException e) { // runs if anything asides from a number is supplied...
                    System.out.println("Enter a valid two-digit number!");
            }
        }
            System.out.println("Enter the second number: "); // printing out the second instruction and following the sequence above.
        
            int secondnum;
            while(true){
                try {
                    String input = answer.nextLine();
                    if (input.length() <= 2) {
                        secondnum = Integer.parseInt(input);
                        break;
                    } else {
                        System.out.println("Enter a valid two-digit number!");    
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid two-digit number!");
            }
        }
            if (par.equals("add")) {
                int result = firstnum + secondnum; // saving result variable as the sum of firstnum and secondnum when the par parameter is 'add'.
                System.out.println("The sum of " + firstnum + " and " + secondnum + " is " + result + "!");

            } else if (par.equals("minus")){
                int result = firstnum - secondnum; // saving result variable as the difference of firstnum and secondnum when the par parameter is 'minus'.
                System.out.println("The difference of " + firstnum + " and " + secondnum + " is " + result + "!");

            } else if (par.equals("div")){
                int result = firstnum / secondnum; // saving result variable as the quotient of firstnum and secondnum when the par parameter is 'div'.
                System.out.println("The quotient of " + firstnum + " and " + secondnum + " is " + result + "!");

            } else if (par.equals("times")){
                int result = firstnum * secondnum; // saving the result as the product of the first and second numbers when par is 'times'.
                System.out.println("The product of " + firstnum + " and " + secondnum + " is " + result + "!");
            }

        } else {
            System.out.println("Enter a valid prompt!"); // if par wasn't any of the above, it would return an error.
        }
        
    }
    public static void main(String[] args){
        System.out.println("This program works on basic arithmetic calculations."); //printing details and instructions.
        System.out.println("Enter 'add' to sum, 'minus' to subtract, 'div' to divide, 'times' to multiply:");
        
        Scanner word = new Scanner(System.in); // declaring a new scanner object 'word'...
        JavaCal miniJavaCal = new JavaCal(); // creating a new JavaCal object called 'miniJavaCal'...
        String answer = word.nextLine();

        miniJavaCal.calOperate(answer.toLowerCase()); // inserting the answer provided by the user at the beginning of the program as the par argument and calling the method on JavaCal...
        // Lower Case method is called just in case the user has CAPS enabled.
    }
}