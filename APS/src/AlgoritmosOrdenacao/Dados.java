package AlgoritmosOrdenacao;

import java.util.Arrays;
//import AlgoritmosOrdenacao.Algoritmos;k

public class Dados {
	public static void main(String[] args) {
		
        // Dados de teste
        int[] bubbleSortArray = {64, 34, 25, 12, 22, 11, 90, 67, 45, 88, 56, 29, 39, 48, 73};
        int[] insertionSortArray = {29, 10, 14, 37, 13, 41, 20, 39, 9, 8, 30, 22, 15, 50, 60};
        int[] selectionSortArray = {45, 23, 56, 12, 78, 34, 67, 89, 22, 11, 48, 53, 38, 15, 61};
        int[] mergeSortArray = {88, 56, 45, 12, 78, 23, 67, 34, 11, 29, 50, 14, 37, 22, 39};
        int[] quickSortArray = {41, 20, 13, 37, 9, 30, 14, 22, 8, 15, 29, 50, 60, 39, 10};
        int[] heapSortArray = {71, 15, 34, 88, 22, 56, 29, 39, 48, 67, 10, 41, 76, 85, 52};

        // Bubble Sort
        System.out.println("Original Array for Bubble Sort: " + Arrays.toString(bubbleSortArray));
        System.out.println("Bubble Sort - Before: " + Arrays.toString(bubbleSortArray));
        Algoritmos.bubbleSort(bubbleSortArray);
        System.out.println("Bubble Sort - After:  " + Arrays.toString(bubbleSortArray));
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        // Insertion Sort
        System.out.println("Original Array for Insertion Sort: " + Arrays.toString(insertionSortArray));
        System.out.println("Insertion Sort - Before: " + Arrays.toString(insertionSortArray));
        Algoritmos.insertionSort(insertionSortArray);
        System.out.println("Insertion Sort - After:  " + Arrays.toString(insertionSortArray));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        // Selection Sort
        System.out.println("Original Array for Selection Sort: " + Arrays.toString(selectionSortArray));
        System.out.println("Selection Sort - Before: " + Arrays.toString(selectionSortArray));
        Algoritmos.selectionSort(selectionSortArray);
        System.out.println("Selection Sort - After:  " + Arrays.toString(selectionSortArray));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        // Merge Sort
        System.out.println("Original Array for Merge Sort: " + Arrays.toString(mergeSortArray));
        System.out.println("Merge Sort - Before: " + Arrays.toString(mergeSortArray));
        Algoritmos.mergeSort(mergeSortArray, 0, mergeSortArray.length - 1);
        System.out.println("Merge Sort - After:  " + Arrays.toString(mergeSortArray));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        // Quick Sort
        System.out.println("Original Array for Quick Sort: " + Arrays.toString(quickSortArray));
        System.out.println("Quick Sort - Before: " + Arrays.toString(quickSortArray));
        Algoritmos.quickSort(quickSortArray, 0, quickSortArray.length - 1);
        System.out.println("Quick Sort - After:  " + Arrays.toString(quickSortArray));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        
        // Heap Sort
        System.out.println("Original Array for Heap Sort: " + Arrays.toString(heapSortArray));
        System.out.println("Heap Sort - Before: " + Arrays.toString(heapSortArray));
        Algoritmos.heapSort(heapSortArray);
        System.out.println("Heap Sort - After:  " + Arrays.toString(heapSortArray));
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
