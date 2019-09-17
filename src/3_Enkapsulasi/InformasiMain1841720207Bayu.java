
package TugasEnkapsulasi;

import java.util.Scanner;

public class InformasiMain1841720207Bayu {
    static void menu(){
        System.out.println("MENU KOPERASI PINJAMAN");
        System.out.println("1.Pengisian data diri");
        System.out.println("2.Peminjaman uang");
        System.out.println("3.Angsuran perbulan");
        System.out.println("4.Keterangan");
        System.out.println("5. Keluar");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        InformasiKoperasi1841720207Bayu bayu = new InformasiKoperasi1841720207Bayu(122233446,
                "Supri", 5000000);
                double mMasuk;
                
        System.out.print("Nama Anggota: ");
        bayu.mNama = sc.nextLine();
        System.out.print("Limit Pinjaman: ");
        bayu.mLimit = sc.nextDouble();
        
        System.out.print("Masukkan jumlah pinjaman: ");
        mMasuk = sc.nextDouble();
        System.out.println("\nMeminjam uang "+mMasuk);
        bayu.pinjamBayu(mMasuk);
        System.out.println("Jumlah pinjaman saat ini: "+bayu.getJumlahPinjamanBayu());
        
        System.out.print("\nMasukkan jumlah pinjaman: ");
        mMasuk = sc.nextDouble();
        System.out.println("\nMeminjam uang "+mMasuk);
        bayu.pinjamBayu(mMasuk);
        System.out.println("Jumlah pinjaman saat ini: "+bayu.getJumlahPinjamanBayu());
        
        System.out.print("\nMasukkan jumlah angsuran: ");
        mMasuk = sc.nextDouble();
        System.out.println("\nMembayar angsuran "+mMasuk);
        bayu.ansurBayu(mMasuk);
        System.out.println("Jumlah pinjaman saat ini: "+bayu.getJumlahPinjamanBayu());
        
        System.out.print("\nMasukkan jumlah angsuran: ");
        mMasuk = sc.nextDouble();
        System.out.println("\nMembayar angsuran "+mMasuk);
        bayu.ansurBayu(mMasuk);
        System.out.println("Jumlah pinjaman saat ini: "+bayu.getJumlahPinjamanBayu());
    }
}
