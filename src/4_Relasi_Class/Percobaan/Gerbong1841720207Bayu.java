
package bayu.relasiclass.percobaan1;

public class Gerbong1841720207Bayu {
    private String mKode;
    private Kursi1841720207Bayu[] mArrayKursi;

    public Gerbong1841720207Bayu(String mKode, int jumlah) {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1841720207Bayu[jumlah];
        this.initKursiBayu();
    }
    
    private void initKursiBayu(){
       for(int i=0; i<mArrayKursi.length;i++){
           this.mArrayKursi[i] = new Kursi1841720207Bayu(String.valueOf(i+1));
       }
    }

    public String getmKode() {
        return mKode;
    }

    public void setmKode(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720207Bayu[] getmArrayKursi() {
        return mArrayKursi;
    }

    public void setmArrayKursi(Kursi1841720207Bayu[] mArrayKursi) {
        this.mArrayKursi = mArrayKursi;
    }
    
    public String infoBayu(){
        String info = "";
        info += "Kode: "+mKode+"\n";
        for(Kursi1841720207Bayu kursi : mArrayKursi){
            info += kursi.infoBayu();
        }
        return info;
    }
    public void setPenumpangBayu(Penumpang1841720207Bayu penumpang, int nomor){
        this.mArrayKursi[nomor +1].setmPenumpang(penumpang);
    }
}
