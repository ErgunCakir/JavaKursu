package com.example.javadersleri.nesne_tabanli_programlama;

public class EnumKullanimi {
    public static void main(String[] args) {
        ucretAl(KonserveBoyut.ORTA, 100);

    }

    public static void ucretAl(KonserveBoyut boyut, int adet){
        switch (boyut){
            case KUCUK:
                System.out.println("Ücret :" +(adet*24)+" tl");
                break;
            case ORTA:
                System.out.println("Ücret :" +(adet*35)+" tl");
                break;
            case BUYUK:
                System.out.println("Ücret :" +(adet*48)+" tl");
                break;
        }
    }
}
