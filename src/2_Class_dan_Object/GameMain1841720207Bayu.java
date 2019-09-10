
package Mahasiswa;

import java.util.Scanner;

public class GameMain1841720207Bayu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        TokoGame1841720207Bayu tg=new TokoGame1841720207Bayu();
        
        System.out.print("Masukkan No Id: ");
        tg.mId = sc.nextInt();
        
        System.out.print("Masukkan Nama Member: ");
        tg.mNamaMember = s.nextLine();
        
        System.out.print("Masukkan Nama Game: ");
        tg.mNamaGame = c.nextLine();
        
        System.out.print("Masukkan Jumlah Hari: ");
        tg.mJumlahHari = sc.nextInt();
        
        System.out.print("Masukkan Harga: ");
        tg.mHarga = sc.nextDouble();
        
        System.out.println("=====================");
        
        tg.printDataBayu();
        
        System.out.println("Harga Sewa Game: "+tg.hargaSewaBayu());
    }
}

