
package koperasigettersetter;

public class KoperasiDemo1841720207Bayu {
    public static void main(String[] args) {
        Anggota1841720207Bayu anggota1 = new Anggota1841720207Bayu("Iwan", "Jalan mawar");
        System.out.println("Simpanan "+anggota1.getNamaBayu()+" : Rp "+anggota1.getSimpanBayu());
        
        anggota1.setNamaBayu("Iwan Setiawan");
        anggota1.setAlamatBayu("Jalan Soekarno Hatta no 10");
        anggota1.setorBayu(100000);
        System.out.println("Simpanan "+anggota1.getNamaBayu()+" : Rp "+anggota1.getSimpanBayu());
        
        anggota1.pinjamBayu(5000);
        System.out.println("Simpanan " +anggota1.getNamaBayu()+" : Rp "+ anggota1.getSimpanBayu());
    }
}
