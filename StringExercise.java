import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class StringExercise {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String stringInput = scanner.next();

        System.out.print("enter a character: ");
        String characterInput = scanner.next();
        scanner.nextLine();


        System.out.println("The number of times the character appeared in the String: " + countTheWantedCharacter(stringInput,characterInput) );

        countDifferentCharacters(stringInput);
    }

    public static int countTheWantedCharacter(String stringInput, String characterInput) {

        String arr[] = stringInput.split(",");
        int count = 0;

        for(String a : arr) {
            if (a.equals(characterInput)) {
                count++;

            }
        }

        return count;
    }

    public static void countDifferentCharacters (String stringInput) {
        String [] arr = stringInput.split("");
        Arrays.sort(arr);

        ArrayList<String> arr1 = new ArrayList<>();
        int count = 1;

        for (int i = 0; i < arr.length; i++) {

            if ((i != 0) && (!(arr[i].equals(arr[i-1])))) {
               count++;
               arr1.add(arr[i-1]);

          }
        }

        System.out.println("The number of different characters in the String: " + count);

        int numberOfEachCharacter = 0;

        for (int i = 0; i < arr1.size(); i++) {
            System.out.println("Character: " + arr1.get(i));

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr1.get(i))) {
                    numberOfEachCharacter++;
                }
            }

            System.out.println("The number of times that " + arr1.get(i) + " shows up: " + numberOfEachCharacter);
            numberOfEachCharacter = 0;
        }


    }
}
//comment

