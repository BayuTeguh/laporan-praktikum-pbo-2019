
package Tugas;

public class Kurir1841720207Bayu {
    private String mNama;
    private int mBiaya;

    public Kurir1841720207Bayu(String mNama, int mBiaya) {
        this.mNama = mNama;
        this.mBiaya = mBiaya;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaBayu() {
        return mBiaya;
    }

    public void setmBiayaBayu(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int gajiKurirBayu(int bulan){
        return mBiaya * bulan;
    }
}
