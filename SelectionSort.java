/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Random;

/**
 *
 * @author Alp
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dizi1[ ] = new int[10];
        int dizi2[ ] = new int[50];
        int dizi3[ ] = new int[100];
        int dizi4[ ] = new int[200];
        Random r = new Random();
            for (int i = 0; i < 10; i++) 
                dizi1[i]=r.nextInt(100);
            
            for (int i = 0; i < 50; i++) 
                dizi2[i]=r.nextInt(100);
            
            for (int i = 0; i < 100; i++) 
                dizi3[i]=r.nextInt(100);
            
            for (int i = 0; i < 200; i++) 
                dizi4[i]=r.nextInt(300);
              
            selectionSort(dizi1); selectionSort(dizi2); selectionSort(dizi3); selectionSort(dizi4);
    }
    
    public static void selectionSort(int[] arr) {
        int swapSayac=0;
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                  if (arr[j] < arr[minIndex])
                        minIndex = j;
            if (minIndex != i) {
                  swapSayac = swapSayac + 1;
                  tmp = arr[i];
                  arr[i] = arr[minIndex];
                  arr[minIndex] = tmp;
            }
        }
        System.out.println(arr.length + " elemanlı dizi için swap sayısı = " + swapSayac);
    }
    
}
