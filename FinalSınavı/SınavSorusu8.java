/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavsorusu8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alp
 */
public class SınavSorusu8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fonksiyon();
    }
    
    public static void fonksiyon(){
        Scanner input = new Scanner(System.in);
        int elemanSayisi;

        System.out.print("Kaç eleman eklensin = ");
        elemanSayisi = input.nextInt();
        int dizi[] = new int[elemanSayisi];
        
        Random rastgele = new Random();
        for (int i = 0; i < elemanSayisi; i++) {
            dizi[i] = rastgele.nextInt();
        }
        
        for(int yazdir = elemanSayisi-1; yazdir>= 0 ; yazdir--){
            System.out.println(dizi[yazdir]);
        }
        
        
    }
    
}
