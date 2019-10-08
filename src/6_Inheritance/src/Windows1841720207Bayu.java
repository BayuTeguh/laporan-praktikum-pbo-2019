
package TugasInheritance;

public class Windows1841720207Bayu extends Laptop1841720207Bayu{
    public String fitur;

    public Windows1841720207Bayu() {
    }

    public Windows1841720207Bayu(String fitur, String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindowsBayu(){
         System.out.println("===========Data Windows============");
         super.tampilLeptopBayu();
         System.out.println("Fitur: "+fitur);
    }
}
