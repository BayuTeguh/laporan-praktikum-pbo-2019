
package Mahasiswa;

public class Barangg1841720207Bayu {
    public String mNamaBrg;
    public String mJenisBrg;
    public int mStock;
    
    public void tampilBarangBayu(){
        System.out.println("Nama Barang  : "+mNamaBrg);
        System.out.println("Jenis Barang : "+mJenisBrg);
        System.out.println("Stock        : "+mStock);
    }
    
    public int tambahStockBayu(int barangMasuk){
    int stockBaru=barangMasuk+mStock;
    return stockBaru;
    }
}
