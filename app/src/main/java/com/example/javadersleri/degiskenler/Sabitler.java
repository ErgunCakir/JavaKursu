package com.example.javadersleri.degiskenler;

public class Sabitler {
    public static void main(String[] args) {
        //Sabit - Constant - final
        int sayi = 100;
        System.out.println(sayi);
        sayi = 200;
        System.out.println(sayi);

        final int numara = 300;
        System.out.println(numara);
        //numara = 300; kullanılamaz, final fonksiyonu ile numara'yi 300'e sabitledik. değiştirilemez.
    }
}
