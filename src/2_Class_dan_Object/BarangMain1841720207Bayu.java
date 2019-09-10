
package Mahasiswa;

import java.util.Scanner;

public class BarangMain1841720207Bayu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        
        Barang1841720207Bayu br = new Barang1841720207Bayu();
        
        System.out.print("Masukkan Kode: ");
        br.mKode = sc.nextLine();
        
        System.out.print("Masukkan Nama Barang: ");
        br.mNamaBarang = sc.nextLine();
        
        System.out.print("Masukkan Diskon: ");
        br.mDiskon = sc.nextFloat();
        
        System.out.print("Masukkan Harga: ");
        br.mHargaDasar = sc.nextInt();
        
        System.out.println("=============");
        
        br.printHasilBayu();
        
        System.out.println("Harga Jual: "+br.hitungHargaJualBayu(0));
    }
}
