package com.example.javadersleri.standart_programlama;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;

        int x = 90;
        int y = 80;

        System.out.println("a == b  : "+(a == b));
        System.out.println("a != b  : "+(a != b));
        System.out.println("a > b   : "+(a > b));
        System.out.println("a >= b  : "+(a >= b));
        System.out.println("a < b   : "+(a < b));
        System.out.println("a <= b  : "+(a <= b));

        System.out.println("a > b || x > y : "+(a > b || x > y)); //OR: veya. False - False olmadığı her durumda çıktı True olur.
        System.out.println("a > b && x > y : "+(a > b || x > y)); //AND: ve. True - True ise True çıkar her zaman, diğer durumlarda False olur.
    }
}
