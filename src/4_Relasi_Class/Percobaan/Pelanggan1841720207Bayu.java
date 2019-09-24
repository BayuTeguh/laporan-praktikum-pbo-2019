
package bayu.relasiclass.percobaan1;

public class Pelanggan1841720207Bayu {
    private String mNama;
    private Mobil1841720207Bayu mMobil;
    private Sopir1841720207Bayu mSopir;
    private int mHari;

    public Pelanggan1841720207Bayu() {
    }

    public int getmHariBayu() {
        return mHari;
    }

    public void setmHariBayu(int mHari) {
        this.mHari = mHari;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }

    public Mobil1841720207Bayu getmMobilBayu() {
        return mMobil;
    }

    public void setmMobilBayu(Mobil1841720207Bayu mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720207Bayu getmSopirBayu() {
        return mSopir;
    }

    public void setmSopirBayu(Sopir1841720207Bayu mSopir) {
        this.mSopir = mSopir;
    }
    
    public int hitungBiayaTotalBayu(){
        return mMobil.hitungBiayaMobilBayu(mHari)+
                mSopir.hitungBiayaSopirBayu(mHari);
    }
}
