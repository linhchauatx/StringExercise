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

        countACharInAString(stringInput, characterInput);
        countAllCharsInAString(stringInput);

        System.out.println("Reverse the string: " + reverseString(stringInput));
    }

    public static void countACharInAString(String input, String character) {
        String[] arr = input.split("");
        System.out.println("The number of times the character " + character +
            " appeared in the String " + input +
            ": " + countStringInArrray(arr, character));
    }

    public static void countAllCharsInAString(String input) {
        String[] arr = input.split("");
        Arrays.sort(arr);

        ArrayList<String> listOfDifferentCharacters = new ArrayList<>();

        // At the beginning, we have zero character
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // Always count the first char
            if (i == 0) {
              count++;
              listOfDifferentCharacters.add(arr[i]);
            }
            // if current char is different than the previous, count it
            else if (!(arr[i].equals(arr[i-1]))) {
               count++;
               listOfDifferentCharacters.add(arr[i]);
            }
        }

        System.out.println("The number of different characters in the String: " + count);

        for (int i = 0; i < listOfDifferentCharacters.size(); i++) {
            String characterInput = listOfDifferentCharacters.get(i);
            System.out.println("Character: " + characterInput);
            int charCount = countStringInArrray(arr, characterInput);

            System.out.println("The number of times that " + characterInput + " shows up: " + charCount);
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

    private static int countStringInArrray(String[] arr, String aString) {
        int count = 0;
        for (String st: arr) {
            if (st.equals(aString)) {
                count ++;
            }
        }
        return count;
    }
}

