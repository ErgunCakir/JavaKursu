package com.example.javadersleri.nesne_tabanli_programlama;

public class ArabaMain {
    public static void main(String[] args) {
        //Nesne Oluşturma
        Araba bmw = new Araba(true , 100 , "Mavi");

        //Değer Atama
        //bmw.renk = "Kırmızı";
        //bmw.hiz = 240;
        //bmw.calisiyorMu = true;

        //Değer Okuma
        bmw.bilgiAl();
        bmw.durdur();
        bmw.bilgiAl();
        bmw.calistir();
        bmw.bilgiAl();
        bmw.hizlan(100);
        bmw.bilgiAl();
        bmw.yavasla(40);
        bmw.bilgiAl();

        //Değer Atama
        Araba mercedes = new Araba();
        mercedes.renk = "Siyah";
        mercedes.hiz = 260;
        mercedes.calisiyorMu = false;

        //Değer Okuma
        mercedes.bilgiAl();
        mercedes.durdur();
        mercedes.bilgiAl();
        mercedes.calistir();
        mercedes.bilgiAl();
        mercedes.hizlan(50);
        mercedes.bilgiAl();
        mercedes.yavasla(30);
        mercedes.bilgiAl();
    }
}
