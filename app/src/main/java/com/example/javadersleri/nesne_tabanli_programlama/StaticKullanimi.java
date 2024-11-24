package com.example.javadersleri.nesne_tabanli_programlama;

public class StaticKullanimi {
    public static void main(String[] args) {
        ASinifi a = new ASinifi();

        System.out.println(a.x);
        a.metod();

        System.out.println(new ASinifi());
        new ASinifi().metod();
    }
}
