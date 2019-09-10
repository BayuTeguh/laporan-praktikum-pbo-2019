
package Mahasiswa;

public class Barang1841720207Bayu {
   public String mKode, mNamaBarang;
   public int mHargaDasar;
   public float mDiskon;
   
   public void printHasilBayu(){
       System.out.println("Kode: "+mKode);
       System.out.println("Nama Barang: "+mNamaBarang);
       System.out.println("Harga dasar barang Rp.: "+mHargaDasar);
       System.out.println("Jumlah diskon: "+mDiskon+"%");
   }
   
   
   public int hitungHargaJualBayu(int hargaJual){
       hargaJual = (int) (mHargaDasar-(mDiskon/100*mHargaDasar));
       return hargaJual;
   }
}
