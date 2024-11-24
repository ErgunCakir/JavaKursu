package com.example.javadersleri.nesne_tabanli_programlama.override_kullanimi;

public class OverrideKullanimi {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Memeli memeli = new Memeli();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        hayvan.sesCiikar(); //Kalıtım yok, kendi metoduna erişti
        memeli.sesCiikar(); //Kalıtım var, üst sınıfın metoduna erişti
        kedi.sesCiikar(); //Kalıtım var, kendi metoduna erişti
        kopek.sesCiikar(); //Kalıtım var, kendi metoduna erişti
    }
}
