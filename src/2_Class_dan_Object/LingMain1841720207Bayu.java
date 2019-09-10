
package Mahasiswa;

import java.util.Scanner;

public class LingMain1841720207Bayu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran1841720207Bayu ling = new Lingkaran1841720207Bayu();
        
        System.out.print("Masukkan Jari-jari: ");
        ling.mR = sc.nextDouble();
        System.out.println("=================");
        ling.printHasilBayu();
        //System.out.print("Masukkan phi: ");
        //ling.mPhi = sc.nextDouble();
        System.out.println("Luas Lingkaran: "+ling.hitungLuasBayu());
        System.out.println("Keliling Lingkaran: "+ling.hitungKelilingBayu());
        /*ling.hitungLuasBayu(3.14, 2);
        ling.hitungKelilingBayu(3.14, 3);
       /* ling.mPhi(3.14);
        ling.jari2(2);*/
    }
}
