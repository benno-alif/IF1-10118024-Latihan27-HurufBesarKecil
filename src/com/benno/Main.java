package com.benno;
import java.util.Scanner;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Format huruf besar dan kecil
     */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        String words = scanner.nextLine();

        String upperCase = words.toUpperCase();
        String lowerCase = words.toLowerCase();

        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + upperCase);
        System.out.println("Huruf Kecil : " + lowerCase);
    }
}
