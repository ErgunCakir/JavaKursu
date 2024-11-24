package com.example.javadersleri.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        HashMap<Integer, String> iller = new HashMap<>();

        //Veri ekleme
        iller.put(06, "Ankara");
        iller.put(34, "İstanbul");
        iller.put(15, "Burdur");
        iller.put(07, "Antalya");

        //Güncelleme
        iller.put(16, "Yeni Bursa");
        System.out.println(iller);

        //veri okuma
        String il = iller.get(34);
        System.out.println("Sonuç : "+il);

        System.out.println("Boyut : "+iller.size());
        System.out.println("Boş Kontrol : "+iller.isEmpty());

        Set<Integer> anahtarlar = iller.keySet();

        for (Integer a:anahtarlar){
            System.out.println("Sonuç : "+iller.get(a));


        }
    }
}
