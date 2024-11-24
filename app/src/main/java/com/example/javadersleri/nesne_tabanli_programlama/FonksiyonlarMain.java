package com.example.javadersleri.nesne_tabanli_programlama;

public class FonksiyonlarMain {
    public static void main(String[] args) {
        Fonksiyonlar f = new Fonksiyonlar();

        f.selamla();

        String gelenSonuc = f.selamla2();
        System.out.println("gelenSonuc = " + gelenSonuc);
    }
}
