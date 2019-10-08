
package inharitance;

public class PersegiPanjang1841720207Bayu extends BangunDatar1841720207Bayu{
    public float panjang, lebar;
    
    public void isiPanjangBayu(float panjang){
        this.panjang = panjang;
    }
    
    public void isiLebarBayu(float lebar){
        this.lebar = lebar;
        
    } 
    public void cetakLuasBayu(){
        super.luasBayu(lebar);
        System.out.println("Luas Persegi Panjang: "+panjang*lebar);
    }
    
    public void cetakKelilingBayu(){
        super.kelilingBayu(panjang);
        System.out.println("Keliling Persegi Panjang: "+2*(panjang+lebar));
    }
}
