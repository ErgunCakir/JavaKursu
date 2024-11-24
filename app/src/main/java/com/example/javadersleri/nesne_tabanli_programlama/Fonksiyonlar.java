package com.example.javadersleri.nesne_tabanli_programlama;

public class Fonksiyonlar {

    //void : geri dönüş değeri olmayan
    public void selamla(){
        String sonuc = "Merhaba Ergün";
        System.out.println(sonuc);
    }
    //return : geri dönüş değeri olan
    public String selamla2(){
        String sonuc = "Merhaba Ergün";
        return sonuc;
    }

    public void selamla3(String isim){
        String sonuc = "Merhaba "+isim;
        System.out.println(sonuc);
    }

    public int toplama(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        return toplam;
    }
}
