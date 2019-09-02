
package SepedaDemo;

public class Baju1841720207Bayu {
    private String mMerk;
    private String mWarna;
    private String mCorak;
    private double mHarga;
    
    public void setMerkBayu(String newValue){
        mMerk = newValue;
    }
    public void setWarnaBayu(String newValue){
        mWarna = newValue;
    }
    public void setCorakBayu(String newValue){
        mCorak = newValue;
    }
    public void daftarHargaBayu(double newValue){
        mHarga = newValue;
    }
    public void cetakStatusBayu(){
        System.out.println("Merk: "+mMerk);
        System.out.println("Warna: "+mWarna);
        System.out.println("Corak: "+mCorak);
        System.out.println("Harga Rp.: "+mHarga);
    }
}
