package com.tutorial.javafundamental.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        * CONTOH DATETIME
        * */
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        // menampilkan spesifik waktu yang diinginkan
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan   : " + calendar.get(Calendar.MONTH));
        System.out.println("Tahun   : " + calendar.get(Calendar.YEAR));



        // Menampilkan waktu sekarang
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu: " + calendar.getTime());
        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: " + calendar.getTime());
        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 tahun kemudian: " + calendar.getTime());

        /*
        * CONTOH DATETIME MENGGUNAKAN SimpleDateFormat
        * */

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan format : " + dateFormated);

        /*
        * CONTOH UNARY OPERATOR
        * */
        int tambah = 10;
        int kurang = 10;
        int kali = 10;
        int bagi = 10;
        int modulo = 10;

            tambah += 10;
            System.out.println("Hasilnya tambah : " + tambah);

            kurang -= 10;
            System.out.println("Hasilnya kurang : " + kurang);

            kali *= 10;
            System.out.println("Hasilnya kali : " + kali);

            bagi /= 10;
            System.out.println("Hasilnya bagi : " + bagi);

            modulo %= 2;
            System.out.println("Hasilnya modulo : " + modulo);

            /*
            * Casting DARI Double ke bentuk String menggunakan fungsi String.valueOf
            * */

            double a = 3.14;
            String hasil = String.valueOf(a);
            System.out.println(hasil);


    }
}
