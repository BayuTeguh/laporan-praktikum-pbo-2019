
package bayu.relasiclass.percobaan1;

public class Penumpang1841720207Bayu {
    private String mKtp, mNama;

    public Penumpang1841720207Bayu(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getmKtpBayu() {
        return mKtp;
    }

    public void setmKtpBayu(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }
    
    public String infoBayu(){
        String info = "";
        info += "Ktp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
