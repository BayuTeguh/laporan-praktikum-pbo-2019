
package TugasEnkapsulasi;

public class InformasiKoperasi1841720207Bayu {
    private int mKtp;
    public String mNama;
    public double mJumlahPinjam, mLimit;

    public InformasiKoperasi1841720207Bayu(int ktp, String nama, double limit) {
        this.mKtp = ktp;
        mNama = nama;
        this.mLimit = limit;
    }
    public String getNamaBayu(){
        return mNama;
    }
    
    public void setNamaBayu(String nama){
        mNama = nama;
    }
    
    public double getLimitBayu(){
        return mLimit;
    }
    
    public void setLimitBayu(double limit){
        this.mLimit = limit;
    }
    
    public double getJumlahPinjamanBayu(){
        return mJumlahPinjam;
    }
    
    public void ansurBayu(double uang){
        if(uang >= mJumlahPinjam/100*10 ){
            mJumlahPinjam -= uang;
        }else{
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
    
    public void pinjamBayu(double uang){
        if(uang <= mLimit){
            mJumlahPinjam += uang;
        }else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }  
    /*public void setJumlahPinjamanBayu(double newJumlahPinjam){
        if(newJumlahPinjam <= mLimit){
            mJumlahPinjam = newJumlahPinjam;
        }else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }*/
}
