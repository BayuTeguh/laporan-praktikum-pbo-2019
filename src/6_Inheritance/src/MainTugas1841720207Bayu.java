
package TugasInheritance;

public class MainTugas1841720207Bayu {
    public static void main(String[] args) {
        
        Pc1841720207Bayu pc = new Pc1841720207Bayu(18, "Lenovo C225", "AMD E350", 3, 4);
        pc.tampilPcBayu();
        
        Mac1841720207Bayu mc = new Mac1841720207Bayu("Avast", "lithium-polymer", "MacBook Air", "Intel core i5 dual-core", 3, 8);
        mc.tampilMacBayu();
        
        Windows1841720207Bayu wd = new Windows1841720207Bayu("Dark Mode", "lithium-polymer", "WinPro", "Intel core i5", 3, 8);
        wd.tampilWindowsBayu();
    }
}
