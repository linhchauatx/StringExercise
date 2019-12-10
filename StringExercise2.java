import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;
import java.util.Scanner;

public class StringExercise2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String stringInput = scanner.nextLine();

        countDifferentCharacters(stringInput);

        if(checkPalindromeString(stringInput)) {
            System.out.println("The string is a palindrome string.");
        }
        else {
            System.out.println("The string is not a palindrome string.");
        }
    }

    public static void countDifferentCharacters (String stringInput) {
        String[] arr = stringInput.split("");
        Hashtable<String, Number> differentCharacters = new Hashtable<>();

        for (int i = 0;i < arr.length; i++) {
            Integer count = (Integer)differentCharacters.get(arr[i]);
            if (count != null) {
                count = new Integer(count.intValue() + 1);
            }
            else {
                count = new Integer(1);
            }

            differentCharacters.put(arr[i], count);
        }

        Set<String> keys = differentCharacters.keySet();

        System.out.println("The number of different characters in the String: " + keys.size());

        for(String key: keys){
            Number charCount = differentCharacters.get(key);
            System.out.println("The number of times that " + key + " shows up: " + charCount);
        }
    }

    public static boolean checkPalindromeString(String stringInput) {
        String[] arr = stringInput.split("");
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex < rightIndex) {
            if (!arr[leftIndex].equals(arr[rightIndex])) {
                return false;
            }

            leftIndex ++;
            rightIndex --;
        }

        return true;
    }

}
