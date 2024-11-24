package com.example.javadersleri.collections;

import java.util.HashSet;

public class HashSetKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        HashSet<String> meyveler = new HashSet<>();

        //Veri Ekleme
        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Kiraz");
        System.out.println(meyveler);

        meyveler.add("Amasya Elmaıs");
        System.out.println(meyveler);

        System.out.println("Boyut : "+meyveler.size());
        System.out.println("Boş Kontrol : "+meyveler.isEmpty());

        for (String m:meyveler){
            System.out.println("Sonuç : "+m);
        }
        meyveler.remove("Muz");
        System.out.println(meyveler);

        meyveler.clear();
        System.out.println(meyveler);
    }
}
