
package Mahasiswa;

import java.util.Scanner;

public class GajiMain1841720207Bayu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Karyawan1841720207Bayu kr = new Karyawan1841720207Bayu();
        
        System.out.print("Masukkan No ID: ");
        kr.mId = sc.nextInt();
        System.out.print("Masukkan Nama: ");
        kr.mNama = s.nextLine();
        System.out.print("Masukkan Jenis kelamin: ");
        kr.mJenisKelamin = c.nextLine();
        System.out.print("Masukkan jabatan: ");
        kr.mJabatan = s.nextLine();
        System.out.print("Masukkan gaji: ");
        kr.mGaji = sc.nextDouble();
        System.out.println(">>>>>>>>>>Data Karyawan<<<<<<<<<<");
        
        kr.printBayu();
        
    }
}
