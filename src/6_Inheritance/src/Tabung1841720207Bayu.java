
package inharitance;

public class Tabung1841720207Bayu extends Bangun1841720207Bayu{
    protected  int t;
    
    public void setSuperPhiBayu(double phi){
        super.phi = phi;
    }
    
    public void setSuperRBayu(int r){
        super.r = r;
    }

    public void setTBayu(int t) {
        this.t = t;
    }
    
    public void volumeBayu(){
        System.out.println("Volume Tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }
}
