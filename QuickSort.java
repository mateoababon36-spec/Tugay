/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class QuickSort {
   int [] numbers;
   
   public QuickSort(int[]numbers){
       this.numbers = numbers;
   }
   public void sort(){
       quicksort(0,numbers.length - 1);
   }
   private void quicksort(int low,int high){
       if (low < high);
       int pivot = numbers[high];
       int i = low -1;
       for(int j = low; j < high; j++){
           if (numbers[j] < pivot){
               i++;
               
               int temp = numbers[j];
               numbers [i] = numbers [j];
               numbers [j] = temp;
           }
       }
       int temp = numbers[i + 1];
       numbers[i + 1] = numbers[high];
       numbers [high] = temp;
       
       int pivotIndex = i + 1;
       
       quicksort(low, pivotIndex - 1);
       quicksort(pivotIndex + 1, high);
       
      
   }
   public void print(){
       System.out.print("Sorted numbersay: ");
       for (int number : numbers){
           System.out.print(number + "");
       }
   }
}
