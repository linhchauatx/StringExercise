
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringExercise1 {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String stringInput = scanner.nextLine();

        System.out.print("enter a character: ");
        String characterInput = scanner.nextLine();

        manipulateString(stringInput,characterInput);

        System.out.println("Reverse the string: " + reverseString(stringInput));
    }

    public static String[] covertStringToArray (String input) {
        String[] arr = input.split("");

        Arrays.sort(arr);

        return arr;
    }

    public static void manipulateString (String input, String character) {

        int numberOfWantedCharacter = 0;
        int numberOfDifferentCharacter = 0;

        ArrayList<String> listOfDifferentCharacters = new ArrayList<>();



        for (int i = 0; i < covertStringToArray(input).length; i++) {
            if(covertStringToArray(input)[i].equals(character)) {
                numberOfWantedCharacter++;
            }

            if(i == 0) {
                numberOfDifferentCharacter++;
                listOfDifferentCharacters.add(covertStringToArray(input)[i]);

            }
            else if (!(covertStringToArray(input)[i].equals(covertStringToArray(input)[i-1]))) {
                numberOfDifferentCharacter++;
                listOfDifferentCharacters.add(covertStringToArray(input)[i]);

            }
        }
        System.out.println("The number of times the character " + character + "appeared in the String: " + numberOfWantedCharacter);
        System.out.println("The number of different characters in the String: " + numberOfDifferentCharacter);


        int numberOfEachCharacter = 0;

        for (String c : listOfDifferentCharacters) {
            for (String i: covertStringToArray(input)) {
                if (i.equals(c)) {
                    numberOfEachCharacter++;
                }
            }
            System.out.println("The number of times that " + c + " shows up: " + numberOfEachCharacter);
            numberOfEachCharacter = 0;
        }
    }

    public static StringBuilder reverseString (String stringInput) {
        StringBuilder reversedString  = new StringBuilder();

        String arr[] = stringInput.split("");

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedString.append(arr[i]);
        }

        return reversedString;

    }
}

