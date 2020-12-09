package Week3;

public class Calculator_Enum {
    public static void main(String[] args) {
        calculator(2, 1, OPERATION.ADDITION);
    }

    public enum OPERATION {
        ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION
    }

    public static void calculator(double number1, double number2, OPERATION Operation) {
        String operation;
        double result;

        switch (Operation) {
            case ADDITION:
                operation = "addition";
                result = number1 + number2;
                break;
            case SUBTRACTION:
                operation = "substraction";
                result = number1 - number2;
                break;
            case DIVISION:
                operation = "division";
                result = number1 / number2;
                break;
            case MULTIPLICATION:
                operation = "multiplication";
                result = number1 * number2;
                break;
            default:
                operation = "not selected operation";
                result = 0;
                break;
        }
        System.out.println("The result of " + operation + " is " + result);
    }

}
