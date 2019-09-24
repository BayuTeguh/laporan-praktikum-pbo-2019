
package bayu.relasiclass.percobaan1;

public class MainPercobaan21841720207Bayu {
    public static void main(String[] args) {
        Mobil1841720207Bayu m = new Mobil1841720207Bayu();
        m.setMerkBayu("Avanza");
        m.setmBiayaBayu(350000);
        Sopir1841720207Bayu s = new Sopir1841720207Bayu();
        s.setmNamaBayu("John Doe");
        s.setmBiayaBayu(200000);
        Pelanggan1841720207Bayu p = new Pelanggan1841720207Bayu();
        p.setmNamaBayu("John Doe");
        p.setmMobilBayu(m);
        p.setmSopirBayu(s);
        p.setmHariBayu(2);
        System.out.println("Biaya total = "+p.hitungBiayaTotalBayu());
        System.out.println(p.getmSopirBayu().getmNamaBayu()); 
    }
}
