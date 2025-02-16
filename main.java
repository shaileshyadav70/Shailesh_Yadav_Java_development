import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double result;
        while (true){
            System.out.println("Simple console based calculator--");
            System.out.println("Choose any operator for your operation(+,-,*,/)");
            System.out.println("Press 'exit' for exit");

            String operation = input.next();

            if(operation.equalsIgnoreCase("exit")){
                System.out.println("Now you are exited from the calculator. GoodBye!");
                break;
            }

            if (!operation.matches("[+/*-]")){
                System.out.println("You have chosen wrong operator. Best of luck for next try.");
                break;
            }

            System.out.println("Enter first number");
            double first = input.nextDouble();

            System.out.println("Enter second number ");
            double second = input.nextDouble();

            switch (operation) {
                case "+":
                    result = first + second;
                    break;

                case "-":
                    result = first - second;
                    break;

                case "*":
                    result = first * second;
                    break;

                case "/":
                    if(second == 0){
                        System.out.println("Invalid! the number can not divided by zero");
                    }
                    result = first / second;
                    break;

                default:
                    System.out.println("Invalid operation. Try again.");
                    continue;
            }

            System.out.println("your output is : " + result);
            System.out.println();

        }
        input.close();
    }
}
