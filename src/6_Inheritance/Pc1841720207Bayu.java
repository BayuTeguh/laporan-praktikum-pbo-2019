
package TugasInheritance;

public class Pc1841720207Bayu extends Komputer1841720207Bayu{
    public int ukuranMonitor;

    public Pc1841720207Bayu() {
    }

    public Pc1841720207Bayu(int ukuranMonitor, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPcBayu(){
        System.out.println("===========Data Pc============");
        super.tampilDataBayu();
        System.out.println("Ukuran Monitor: "+ukuranMonitor);
    }
}
