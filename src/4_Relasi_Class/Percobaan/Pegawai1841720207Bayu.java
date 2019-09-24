
package bayu.relasiclass.percobaan1;

public class Pegawai1841720207Bayu {
    private String mNip, mNama;

    public Pegawai1841720207Bayu(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public String getmNipBayu() {
        return mNip;
    }

    public void setmNipBayu(String mNip) {
        this.mNip = mNip;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }
    
    public String infoBayu(){String info = "";
        info += "Nip: " + this.mNip + "\n";
        info += "Nama: " + this.mNama +"\n";
        return info;
    }
}
