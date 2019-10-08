package inharitance;

public class StaffHarian1841720207Bayu extends Staff1841720207Bayu{
    public int jmlJamKerja;

    public StaffHarian1841720207Bayu() {
    }

    public StaffHarian1841720207Bayu(String nama, String alamat, String jk, int umur, 
            int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }

     public void tampilStaffHarianBayu(){
        System.out.println("=============Data Staff Harian=============");
        super.tampilDataStaff();
        System.out.println("Golongan         ="+jmlJamKerja);
        System.out.println("Gaji Bersih      ="+(gaji+jmlJamKerja+lembur-potongan));
    }
}
