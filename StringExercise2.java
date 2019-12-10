import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class StringExercise2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");

        String stringInput = scanner.nextLine();

        countDifferentCharacters(covertStringToArray(stringInput));

        if(checkPalindromeString(covertStringToArray(stringInput))) {
            System.out.println("The string is palindrome string ");
        }
        else {
            System.out.println("The string is not palindrome string ");
        }

}



    public static String[] covertStringToArray (String input) {
        String[] arr = input.split("");

        return arr;
    }



    public static void countDifferentCharacters (String[] stringInput) {
        int numberOfDifferentCharacters = 0;

        Arrays.sort(stringInput);
        Hashtable<Number,String> differentCharacters = new Hashtable<>();

        for (int i = 0;i < stringInput.length; i++) {


            if (i==0 || !(stringInput[i].equals(stringInput[i-1]))) {
                numberOfDifferentCharacters++;
                differentCharacters.put(i,stringInput[i]);
            }
        }

        System.out.println("The number of different characters in the String: " + numberOfDifferentCharacters);

        int numberOfEachCharacter = 0;

        for (String c : differentCharacters.values()) {
            for (String i: stringInput) {
                if (i.equals(c)) {
                    numberOfEachCharacter++;
                }
            }
            System.out.println("The number of times that " + c + " shows up: " + numberOfEachCharacter);
            numberOfEachCharacter = 0;
        }

    }


    public static boolean checkPalindromeString(String[] stringInput) {

     int num = stringInput.length-1;


         for (int i = 0; i <= stringInput.length/2-1; i++) {


             for (int j = num; j >= stringInput.length/2; j--) {
                 num--;

                 if (!(stringInput[i].equals(stringInput[j]))) {
                     return false;
                 }
                 break;
             }

         }

     return true;
 }

}
