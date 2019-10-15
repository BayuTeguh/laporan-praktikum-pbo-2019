package OverloadOverride;

public class Staff1841720207Bayu extends Karyawan1841720207Bayu{
    private int mLembur;
    private double mGajiLembur;

    public int getMlemburBayu() {
        return mLembur;
    }

    public void setMlemburBayu(int mlembur) {
        this.mLembur = mlembur;
    }

    public double getmGajiLemburBayu() {
        return mGajiLembur;
    }

    public void setmGajiLemburBayu(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }
    
    public double getGajiBayu(int mLembur, double mGajiLembur){
        return super.getmGajiBayu()+mLembur*mGajiLembur;
    }

    @Override
    public double getmGajiBayu() {
        return super.getmGajiBayu()+mLembur*mGajiLembur; //To change body of generated methods, choose Tools | Templates.
    }
    
    
     
    public void lihatInfoBayu(){
        System.out.println("Nip: "+this.getmNipBayu());
        System.out.println("Nama: "+this.getmNamaBayu());
        System.out.println("Golongan: "+this.getmGolonganBayu());
        System.out.println("Jumlah Lembur: "+this.getMlemburBayu());
        System.out.printf("Gaji Lembur:%.0f\n", this.getmGajiLemburBayu());
        System.out.printf("Gaji:%.0f\n", this.getmGajiBayu());
        System.out.println(" ");
    }
}
