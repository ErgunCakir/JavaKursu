package com.example.javadersleri.degiskenler;

public class TurDonusumu {
    public static void main(String[] args) {
        //Tür Dönüşümü - Type Casting
        //Sayısaldan sayısala
        int i = 67;
        double d = 49.78;

        int sonuc1 = (int) d; //explicit : açıklamalı. Büyükten küçüğe çevirirken açıklama olacak.
        double sonuc2 = i; //unexplicit : açıklama olmadan
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        //Sayısaldan Metine Dönüşüm
        String sonuc3 = String.valueOf(d);
        String sonuc4 = String.valueOf(i);

        System.out.println(sonuc3);
        System.out.println(sonuc4);

        //Metinden Sayısala Dönüşüö
        String yazi1 = "56"; //int
        String yazi2 = "23.87"; //double

        int sonuc5 = Integer.parseInt(yazi1);
        double sonuc6 = Double.parseDouble(yazi2);

        System.out.println(sonuc5);
        System.out.println(sonuc6);
    }
}



