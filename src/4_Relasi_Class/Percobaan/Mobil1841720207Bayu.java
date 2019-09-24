
package bayu.relasiclass.percobaan1;

public class Mobil1841720207Bayu {
    private String mMerk;
    private int mBiaya;

    Mobil1841720207Bayu() {
    }

    public Mobil1841720207Bayu(String mMerk, int mBiaya) {
        this.mMerk = mMerk;
        this.mBiaya = mBiaya;
    }
    
    public String getMerkBayu(){
        return mMerk;
    }
    public void setMerkBayu(String merk){
        mMerk = merk;
    }

    public int getmBiayaBayu() {
        return mBiaya;
    }

    public void setmBiayaBayu(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    public int hitungBiayaMobilBayu(int hari){
        return mBiaya*hari;
    }
}
