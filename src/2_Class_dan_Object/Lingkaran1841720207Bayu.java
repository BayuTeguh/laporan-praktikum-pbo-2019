
package Mahasiswa;

public class Lingkaran1841720207Bayu {
    public double mPhi=3.14, mR, luas, keliling;
    
/*public void mPhi(double phi){
    mPhi = phi;
}
public void jari2(double r){
    mR = r;
}*/
public double hitungLuasBayu(/*double mPhi, double mR*/){
    luas = mPhi*mR*mR;
    return luas;
}
public double hitungKelilingBayu(/*double mR, double mPhi*/){
    keliling = 2*mPhi*mR*mR;
    return keliling;
}
public void printHasilBayu(){
    System.out.println("Nilai phi: "+mPhi);
    System.out.println("Nilai Jari-jari: "+mR);
    //System.out.println("Luas Lingkaran: "+luas);
    //System.out.println("Keliling Lingkaran: "+keliling);
}
}
