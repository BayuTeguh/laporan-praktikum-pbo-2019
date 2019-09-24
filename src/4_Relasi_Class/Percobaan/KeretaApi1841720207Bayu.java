
package bayu.relasiclass.percobaan1;

public class KeretaApi1841720207Bayu {
    private String mNama, mKelas;
    private Pegawai1841720207Bayu mMasinis, mAsisten;

    public KeretaApi1841720207Bayu(String mNama, String mKelas, Pegawai1841720207Bayu mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720207Bayu(String mNama, String mKelas, Pegawai1841720207Bayu mMasinis, Pegawai1841720207Bayu mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelasBayu() {
        return mKelas;
    }

    public void setmKelasBayu(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720207Bayu getmMasinisBayu() {
        return mMasinis;
    }

    public void setmMasinisBayu(Pegawai1841720207Bayu mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720207Bayu getmAsistenBayu() {
        return mAsisten;
    }

    public void setmAsistenBayu(Pegawai1841720207Bayu mAsisten) {
        this.mAsisten = mAsisten;
    }
    
    public String infoBayu(){String info = "";
        info += "Nama: " + this.mNama + "\n"; 
        info += "Kelas: " + this.mKelas + "\n"; 
        info += "Masinis: " + this.mMasinis.infoBayu() + "\n";
        info += "Asisten: " + this.mAsisten.infoBayu() + "\n";
        return info; 
    }
}
