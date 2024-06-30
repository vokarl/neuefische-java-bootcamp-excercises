import java.util.Arrays;

public class ArrayExercise1 {
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Step 1
        for (int currentNumber:myNumbers) {
            System.out.println(currentNumber);
        }

        // Step 2
        int sum = 0;

        for (int currentNumber:myNumbers){
            sum+= currentNumber;
        }
        System.out.println(sum);

        // Step 3 - with sort() method
        Arrays.sort(myNumbers);

        int maxElement = myNumbers[myNumbers.length-1];
        System.out.println("The max element: " + maxElement);

        // Step 3 - for loop

        //Initialize max with first element of array.
        int max = myNumbers[0];

        //Loop through the array
        for (int i = 0; i < myNumbers.length; i++) {
            //Compare elements of array with max
            if(myNumbers[i] > max)
                max = myNumbers[i];
        }
        System.out.println("Largest element present in given array: " + max);

        // sucht das wirklich nach der größten ziffer?


        // Step 4 - Create a second array

        int[] secondArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // Step 5 - element wise addition

        int[] resultArray = new int[myNumbers.length];
        for (int i = 0; i < myNumbers.length; i++)
        { resultArray[i] = myNumbers[i] + secondArray[i];
        }

        // Print the result array

        System.out.print("Result Array: ");
        for (int value : resultArray)
        { System.out.print(value + " ");
        }
    }
}


