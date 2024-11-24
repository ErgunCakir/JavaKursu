package com.example.javadersleri.interface_kullanimi;

public class MyClass implements MyInterface{
    @Override
    public void metod1() {
        System.out.println("Metod1 çalıştı");
    }

    @Override
    public String metod2() {
        return "Metod2 çalıştı";
    }
}
