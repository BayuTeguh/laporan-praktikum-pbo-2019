
package TugasInheritance;

public class Komputer1841720207Bayu {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer1841720207Bayu() {
    }

    public Komputer1841720207Bayu(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilDataBayu(){
        System.out.println("Nama Merk: "+merk);
        System.out.println("Jenis Prosesor: "+jnsProsesor);
        System.out.println("Kecepatan Prosesor: "+kecProsesor);
        System.out.println("Size Memory: "+sizeMemory);
    }
}
