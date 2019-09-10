
package Mahasiswa;

public class TestMahasiswa1841720207Bayu {
    public static void main(String[] args) {
        Mahasiswa1841720207Bayu mhs1 = new Mahasiswa1841720207Bayu();
        Mahasiswa1841720207Bayu mhs2 = new Mahasiswa1841720207Bayu();
        mhs1.mNim=12727;
        mhs1.mNama="Terserah";
        mhs1.mAlamat="Jl. Gajelas No Entah";
        mhs1.mKelas="A";
        mhs1.tampilBiodataBayu();
        
        System.out.println();
        
        mhs2.mNim=12222;
        mhs2.mNama="Aji";
        mhs2.mAlamat="Jl. Asmat";
        mhs2.mKelas="B";
        mhs2.tampilBiodataBayu();
        
        System.out.println();
        
        mhs2.mNim=12223;
        mhs2.mNama="Reza";
        mhs2.mAlamat="Jl. Kayu";
        mhs2.mKelas="C";
        mhs2.tampilBiodataBayu();
    }
}
