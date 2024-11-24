package com.example.javadersleri.collections;

import java.util.ArrayList;

public class ArrayListKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        ArrayList<String> meyveler = new ArrayList<>();

        //Veri ekleme
        meyveler.add("muz");//0
        meyveler.add("elma");//1.
        meyveler.add("kiraz");//2.
        meyveler.add("armut");//3.

        System.out.println(meyveler);

        //Güncelleme
        meyveler.set(1, "Yeni Elma");
        System.out.println(meyveler);

        //Insert
        meyveler.add(1, "Portakal");
        System.out.println(meyveler);

        //Veri Okuma
        String meyve = meyveler.get(3);
        System.out.println(meyve);

        System.out.println("Boyut :"+meyveler.size());
        System.out.println("Boş Kontrol :"+meyveler.isEmpty());

        //For Each
        for(String m : meyveler){
            System.out.println("Sonuç : "+m);
        }

        for(int i=0;i<meyveler.size();i++){
            System.out.println(i+". ->"+meyveler.get(i));
        }

        meyveler.remove(2);
        System.out.println(meyveler);

        meyveler.clear();
        System.out.println(meyveler);
    }
}
