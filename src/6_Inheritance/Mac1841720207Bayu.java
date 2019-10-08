
package TugasInheritance;

public class Mac1841720207Bayu extends Laptop1841720207Bayu{
    public String security;

    public Mac1841720207Bayu() {
    }

    public Mac1841720207Bayu(String security, String jnsBatrei, String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        super(jnsBatrei, merk, jnsProsesor, kecProsesor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMacBayu(){
         System.out.println("===========Data Mac============");
         super.tampilLeptopBayu();
         System.out.println("Security: "+security);
    }
}
