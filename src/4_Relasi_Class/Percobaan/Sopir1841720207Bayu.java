
package bayu.relasiclass.percobaan1;

public class Sopir1841720207Bayu {
    private String mNama;
    private int mBiaya;

    Sopir1841720207Bayu() {
    }

    public Sopir1841720207Bayu(String mNama, int mBiaya) {
        this.mNama = mNama;
        this.mBiaya = mBiaya;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public int getmBiayaBayu() {
        return mBiaya;
    }

    public void setmBiayaBayu(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }
    
    public int hitungBiayaSopirBayu(int hari){
        return mBiaya*hari;
    }
}
