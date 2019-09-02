
package SepedaDemo;

public class SepedaDemo1841720207Bayu {
    public static void main(String[] args) {
        
        Sepeda1841720207Bayu spd1 = new Sepeda1841720207Bayu();
        Sepeda1841720207Bayu spd2 = new Sepeda1841720207Bayu();
        SepedaGunung1841720207Bayu spd3= new SepedaGunung1841720207Bayu();
        
        spd1.setMerekBayu("Polygon");
        spd1.setWarnaBayu("Hitam");
        spd1.tambahKecepatanBayu(10);
        spd1.gantiGearBayu(2);
        spd1.cetakStatusBayu();
        
        spd2.setMerekBayu("United");
        spd2.tambahKecepatanBayu(10);
        spd2.remBayu(5);
        spd2.tambahKecepatanBayu(10);
        spd2.remBayu(8);
        spd2.tambahKecepatanBayu(2);
        spd2.cetakStatusBayu();
        
        spd3.setMerekBayu("Klinee");
        spd3.tambahKecepatanBayu(5);
        spd3.gantiGearBayu(7);
        spd3.setTipeSuspensiBayu("Gas suspension");
        spd3.cetakStatusBayu();
    }
}
