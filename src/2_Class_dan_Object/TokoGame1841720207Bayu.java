
package Mahasiswa;

public class TokoGame1841720207Bayu {
    public int mId;
    public String mNamaGame;
    public String mNamaMember;
    public int mJumlahHari;
    public double mHarga;
    
    public void printDataBayu(){
        System.out.println("No ID       : "+mId);
        System.out.println("Nama Member : "+mNamaMember);
        System.out.println("Nama Game   : "+mNamaGame);
        System.out.println("Jumlah hari : "+mJumlahHari);
        System.out.println("Harga Sewa  : "+mHarga+" Per hari");
    }
    
    public double hargaSewaBayu(/*double harga, int jumlahHari*/){
        mHarga = mHarga*mJumlahHari;
        return mHarga;
    }
}
