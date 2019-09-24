
package Tugas;

public class Barang1841720207Bayu {
    private String mNamaBarang, mJenisBarang;
    private int mHarga;

    public Barang1841720207Bayu(String mNamaBarang, String mJenisBarang, int mHarga) {
        this.mNamaBarang = mNamaBarang;
        this.mJenisBarang = mJenisBarang;
        this.mHarga = mHarga;
    }

    public String getmNamaBarangBayu() {
        return mNamaBarang;
    }

    public void setmNamaBarangBayu(String mNamaBarang) {
        this.mNamaBarang = mNamaBarang;
    }

    public String getmJenisBarangBayu() {
        return mJenisBarang;
    }

    public void setmJenisBarangBayu(String mJenisBarang) {
        this.mJenisBarang = mJenisBarang;
    }

    public int getmHargaBayu() {
        return mHarga;
    }

    public void setmHargaBayu(int mHarga) {
        this.mHarga = mHarga;
    }
    
    public int biayaBarangBayu(int hargaBarang){
        return mHarga * hargaBarang;
    }
    
    public String infoBayu(){String info = "";
        info += "Nama Barang: " + this.mNamaBarang + "\n";
        info += "Jenis Barang: " + this.mJenisBarang +"\n";
        return info;
    }
}
