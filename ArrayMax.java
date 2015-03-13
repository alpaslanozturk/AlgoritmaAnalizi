/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymax;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alp
 */
public class ArrayMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int diziBoyutu, dogruMu = 0;
        while( dogruMu == 0 ){          // Dizi boyutunu hata vermiycek şekilde girene kadar girmemizi sağlar.
        try{
	System.out.print("Dizi boyutunu giriniz: ");
	diziBoyutu = input.nextInt();
        
        int dizi[ ] = new int[diziBoyutu];
        Random r = new Random();
            for (int i = 0; i < diziBoyutu; i++)    // Diziye random değerler atama
                dizi[i]=r.nextInt(100000);
        dogruMu = 1;                                // Girilen dizi boyutu sorun yaratmıyorsa
        System.out.println("Dizinin en büyük elemanı = " + maxElemanBulma(dizi));
        }
        catch(OutOfMemoryError e){
            System.out.println("Dizi boyutu çok büyük. Daha küçük bir sayı giriniz");
        }
        catch(Exception e){
            System.out.println("Hatayla karşılaşıldı. Farklı bir sayı deneyin");
        }
        }
        

    }
    
    public static int maxElemanBulma(int [] dizi){
        int enBuyuk = dizi[0];
        for (int i = 0; i<dizi.length-1; i++){
            if(dizi[i+1]>dizi[i]){
                enBuyuk = dizi[i+1];
            }
        }
        
        return enBuyuk;
    }
    
}
