/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung umur dan 
 * mengetahui detail pada setiap umurnya.
 */
public class PBO210117064Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        int thnlahir = sc.nextInt();
        
        System.out.println();
        Age age1 = new Age(2018);
        age1.setYearBirth(thnlahir);
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age1.getYearBirth());
        System.out.println("Hari ini tahun : " + age1.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age1.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + ANSI_RED+age1.tandanyaKamu(age1.hitungUmur())+ANSI_RESET);
    }
    
}
