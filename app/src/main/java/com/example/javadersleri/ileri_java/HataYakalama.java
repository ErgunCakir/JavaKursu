package com.example.javadersleri.ileri_java;

public class HataYakalama {
    public static void main(String[] args) {
        //1. Compile error
        String mesaj = "Merhaba";
        //mesaj = 100;
        //2. Runtime rror: Exception
        int x = 10;
        int y = 10;

        try{
        System.out.println("Sonuç : "+(x/y));
        System.out.println("İşlem Bitti");

        }catch (Exception e){
            System.out.println("İkinci sayı sıfır olamaz");
        }
    }
}
