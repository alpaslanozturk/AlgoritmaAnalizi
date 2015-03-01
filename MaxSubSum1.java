/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubsum1;
import java.util.Random;
import java.lang.Math;
/**
 *
 * @author BMB
 */
public class MaxSubSum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int k=1;k<5;k++){
            int n = (int) Math.pow(7,k);
            
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
            maxSum = maxSubSum1( dizi );
            long bitis = System.currentTimeMillis(); 
            long gecenSure = bitis - baslangic;

            System.out.println("maxSubSum = " + maxSum);
            System.out.println("Dizi Boyutu = "+ dizi.length + "  Geçen Süre = " + (double)gecenSure + "milisaniye");
        }
    }
    public static int maxSubSum1( int [ ] a )
    {
        int maxSum = 0;

        for( int i = 0; i < a.length; i++ )
            for( int j = i; j < a.length; j++ )
            {
                int thisSum = 0;

                for( int k = i; k <= j; k++ )
                    thisSum += a[ k ];

                if( thisSum > maxSum )
                {
                    maxSum   = thisSum;
                    
                }
            }

        return maxSum;
    }

}
