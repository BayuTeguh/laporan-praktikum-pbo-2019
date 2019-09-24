
package bayu.relasiclass.percobaan1;

public class MainPercobaan11841720207Bayu {
    public static void main(String[] args) {
        Processor1841720207Bayu P = new Processor1841720207Bayu("Intel i5", 3);
        Laptop1841720207Bayu L = new Laptop1841720207Bayu("Thinkpad", P);
        
        L.infoBayu();
        
        Processor1841720207Bayu p1 = new Processor1841720207Bayu();
        p1.setMerkBayu("Intel i5");
        p1.setChacheBayu(4);
        
        Laptop1841720207Bayu L1 = new Laptop1841720207Bayu();
        L1.setMerkBayu("Thinkpad");
        L1.setProcBayu(p1);
        L1.infoBayu();
    }
}
