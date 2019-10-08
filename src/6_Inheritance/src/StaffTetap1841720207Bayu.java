package inharitance;

public class StaffTetap1841720207Bayu extends Staff1841720207Bayu{
    public String golongan;
    public int asuransi;

    public StaffTetap1841720207Bayu() {
    }

    public StaffTetap1841720207Bayu(String nama, String alamat, String jk, int umur,
            int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super( lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetapBayu(){
        System.out.println("=============Data Staff Tetap=============");
        super.tampilDataStaff();
        System.out.println("Golongan         ="+golongan);
        System.out.println("Jumlah Asuransi  ="+asuransi);
        System.out.println("Gaji Bersih      ="+(gaji+lembur-potongan-asuransi));
    }
}
