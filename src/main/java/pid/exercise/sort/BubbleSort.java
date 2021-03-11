package pid.exercise.sort;

public class BubbleSort {

    public static void sort(int[] array) {
        // TODO Implement bubble sort

        int i; // current index
        int j; // next element's index
        int x; //temp variable
        int a = array.length;

        // Step 1. enter the loop
        // Step 2. compare indexes

        // the bubble sort has a check that stops from iterating if all is already sorted

        // decrease 1 because the last one is already sorted
        for (i = 0; i < a - 1; i++) {
            // decrease 1 because the last one is already sorted
            // the inner loop is reduced every time
            for (j = 0; j < a - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
        }
    }
}








/*
    int i; // current index
    int x; //temp variable
    int a = array.length;
    int last = array[array.length - 1];*/


            /*if (array[i] > array[i+1]) {
                // do something: swap
                x = array[i];
                array[i] = array[i+1];
                array[i+1] = x;

                if (array[i+1] == last) {
                    // set array.length minus 1 (decrease it by -1)
                    a = a -1;
                }
                // else: do nothing
            }
            // the firs item is not bigger then don't swap
            // move to the next number, so do nothing
        }
    }

}*/
