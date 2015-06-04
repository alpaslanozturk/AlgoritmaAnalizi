/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sınavsorusu6;

/**
 *
 * @author Alp
 */
public class SınavSorusu6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dizi[] = {0,0,0,0,1,1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0};
        diziAltKumeBulma(dizi);
    }
    
    public static void diziAltKumeBulma(int [] a){
        int maxSifirliAltKume=0;
        int bulunanSifirSayisi=0;
        
        for(int i = 0 ; i< a.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(a[i]==0){
                    bulunanSifirSayisi+=1;
                }
                else{
                    if(maxSifirliAltKume<bulunanSifirSayisi){
                        maxSifirliAltKume=bulunanSifirSayisi;
                        bulunanSifirSayisi=0;
                    }
                }
            }
        }
        System.out.println("En Fazla Yanyana Olan 0 sayısı = "+ maxSifirliAltKume);
    }
    
}
