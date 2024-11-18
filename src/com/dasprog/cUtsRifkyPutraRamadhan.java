package com.dasprog; 
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class cUtsRifkyPutraRamadhan {
    
    // Mendefinisikan warna untuk output terminal
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Mendeklarasikan formatter dan mengatur zona waktu
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));

        String ulang;
        do {
            // Mendeklarasikan variabel untuk menyimpan data input
            String nama, kelas, alamat;
            int nim, umur, x, y;
            
            // Menggunakan formatter untuk memformat tanggal dengan zona waktu yang telah ditentukan
            String Tanggal = formatter.format(new Date());

            // Menampilkan judul UTS
            System.out.println(RESET + "************************************************************");
            System.out.println("*  ===UTS PEMROGRAMAN DASAR===");
            System.out.println("*  ");
            
            // Menampilkan judul data mahasiswa
            System.out.println("*  ===Silahkan Isi Data Di Bawah Ini===");

            // Input untuk nama lengkap
            System.out.print("*  | Nama Lengkap          : ");
            nama = input.nextLine();

            // Validasi input untuk NIM (harus berupa angka)
            while (true) {
                System.out.print(RESET + "*  | NIM                   : ");
                if (input.hasNextInt()) {
                    nim = input.nextInt();
                    input.nextLine();  // membersihkan buffer
                    break;
                } else {
                    System.out.println(RED + "*  | NIM harus berupa angka! Silahkan Coba Kembali!" + RESET);
                    input.nextLine();  // membersihkan buffer
                }
            }

            // Input untuk kelas
            System.out.print("*  | Kelas                 : ");
            kelas = input.nextLine();

            // Validasi input untuk umur (harus berupa angka dalam rentang yang wajar)
            while (true) {
                System.out.print(RESET + "*  | Umur                  : ");
                if (input.hasNextInt()) {
                    umur = input.nextInt();
                    input.nextLine();  // membersihkan buffer setelah pembacaan angka

                    // Memeriksa apakah umur berada dalam rentang yang wajar
                    if (umur > 0 && umur <= 150) {  
                        break; // Keluar dari loop jika umur valid
                    } else {
                        System.out.println(RED + "*  | Umur harus dalam rentang 1 hingga 150! Silahkan coba lagi." + RESET);
                    }
                } else {
                    System.out.println(RED + "*  | Umur harus berupa angka! Silahkan coba lagi." + RESET);
                    input.nextLine();  // membersihkan buffer jika input bukan angka
                }
            }


            // Input untuk alamat
            System.out.print("*  | Alamat                : ");
            alamat = input.nextLine();

            // Menampilkan judul aritmatika
            System.out.println("*  ===Silahkan Isi Bilangan Aritmatika Di Bawah Ini===");
           // Validasi input untuk bilangan pertama (harus ganjil)
            while (true) {
                System.out.print(RESET + "*  | Bilangan 1 (Ganjil)   : ");
                if (input.hasNextInt()) {
                    x = input.nextInt();
                    input.nextLine();  // membersihkan buffer setelah pembacaan angka

                    // Memeriksa apakah bilangan ganjil
                    if (x % 2 != 0) {  
                        break; // Keluar dari loop jika bilangan ganjil
                    } else {
                        System.out.println(RED + "*  | Bilangan 1 harus ganjil! Silahkan coba lagi." + RESET);
                    }
                } else {
                    System.out.println(RED + "*  | Bilangan 1 harus berupa angka! Silahkan coba lagi." + RESET);
                    input.nextLine();  // membersihkan buffer jika input bukan angka
                }
            }

            // Validasi input untuk bilangan kedua (harus genap)
            while (true) {
                System.out.print(RESET + "*  | Bilangan 2 (Genap)    : ");
                if (input.hasNextInt()) {
                    y = input.nextInt();
                    input.nextLine();  // membersihkan buffer setelah pembacaan angka

                    // Memeriksa apakah bilangan genap
                    if (y % 2 == 0) {  
                        break; // Keluar dari loop jika bilangan genap
                    } else {
                        System.out.println(RED + "*  | Bilangan 2 harus genap! Silahkan coba lagi." + RESET);
                    }
                } else {
                    System.out.println(RED + "*  | Bilangan 2 harus berupa angka! Silahkan coba lagi." + RESET);
                    input.nextLine();  // membersihkan buffer jika input bukan angka
                }
            }


            // Menghitung hasil operasi aritmatika
            int penjumlahan = x + y;
            int pengurangan = x - y;
            int perkalian = x * y;
            double pembagian = (double) x / y;
            int modulus = x % y;

            // Menampilkan data mahasiswa
            System.out.println(BLUE + "************************************************************");
            System.out.println(BLUE + "*  ===DATA MAHASISWA===");
            System.out.println(BLUE + "*  | Nama Lengkap  : " + nama);
            System.out.println(BLUE + "*  | NIM           : " + nim);
            System.out.println(BLUE + "*  | Kelas         : " + kelas);
            System.out.println(BLUE + "*  | Umur          : " + umur + " Tahun");
            System.out.println(BLUE + "*  | Alamat        : " + alamat);
            System.out.println(BLUE + "************************************************************");

            // Menampilkan hasil perhitungan aritmatika
            System.out.println(BLUE + "*  ===PROGRAM ARITMATIKA===");
            System.out.println(BLUE + "*  | " + x + " + " + y + " = " + penjumlahan);
            System.out.println(BLUE + "*  | " + x + " - " + y + " = " + pengurangan);
            System.out.println(BLUE + "*  | " + x + " × " + y + " = " + perkalian);
            System.out.println(BLUE + "*  | " + x + " / " + y + " = " + pembagian);
            System.out.println(BLUE + "*  | " + x + " % " + y + " = " + modulus);
            
            // Menampilkan tanggal Pengisian
            System.out.println(BLUE + "*" + GREEN + "  _________________________________________________________");
            System.out.println(BLUE + "*  " + GREEN + "Tanggal Pengisian: " + Tanggal);


            // Menampilkan copyright
            System.out.println(BLUE + "************************************************************");
            System.out.println(RESET + "   Copyright © 2024 RifkyPutraRamadhan. All rights reserved.");

            // Menanyakan apakah ingin mengulang program
            System.out.print(GREEN + "Apakah anda ingin mencoba lagi? (y/n): ");
            ulang = input.next();
            input.nextLine(); // membersihkan buffer

        } while (ulang.equalsIgnoreCase("y"));

        input.close();
        System.out.println(GREEN + "Terima kasih telah melakukan pengisian." + RESET);
    }
}