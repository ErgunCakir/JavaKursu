package com.example.javadersleri.standart_programlama;

public class Donguler {
    public static void main(String[] args) {
        //loop = Döngüler
        //1,2,3
        for(int i =1;i<4;i++){
            System.out.println("Döngü 1 :"+i);
        }

        //10 ile 20 arasında ama 5'er artış
        for(int x =10;x<=20;x+=5){
            System.out.println("Döngü 2 :"+x);
        }

        //20 ile 10 arasında 5'er azalma
        for(int y =20;y>9;y-=5){
            System.out.println("Döngü 3 :"+y);
        }

        //1,2,3
        int sayac = 1;
        while(sayac<4){
            System.out.println("Döngü 4 :"+sayac);
            sayac+=1; //sayac = sayac + 1, sayac++

        }

        //1,2,3,4,5
        for(int i =1;i<6;i++){
            if (i == 3){
                break;
            }
            System.out.println("Döngü 5 :"+i);
        }

        //1,2,3,4,5
        for(int i =1;i<6;i++){
            if (i == 3){
                continue;
            }
            System.out.println("Döngü 6 :"+i);
        }
    }
}
