
package SepedaDemo;

public class BajuMain1841720207Bayu {
    public static void main(String[] args) {
        
        Baju1841720207Bayu bj1 = new Baju1841720207Bayu();
        Baju1841720207Bayu bj2 = new Baju1841720207Bayu();
      
        bj1.setMerkBayu("Gucci");
        bj1.setWarnaBayu("Cream");
        bj1.setCorakBayu("Cream Polos");
        bj1.daftarHargaBayu(200000);
        bj1.cetakStatusBayu();
        
        bj2.setMerkBayu("Dior");
        bj2.setWarnaBayu("Putih");
        bj2.setCorakBayu("Putih Polos");
        bj2.daftarHargaBayu(250000);
        bj2.cetakStatusBayu();
    }
}
