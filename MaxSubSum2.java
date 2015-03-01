/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubsum2;
import java.util.Random;
/**
 *
 * @author BMB
 */
public class MaxSubSum2 {

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
            maxSum = maxSubSum2( dizi );
            long bitis = System.currentTimeMillis(); 
            long gecenSure = bitis - baslangic;

            System.out.println("maxSubSum = " + maxSum);
            System.out.println("Dizi Boyutu = "+ dizi.length + "  Geçen Süre = " + (double)gecenSure + "milisaniye");
        }
    }
    public static int maxSubSum2( int [ ] a )
    {
        int maxSum = 0;

        for( int i = 0; i < a.length; i++ )
        {
            int thisSum = 0;
            for( int j = i; j < a.length; j++ )
            {
                thisSum += a[ j ];

                if( thisSum > maxSum )
                {
                    maxSum = thisSum;
                    
                }
            }
        }

        return maxSum;
    }

}
