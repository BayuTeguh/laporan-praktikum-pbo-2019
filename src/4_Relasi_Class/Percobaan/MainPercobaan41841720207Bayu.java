
package bayu.relasiclass.percobaan1;

public class MainPercobaan41841720207Bayu {
    public static void main(String[] args) {
        Penumpang1841720207Bayu p = new Penumpang1841720207Bayu("12345", "Mr.Krab");
        Penumpang1841720207Bayu w = new Penumpang1841720207Bayu("12346", "Mr.Budi");
        Gerbong1841720207Bayu gerbong = new Gerbong1841720207Bayu("A", 10);
        gerbong.setPenumpangBayu(p, -1);
        //System.out.println(gerbong.infoBayu());
        gerbong.setPenumpangBayu(w, 2);
        //p.infoBayu();
        //gerbong.setPenumpangBayu(p, 1);
        System.out.println(gerbong.infoBayu());
        
    }
}
    
