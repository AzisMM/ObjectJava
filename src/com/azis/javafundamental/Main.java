package com.azis.javafundamental;

public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang");
        Hewan kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        System.out.println("\n");

        kucing.beratHewan(2);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();
    }
}
