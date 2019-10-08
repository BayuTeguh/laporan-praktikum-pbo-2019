
package TugasInheritance;

public class Laptop1841720207Bayu extends Komputer1841720207Bayu{
    public String jnsBatrei;
    
    public Laptop1841720207Bayu() {
    }

    public Laptop1841720207Bayu(String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLeptopBayu(){
        super.tampilDataBayu();
        System.out.println("Jenis Batrei: "+jnsBatrei);
    }
}
