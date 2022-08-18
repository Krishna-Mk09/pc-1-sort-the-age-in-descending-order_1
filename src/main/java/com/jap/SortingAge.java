package com.jap;

import java.util.Arrays;

public class SortingAge {

    public static void main(String[] args) {
        int[] array = {33, 32, 31, 28, 26, 25, 24, 23};
        int temp = array[0];
        SortingAge input = new SortingAge();
        int[] result = input.getSortedAge(array);
        System.out.println("result = " + Arrays.toString(result));
    }

    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int[] array) {
        //   int[] temp = array[0];
        for (int pass = 0; pass < array.length; pass++) {
            for (int index = 0; index < array.length - 1; index++)
                if (array[index] < array[index + 1]) {//swap
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
        }
        return array;
    }
}

