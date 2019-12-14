package frontend;

import backend.*;

public class TestBackendAnggota1841720207Bayu {
    public static void main(String[] args) {
        
        Anggota1841720207Bayu angg1 = new Anggota1841720207Bayu("A. Najiyullah", "Jl. Mawar", "081234556723");
        Anggota1841720207Bayu angg2 = new Anggota1841720207Bayu("M.Yusril", "Jl Melati", "085678990009");
        Anggota1841720207Bayu angg3 = new Anggota1841720207Bayu("Tejo", "Jl Batu", "085312331212");
        
        //test insert
        angg1.saveBayu();
        angg2.saveBayu();
        angg3.saveBayu();
        
        //test update
        angg2.setmAlamatBayu("Jl Melati");
        angg2.saveBayu();
        
        //test delete
        angg3.deleteBayu();
        
        //test select all
        for (Anggota1841720207Bayu anggota : new Anggota1841720207Bayu().getAllBayu()) {
            System.out.println("Nama: " + anggota.getmNamaBayu()+ ", Ket: " + anggota.getmAlamatBayu());
        }
        
        //test search
        for (Anggota1841720207Bayu anggota : new Anggota1841720207Bayu().searchBayu("JL Alpukat")) {
            System.out.println("Nama: " + anggota.getmNamaBayu()+ ", Ket: " + anggota.getmAlamatBayu());
        }
    }
    
}
