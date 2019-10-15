package OverloadOverride;

public class Manager1841720207Bayu extends Karyawan1841720207Bayu{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720207Bayu st[];

    public double getmTunjangan() {
        return mTunjangan;
    }

    public void setmTunjangan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagian() {
        return mBagian;
    }

    public void setmBagian(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setSt(Staff1841720207Bayu[] st) {
        this.st = st;
    }
    
    public void viewStaff(){
        System.out.println("----------------");
        for(int i=0;i<st.length;i++){
            st[i].lihatInfoBayu();
        }
        System.out.println("----------------");
    }
    
    public void lihatInfoBayu(){
        System.out.println("Manager: "+this.getmBagian());
        System.out.println("Nip: "+this.getmNipBayu());
        System.out.println("Nama: "+this.getmNamaBayu());
        System.out.println("Golongan: "+this.getmGolonganBayu());
        System.out.printf("Tunjangan:%.0f\n", this.getmTunjangan());
        System.out.printf("Gaji:%.0f\n", this.getmGajiBayu());
        System.out.println("Bagian: "+this.getmBagian());
        this.viewStaff();
    }
    
    public double getGaji(){
        return super.getmGajiBayu()+mTunjangan;
    }
}
