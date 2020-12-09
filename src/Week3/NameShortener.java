package Week3;

import java.util.Scanner;

public class NameShortener {

    public static void main(String[] args) {
        printUserName();
    }

    public static String readUserInput() {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }

    public static String shortenName(String name) {
        String shortName;
        String[] nameInput = name.split(" ");
        if (nameInput.length > 1) {
            shortName = nameInput[1] + ", " + nameInput[0].charAt(0) + ".";
        } else {
            shortName = nameInput[0] + ", Esq.";
        }
        return shortName;
    }

    public static void printUserName() {
        System.out.println(shortenName(readUserInput()));
    }
}
