
package Tugas;

public class MainTugas1841720207Bayu {
    public static void main(String[] args) {
        Pembeli1841720207Bayu p = new Pembeli1841720207Bayu("Aji", "Dinoyo");
        Kurir1841720207Bayu k = new Kurir1841720207Bayu("Ale", 1000000);
        Barang1841720207Bayu b = new Barang1841720207Bayu("Supreme", "Baju", 1000000);
        Penjual1841720207Bayu pj = new Penjual1841720207Bayu("Teja", k, b);
        
        //pj.setmBulan(1);
        //pj.setmTotalHargaBayu(2);
        System.out.println(p.infoBayu());
        System.out.println(b.infoBayu());
        System.out.println("Harga Barang = "+b.biayaBarangBayu(3));
        //System.out.println(p.infoBayu());
    }
}
