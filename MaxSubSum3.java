/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubsum3;

import java.util.Random;

/**
 *
 * @author BMB
 */
public class MaxSubSum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int k=1;k<5;k++){
            int n = (int) Math.pow(10,k);
            
            int dizi[ ] = new int[n];
            int maxSum;

            Random r = new Random();
            for (int i = 0; i < n; i++) {
                dizi[i]=r.nextInt(100);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(dizi[i] + ",");
            }


            long baslangic = System.currentTimeMillis();
            maxSum = maxSubSum3( dizi );
            long bitis = System.currentTimeMillis(); 
            long gecenSure = bitis - baslangic;

            System.out.println("maxSubSum = " + maxSum);
            System.out.println("Dizi Boyutu = "+ dizi.length + "  Geçen Süre = " + (double)gecenSure + "milisaniye");
        }
    }
    public static int maxSubSum3( int [ ] a )
    {
        int maxSum = 0;
        int thisSum = 0;

        for( int i = 0, j = 0; j < a.length; j++ )
        {
            thisSum += a[ j ];

            if( thisSum > maxSum )
            {
                maxSum = thisSum;
                
            }
            else if( thisSum < 0 )
            {
                i = j + 1;
                thisSum = 0;
            }
        }

        return maxSum;
    }

}
