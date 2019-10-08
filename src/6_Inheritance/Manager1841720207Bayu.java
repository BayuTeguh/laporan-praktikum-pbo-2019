
package inharitance;

public class Manager1841720207Bayu extends Karyawan1841720207Bayu{
    public int tunjangan;

    public Manager1841720207Bayu() {
    }
    
    public void tampilDataManagerBayu(){
        super.tampilDataKaryawanBayu();
        System.out.println("Tunjangan      ="+tunjangan);
        System.out.println("Total gaji     ="+(super.gaji+tunjangan));
    }
}
