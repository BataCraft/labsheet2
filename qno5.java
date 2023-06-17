/* Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel of Consonant, depending on the user input. If the user input is not a letter
(between a and z or A and Z), or is a string of length > 1, print an error message. */

import java.util.Scanner;

public class qno5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter from the alphabet: ");
        String userInput = input.nextLine().toLowerCase();

        if (userInput.length() > 1 || !Character.isLetter(userInput.charAt(0))) {
            System.out.println("Error: Please enter a single character from the alphabet!");
        } else {
            char letter = userInput.charAt(0);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a Vowel.");
            } else {
                System.out.println(letter + " is a Consonant.");
            }
        }
    }
}


