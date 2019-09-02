
package SepedaDemo;

public class SepedaGunung1841720207Bayu extends Sepeda1841720207Bayu{
     private String mTipeSuspensi;
    
    public void setTipeSuspensiBayu(String newValue){
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusBayu(){
        super.cetakStatusBayu();
        System.out.println("Tipe suspensi" +mTipeSuspensi);
    }
}
