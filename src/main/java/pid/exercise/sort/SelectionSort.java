package pid.exercise.sort;

public class SelectionSort {

    // usually Selection 

    public static void sort(int[] array) {
        // TODO Implement selection sort
        // TIP: start the smallest iteration first and then go broader


        int min; // stores index of min valuable after comparison
        int i; // current index
        int j; // next element's index
        int x; // temporary variable


        // outer loop = just iterates until the list is over OR it doesnt iterate if list is empty.

        // {4,6,2,8}

        // traverse through the array.
        // since i run the sort as i run the loop. The last item is already there, thefore the -1
        for (i = 0; i < array.length-1; i++) {
            min = i;
            {
                // inner loop
                // j = i + 1 : relates to the next item
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                        // set min index to the index of j
                        // in this case 6 is > than 4 , so we dont do this. Go to 'else'.
                    min = j;
                }
                // swap needs a third element, because if we just swap both, then we lose one of the values.
                // store x = value of 4
                x = array[i];
                // set 4 = 4 // data of i == data of min
                // swap
                array[i] = array[min];
                // assign stored value 4 to index min
                array[min] = x;
                }
            }
        }


    }
}