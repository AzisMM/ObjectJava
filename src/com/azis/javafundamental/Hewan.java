package com.azis.javafundamental;

public class Hewan {

    String nama;
    int berat;
    int jumlahKali;

    //ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void beratHewan(int berathewan) {
        berat = berathewan;
    }

    public void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKali = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Berat Hewan : " + berat + " Kg");
        System.out.println("Jumlah Kaki : " + jumlahKali);
    }
}
