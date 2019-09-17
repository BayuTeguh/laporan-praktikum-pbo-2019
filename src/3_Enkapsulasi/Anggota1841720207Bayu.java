
package koperasigettersetter;

public class Anggota1841720207Bayu {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;
    
   Anggota1841720207Bayu(String nama, String alamat){
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }
    
    public void setNamaBayu(String nama){
        this.mNama = nama;
    }
    public void setAlamatBayu(String alamat){
        this.mAlamat = alamat;
    }
    public String getNamaBayu(){
        return mNama;
    }
    public String getAlamatBayu(){
        return mAlamat;
    }
    public float getSimpanBayu(){
        return mSimpanan;
    }
    public void setorBayu(float uang){
        mSimpanan += uang;
    }
    public void pinjamBayu(float uang){
        mSimpanan -= uang;
    }
}
