
package inharitance;

public class Lingkaran1841720207Bayu extends BangunDatar1841720207Bayu{
    
    public float r;
    public double phi;
    
    public void isiPhiBayu(double phi){
        this.phi = phi;
    }
    
    public void isiRBayu(float r){
        this.r = r;
    }
    public void cetakLuasBayu(){
        super.kelilingBayu(r);
        System.out.println("Luas lingkaran: "+phi*r*r);
    }
    
    public void cetakKelilingBayu(){
        super.kelilingBayu(r);
        System.out.println("Keliling lingkaran: "+2*phi*r+"\n");
    }
}
