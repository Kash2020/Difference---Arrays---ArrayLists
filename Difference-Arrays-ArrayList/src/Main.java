import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Array");

        // Declare array of length 10.
        // All values automatically initialized to 0.
        int[] intArray = new int[10];
        System.out.println("Size: " + intArray.length + " " + Arrays.toString(intArray));

        // Add ten integers to the array.
        // Values added using the index.
        int triplets = 0;
        for (int i = 0; i < intArray.length; i++) {
            triplets = triplets + 3;
            intArray[i] = triplets;
        }
        System.out.println("Size: " + intArray.length + " " + Arrays.toString(intArray));

        System.out.println();
        System.out.println("ArrayList");

        // Declare an ArrayList.
        // No defined size required.
        // Size of ArrayList is 0.
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println("Size: " + integerArrayList.size() + " " + integerArrayList);

        // Add ten values to the ArrayList.
        // ArrayList size becomes 10.
        // Values added using .add() method.
        int num1 = 0;
        int num2 = 1;
        for (int i = 0; i < 10; i++) {
            int sum = num1 + num2;
            integerArrayList.add(sum);
            num1 = num2;
            num2 = sum;
        }
        System.out.println("Size: " + integerArrayList.size() + " " + integerArrayList);

        // Remove all even numbers from ArrayList.
        // This changes the size of the ArrayList automatically.
        for (int i = 0; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i) % 2 == 0) {
                integerArrayList.remove(i);
                i--;
            }
        }
        System.out.println("Size: " + integerArrayList.size() + " " + integerArrayList);
    }
}