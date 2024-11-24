package com.example.javadersleri.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListNesneTabanli {
    public static void main(String[] args) {
        Urunler u1 = new Urunler(1, "Telefon", 23000);
        Urunler u2 = new Urunler(2, "Bilgisayar", 43000);
        Urunler u3 = new Urunler(3, "Tablet", 200);

        ArrayList<Urunler> urunlerlistesi = new ArrayList<>();
        urunlerlistesi.add(u1);
        urunlerlistesi.add(u2);
        urunlerlistesi.add(u3);

        for(Urunler u:urunlerlistesi){
            System.out.println("Id: "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" TL");
        }
        System.out.println("---------- Fiyat Artan ----------");
        Collections.sort(urunlerlistesi,new Siralama1());
        for(Urunler u:urunlerlistesi){
            System.out.println("Id: "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" TL");
        }

        System.out.println("---------- Fiyat Azalan ----------");
        Collections.sort(urunlerlistesi,new Siralama2());
        for(Urunler u:urunlerlistesi){
            System.out.println("Id: "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" TL");
        }
    }


    public static class Siralama1 implements Comparator<Urunler>{
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return new Integer(u1.getFiyat()).compareTo(u2.getFiyat());

        }
    }

    public static class Siralama2 implements Comparator<Urunler>{
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return new Integer(u2.getFiyat()).compareTo(u1.getFiyat());

        }
    }
}
