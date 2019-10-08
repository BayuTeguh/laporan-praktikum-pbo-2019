
package inharitance;

public class Staff1841720207Bayu extends Karyawan1841720207Bayu{
    public int lembur, potongan;

    public Staff1841720207Bayu() {
    }

    public Staff1841720207Bayu(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaff(){
        super.tampilDataKaryawanBayu();
        System.out.println("Lebur        ="+lembur);
        System.out.println("Potongan     ="+potongan);
        System.out.println("Total gaji   ="+(gaji+lembur-potongan));
    }
}
