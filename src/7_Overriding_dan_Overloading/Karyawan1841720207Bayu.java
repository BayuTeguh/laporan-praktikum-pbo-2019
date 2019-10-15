package OverloadOverride;

public class Karyawan1841720207Bayu {
    private String mNama, mNip, mGolongan;
    private double mGaji;
    
    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipBayu(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganBayu(String mGolongan) {
        this.mGolongan = mGolongan;
        
        switch(mGolongan.charAt(0)){
            case '1': this.mGaji=5000000;
                break;
            case '2': this.mGaji=3000000;
                break;
            case '3': this.mGaji=2000000;
                break;
            case '4': this.mGaji=1000000;
                break;
            case '5': this.mGaji=750000;
                break;
        }
    }

    public void setMgajiBayu(double mgaji) {
        this.mGaji = mgaji;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public String getmNipBayu() {
        return mNip;
    }

    public String getmGolonganBayu() {
        return mGolongan;
    }

    public double getmGajiBayu() {
        return mGaji;
    }
    
    
}
