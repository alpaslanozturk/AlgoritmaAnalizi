package fib;

public class Fib {

    public static long fibonacci(int n)  {  // Recursive fibonacci
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
}
    
    public static void main(String[] args) {
        long baslangic = System.currentTimeMillis();  // Programın başlangıç zamanı. Milisaniye cinsinden
        
        for(int i=1;i<71;i++){
            System.out.print(i + ". fib degeri = " + fibonacci(i));  // Bulunan değeri ekrana yazdırma işlemi
            long bitis = System.currentTimeMillis();  // Fib. sayısının bulunduğu andaki zaman. Milisaniye cinsinden
            long gecenSure = bitis - baslangic;       // Bulunana kadar geçen süre
            System.out.println("  ==> " + (double)gecenSure/1000 + "sn");  // Milisaniye/1000 = saniye
            
        }
    }
    
}
