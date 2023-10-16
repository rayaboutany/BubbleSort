import java.util.Random;

public class BubbleSort{
    public static int[] createRandomArray(int arrayLength) {
        int[] randomArray = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            randomArray[i] = random.nextInt(101); // Generates random integers between 0 and 100 (inclusive)
        }

        return randomArray;
    }

    public static void main(String[] args) {
        int arrayLength = 10; // Change this to the desired length of the random array
        int[] randomArray = createRandomArray(arrayLength);

        // Print the generated random array
        System.out.println("Random Array:");
        for (int number : randomArray) {
            System.out.print(number + " ");
        }
    }
}
