package fib2;

public class Fib2 {

    
    public static void main(String[] args) {
        long sayi1 = 1;
        long sayi2 = 1;
        long sonraki;
        int sayac=3;
        long baslangic = System.currentTimeMillis();  // Programın başlangıç zamanı. Milisaniye cinsinden
        
        while(sayac<71){
            sonraki = sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sonraki;
            System.out.print(sayac + ". fib degeri = " + sonraki);  // Bulunan değeri ekrana yazdırma işlemi
            long bitis = System.currentTimeMillis();  // Fib. sayısının bulunduğu andaki zaman. Milisaniye cinsinden
            long gecenSure = bitis - baslangic;       // Bulunana kadar geçen süre
            System.out.println("  ==> " + (double)gecenSure/1000 + "sn");  // Milisaniye/1000 = saniye
            sayac+=1;
        }
    }
    
}
