
package Tugas;

public class Penjual1841720207Bayu {
    private String mNama;
    private Kurir1841720207Bayu mKurir;
    private Barang1841720207Bayu mBarang;
    private int mTotalHarga, mBulan;

    public Penjual1841720207Bayu(String mNama, Kurir1841720207Bayu mKurir, Barang1841720207Bayu mBarang) {
        this.mNama = mNama;
        this.mKurir = mKurir;
        this.mBarang = mBarang;
    }

    public int getmBulan() {
        return mBulan;
    }

    public void setmBulan(int mBulan) {
        this.mBulan = mBulan;
    }
    
    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }

    public Kurir1841720207Bayu getmKurirBayu() {
        return mKurir;
    }

    public void setmKurirBayu(Kurir1841720207Bayu mKurir) {
        this.mKurir = mKurir;
    }

    public Barang1841720207Bayu getmBarangBayu() {
        return mBarang;
    }

    public void setmBarangBayu(Barang1841720207Bayu mBarang) {
        this.mBarang = mBarang;
    }

    public int getmTotalHargaBayu() {
        return mTotalHarga;
    }

    public void setmTotalHargaBayu(int mTotalHarga) {
        this.mTotalHarga = mTotalHarga;
    }
    
    public int hitungBiayaTotalBayu(){
        return mKurir.gajiKurirBayu(mBulan)+
                mBarang.biayaBarangBayu(mTotalHarga);
    }
}
