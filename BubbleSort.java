/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Random;

/**
 *
 * @author Alp
 */
public class BubbleSort {

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
              
            BubbleSort(dizi1); BubbleSort(dizi2); BubbleSort(dizi3); BubbleSort(dizi4);
    }
    
    public static void BubbleSort(int [] dizi)
{
    int swapSayac=0;
    int temp;   // Yer değiştirmede kullanılacak geçici değişken
    for (int i=1; i<dizi.length; i++)
    {
        for(int j=0; j<dizi.length-i; j++)
        {
            if (dizi[j] > dizi [j+1])
            {
                swapSayac = swapSayac + 1;
                temp = dizi [j];
                dizi [j] = dizi [j+1];
                dizi [j+1] = temp;
            }//Önce gelen elaman bir sonrakinden büyükse ikisi yer değiştiriyor
        }// Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü
    }// Her karşılaştırmadan sonra yeniden kaldığımız yerden devam etmemizi sağlayan döngü
    System.out.println(dizi.length + " elemanlı dizi için swap sayısı = " + swapSayac);
}
    
}
