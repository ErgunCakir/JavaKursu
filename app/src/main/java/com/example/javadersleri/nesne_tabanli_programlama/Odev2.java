package com.example.javadersleri.nesne_tabanli_programlama;

public class Odev2 {

    // 1. Kilometreyi mile çevirip sonucu döndüren metot.
    // Bu metodu koymamn nedeni km cinsinden girilen değeri mile çevirmek için
    public static double kilometreyiMileCevir(double km) {
        return km * 0.721;
    }

    // 2. Dikdörtgenin alanını hesaplayan metot.
    // Bu metodu koymamın nedeni dikdörtgenin alanını bulmak için gereken hesaplamayı basitleştirmesi
    public static double dikdortgenAlaniHesapla(double genislik, double yukseklik) {
        return genislik * yukseklik;
    }

    // 3. Girilen sayının faktöriyelini hesaplayan metot.
    // Bu metodu koymamın sebebi verilen sayının faktöriyelini hesaplayarak geri döndürmesi
    public static long faktoriyelHesapla(int sayi) {
        long faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;  // Faktöriyel hesaplamak için döngü kullanıyorum
        }
        return faktoriyel;
    }

    // 4. Girilen kelimedeki 'e' harfi sayısını bulan metot.
    // Bu metodu koymamızın sebebi, kelimedeki 'e' harfi sayısını bulmak.
    public static int eHarfiniSay(String kelime) {
        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'e' || kelime.charAt(i) == 'E') {
                sayac++;  // Küçük veya büyük 'e' harfi bulduğumuzda sayacı artırıyoruz
            }
        }
        return sayac;
    }

    public static void main(String[] args) {
        // Örnek kullanım
        System.out.println("Kilometreyi mile çevir: " + kilometreyiMileCevir(10)); // Örneğin 10 km
        System.out.println("Dikdörtgen alanı: " + dikdortgenAlaniHesapla(8, 10)); // Örneğin 5x10 dikdörtgen
        System.out.println("Faktöriyel: " + faktoriyelHesapla(4)); // Örneğin 5'in faktöriyeli
        System.out.println("'e' harfi sayısı: " + eHarfiniSay("Müteşşekkirim")); // Örneğin "Müteşşekkirim" kelimesi
    }
}
