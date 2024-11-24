package com.example.javadersleri.nesne_tabanli_programlama.kalitim;

public class KalitimKullanimi {
    public static void main(String[] args) {
        Saray topkapiSaray = new Saray();
        topkapiSaray.setKuleSayisi(10);
        topkapiSaray.setPencereSayisi(300);

        System.out.println(topkapiSaray.getKuleSayisi());
        System.out.println(topkapiSaray.getPencereSayisi());

        Villa bogazVilla = new Villa();
        bogazVilla.setGarajVarmi(true);
        bogazVilla.setPencereSayisi(100);

        System.out.println(bogazVilla.isGarajVarmi());
        System.out.println(bogazVilla.getPencereSayisi());

        //Type casting
        //Tip kontrolü
        if(topkapiSaray instanceof Saray){//is = instanceof
            System.out.println("Saraydır");
        }else{
            System.out.println("Saray değildir");

        }

        //upcasting
        Saray saray = new Saray();
        Ev ev = saray;

        //Downcasting
        Ev home = new Ev();
        Saray yeniSaray = (Saray) home;

    }
}
