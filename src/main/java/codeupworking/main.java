package codeupworking;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something: ");

        String input = scanner.nextLine();
        System.out.println("You Entered: " + input);
        if(StringUtils.isNumeric(input)){
            System.out.println("This is a number");
        }else {
            System.out.println("This is not a number");
        }
        System.out.println("Original String: " + input);
        System.out.println("Flipped Case: " + input.toUpperCase());
        System.out.println("Reversed: \"" + StringUtils.reverse(input) + "\"");
        System.out.println("Hash Code: " + input.hashCode());

        //-----------------
        System.out.println("-------------------------------------");

        String str = "Hello, World!";

        // Checking if a string is empty or null
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("Is empty? " + isEmpty);

        // Reversing a string
        String reversedStr = StringUtils.reverse(str);
        System.out.println("Reversed string: " + reversedStr);

        // Trimming whitespace from both ends of a string
        String trimmedStr = StringUtils.trim(str);
        System.out.println("Trimmed string: " + trimmedStr);

        // Checking if a string is alphanumeric
        boolean isAlphanumeric = StringUtils.isAlphanumeric(str);
        System.out.println("Is alphanumeric? " + isAlphanumeric);

        // Joining an array of strings with a delimiter
        String[] array = {"Hello", "World"};
        String joinedStr = StringUtils.join(array, ", ");
        System.out.println("Joined string: " + joinedStr);

        // Removing a specific character from a string
        String charRemovedStr = StringUtils.remove(str, ',');
        System.out.println("Character removed: " + charRemovedStr);
    }
}