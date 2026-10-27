package org.example;

public class Main {
    public static void main(String[] args) {

        //array givet af opgaven (det er ikke noget brugeren skriver)
        int array[] = {4, 8, 6, 2, 3, 9, 7, 5};


        reverseInsertionSort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }

    }


    private static void reverseInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            //element before array[i]
            int j = i - 1;

            // continue switching places if the element before is smaller than current
            //hvis det var almindelig insertion sort (hvor det er fra lavest til højst), skulle man skrive array[j] > current
            while (j >= 0 && array[j] < current) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}