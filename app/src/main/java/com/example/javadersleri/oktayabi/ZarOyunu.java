package com.example.javadersleri.oktayabi;

import java.util.*;

public class ZarOyunu {
    private Set<Integer> mySet;
    private int totalPoints;

    public ZarOyunu() {
        mySet = new HashSet<>();
        totalPoints = 0;
    }

    public void insertValue(int value) {
        mySet.add(value);
    }

    public void removeValue(int value) {
        mySet.remove(value);
    }

    public int getRandomValue() {
        List<Integer> list = new ArrayList<>(mySet);
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public int calculatePoints(int randomValue) {
        int earnedPoints = 0;

        if (randomValue % 2 == 0) {
            if ((randomValue / 2) % 2 == 0) {
                earnedPoints = 3;
            } else {
                earnedPoints = 1;
            }
        } else {
            earnedPoints = -2;
        }

        totalPoints += earnedPoints;
        return earnedPoints;
    }

    public void playGame() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in); // girdi almak için kullanıyorum

        for (int i = 0; i < 10; i++) {
            insertValue(rand.nextInt(100));
        }

        while (totalPoints < 50) {
            System.out.println("Zar atmak için 7'ye basın: ");
            int input = scanner.nextInt();

            if (input == 7) {
                int randomValue = getRandomValue();
                System.out.println("Zar atıldı: " + randomValue);

                int earnedPoints = calculatePoints(randomValue);
                if (earnedPoints > 0) {
                    System.out.println("Kazandınız: " + earnedPoints + " puan. Toplam puan: " + totalPoints);
                } else {
                    System.out.println("Kaybettiniz: " + earnedPoints + " puan. Toplam puan: " + totalPoints);
                }

                if (totalPoints >= 50) {
                    System.out.println("Kazandınız! Toplam puan: " + totalPoints);
                    break;
                }
            } else {
                System.out.println("Yanlış tuş, lütfen zar atmak için 7'ye basın.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        ZarOyunu game = new ZarOyunu();
        game.playGame();
    }
}
