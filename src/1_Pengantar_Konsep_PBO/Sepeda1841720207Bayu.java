

package SepedaDemo;

public class Sepeda1841720207Bayu {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    public void setWarnaBayu(String newValue){
        mWarna = newValue;
    }
    
    public void setMerekBayu(String newValue){
        mMerek = newValue;
    }
    
    public void gantiGearBayu(int newValue){
        mGear = newValue;
    }
    
    public void tambahKecepatanBayu(int plus){
        mKecepatan = mKecepatan + plus;
    }
    
    public void remBayu(int min){
        mKecepatan = mKecepatan - min;
    }
    
    public void cetakStatusBayu(){
        System.out.println("Merek: " + mMerek);
        System.out.println("Warna: "+mWarna);
        System.out.println("Kecepatan: " + mKecepatan + "km/h");
        System.out.println("Gear:" + mGear);
    }
}

