/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

import static Sorting.MergeSorting.mergeSort;

/**
 *
 * @author User
 */
public class TestMergeSorting {
    public static void main(String[] args) {
        
        int[] arr = {38, 12 ,27 ,43, 9 ,31, 18, 51};
        
        System.out.print("Original array");
        for (int num: arr) {
            System.out.println(num + "");
        }
                System.out.println("\n");
                
                mergeSort(arr, 0, arr.length - 1 );
                
                System.out.print("\nSorted array:");
                for (int num : arr){
                    System.out.print(num + "");
                }
    }
    
}
