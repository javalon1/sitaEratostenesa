package com.sda.algorytmy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowlona liczbe calkowita >= 2");
        int n = scan.nextInt();  //wielkosc tabeli
        boolean[] tab = new boolean[n + 1];

        if (n <= 1) {
            System.out.println("Podales liczbe mniejsza od 2");
        }
        for (int i = 2; i < tab.length; i++) {
            tab[i] = true;
        }
        for (int i = 2; i < tab.length; i++) {
            if (tab[i] == true) {
                for (int a = i + i; a < tab.length; a += i) {
                    tab[a] = false;
                }
            }
        }

        System.out.println("Liczby pierwszcze ze zbioru " + n + " kolejnych liczb, to: ");
        for (int i = 2; i < tab.length; i++) {
            if (tab[i] == true) {
                System.out.println(i);
            }
        }
    }
}
