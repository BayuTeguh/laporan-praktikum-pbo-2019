
package bayu.relasiclass.percobaan1;

public class MainPercobaan31841720207Bayu {
    public static void main(String[] args) {
        Pegawai1841720207Bayu masinis = new Pegawai1841720207Bayu("1234", "Spongebob Squarepants");
        Pegawai1841720207Bayu asisten = new Pegawai1841720207Bayu("4567", "Patrick Star");
        KeretaApi1841720207Bayu keretaApi = new KeretaApi1841720207Bayu("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.infoBayu());
    }
}
