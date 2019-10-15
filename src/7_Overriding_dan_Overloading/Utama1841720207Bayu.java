package OverloadOverride;

public class Utama1841720207Bayu {
    public static void main(String[] args) {
        
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720207Bayu man[] = new Manager1841720207Bayu[2];
        Staff1841720207Bayu staff1[] = new Staff1841720207Bayu[2];
        Staff1841720207Bayu staff2[] = new Staff1841720207Bayu[3];
        
        //pembuatan Manager
        
        man[0] = new Manager1841720207Bayu();
        man[0].setmNamaBayu("Tedjo");
        man[0].setmNipBayu("101");
        man[0].setmGolonganBayu("1");
        man[0].setmTunjangan(5000000);
        man[0].setmBagian("Administrasi");
        
        man[1] = new Manager1841720207Bayu();
        man[1].setmNamaBayu("Atika");
        man[1].setmNipBayu("102");
        man[1].setmGolonganBayu("2");
        man[1].setmTunjangan(2500000);
        man[1].setmBagian("Pemasaran");
        
        staff1[0] = new Staff1841720207Bayu();
        staff1[0].setmNamaBayu("Usman");
        staff1[0].setmNipBayu("0003");
        staff1[0].setmGolonganBayu("2");
        staff1[0].setMlemburBayu(10);
        staff1[0].setmGajiLemburBayu(10000);
        
        staff1[1] = new Staff1841720207Bayu();
        staff1[1].setmNamaBayu("Anugrah");
        staff1[1].setmNipBayu("0005");
        staff1[1].setmGolonganBayu("2");
        staff1[1].setMlemburBayu(10);
        staff1[1].setmGajiLemburBayu(55000);
        man[0].setSt(staff1);
        
        staff2[0] = new Staff1841720207Bayu();
        staff2[0].setmNamaBayu("Hendra");
        staff2[0].setmNipBayu("0004");
        staff2[0].setmGolonganBayu("3");
        staff2[0].setMlemburBayu(15);
        staff2[0].setmGajiLemburBayu(55000);
        
        staff2[1] = new Staff1841720207Bayu();
        staff2[1].setmNamaBayu("Arie");
        staff2[1].setmNipBayu("0006");
        staff2[1].setmGolonganBayu("4");
        staff2[1].setMlemburBayu(5);
        staff2[1].setmGajiLemburBayu(100000);
       
        staff2[2] = new Staff1841720207Bayu();
        staff2[2].setmNamaBayu("Mentari");
        staff2[2].setmNipBayu("0007");
        staff2[2].setmGolonganBayu("3");
        staff2[2].setMlemburBayu(6);
        staff2[2].setmGajiLemburBayu(20000);
        man[1].setSt(staff2);
        
        man[0].lihatInfoBayu();
        man[1].lihatInfoBayu();
    }
}
