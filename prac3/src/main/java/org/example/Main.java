package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Введите название магазина: ");
        Store store = new Store(scanner());
        System.out.println("Изначальное имя - " + store.getName());
        Revisor revisor = new Revisor("Oleg");
        revisor.closeStore(store);
        System.out.println("Имя после closeStore - " + store.getName());
        revisor.rebranding(store);
        System.out.println("Имя после rebranding - " + store.getName());
    }

    private static String scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

