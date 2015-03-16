/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ınsertionsort;

import java.util.Random;

/**
 *
 * @author BM
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dizi1[ ] = new int[10];
        int dizi2[ ] = new int[50];
        int dizi3[ ] = new int[100];
        int dizi4[ ] = new int[200];
        int dizi5[ ] = new int[500];
        
        Random r = new Random();
            for (int i = 0; i < 10; i++) 
                dizi1[i]=r.nextInt(10000);
            
            for (int i = 0; i < 50; i++) 
                dizi2[i]=r.nextInt(10000);
            
            for (int i = 0; i < 100; i++) 
                dizi3[i]=r.nextInt(10000);
            
            for (int i = 0; i < 200; i++) 
                dizi4[i]=r.nextInt(10000);
            
            for (int i = 0; i < 500; i++) 
                dizi5[i]=r.nextInt(10000);
            
            InsertionSort(dizi1); InsertionSort(dizi2); InsertionSort(dizi3); InsertionSort(dizi4); InsertionSort(dizi5);
    
    }
    
    public static void InsertionSort(int [] dizi){
        int swapSayac=0;
        int karsilastirma = 0;
        for (int i = 1; i < dizi.length; i++) {
            int valueToSort = dizi[i];
            int j = i;
            karsilastirma = karsilastirma +1;
            while (j > 0 && dizi[j - 1] > valueToSort) {
                karsilastirma = karsilastirma+1;
                swapSayac = swapSayac + 1;
                dizi[j] = dizi[j - 1];
                j--;
            }
            dizi[j] = valueToSort;
        }
        System.out.println(dizi.length + " elemanlı dizi için swap sayısı = " + swapSayac);
        System.out.println("Karşılaştırma sayısı = "+ karsilastirma);
    }
}
