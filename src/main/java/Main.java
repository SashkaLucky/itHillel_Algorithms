package org.example;


public class Main {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 6, 3, 8, 9, 4, 7 };

        // quick sort
        QuickSort.sort(arr, 0, arr.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arr));

        // cocktail sort
        CocktailSort.sort(arr);
        System.out.println("Cocktail Sort: " + Arrays.toString(arr));
    }
}