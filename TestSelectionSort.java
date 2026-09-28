/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import static Sorting.SelectionSort.SelectionSort;

/**
 *
 * @author User
 */
public class TestSelectionSort {
    public static void main(String[] args) {
        
        int[] numbers = {9,1,8,7,2,3,6,5,4};
        
        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + "");
        }
        
        System.out.println("\n");
        
        SelectionSort(numbers);
        
        System.out.print("\nSorted array: ");
        for (int num: numbers){
            System.out.print(num +"");
        }
    }
    
}
