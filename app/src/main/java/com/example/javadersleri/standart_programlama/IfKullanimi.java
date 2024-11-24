package com.example.javadersleri.standart_programlama;

public class IfKullanimi {
    public static void main(String[] args) {
        int yas = 18;
        String isim = "Ergün";
        if (yas >=18){
            System.out.println("Reşitsiniz");
        }else{
            System.out.println("Reşit Değilsiniz");
        }

        if(isim == "Ergün"){
            System.out.println("Merhaba Ergün");
        }else if (isim == "Yusuf") {
            System.out.println("Merhaba Yusuf");
        }else {
            System.out.println("Tanınmayan kişi");
        }

        String kullaniciAdi = "letha06";
        int sifre = 123456;

        if (kullaniciAdi == "letha06" && sifre == 123456){
            System.out.println("Hoşgeldiniz");
        }else {
            System.out.println("Hatalı Giriş");
        }
        int sayi = 10;

        if(sayi == 9 || sayi == 10){
            System.out.println("Sayı 9 veya 10'dur");
        }else{
            System.out.println("Sayı 9 veya 10 Değil.");
        }

    }
}




