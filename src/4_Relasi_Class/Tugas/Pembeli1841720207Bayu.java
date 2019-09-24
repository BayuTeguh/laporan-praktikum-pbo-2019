
package Tugas;

public class Pembeli1841720207Bayu {
    private String mNama, mAlamat;
    private int mBiaya;

    public Pembeli1841720207Bayu(String mNama, String mAlamat) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatBayu() {
        return mAlamat;
    }

    public void setmAlamatBayu(String mAlamat) {
        this.mAlamat = mAlamat;
    }
    public int bayarHargaBayu(int jumlahBarang){
        return mBiaya*jumlahBarang;
    }
    public String infoBayu(){String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Alamat: " + this.mAlamat +"\n";
        return info;
    }
}
