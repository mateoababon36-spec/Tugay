/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author User
 */
public class InsertionSort {
    
    int[] a;
    public InsertionSort(int[] numbers){
        this.a = numbers;
        
    }
    
    public void sort(){
        for (int i = 1; i < a.length; i++){
            int temp = a[i];
            int j = i - 1;
            
            
            while (j >=0 && a [j] > temp){
                a[j + 1] = a[j];
                j--;
            } 
            a[j + 1] = temp;
        }
    }    
    public void display(){
        for (int num :a){
            System.out.print(num + " ");
        }
    }
}
