
package bayu.relasiclass.percobaan1;

public class Kursi1841720207Bayu {
    private String mNomer;
    private Penumpang1841720207Bayu mPenumpang;

    public Kursi1841720207Bayu(String mNomer) {
        this.mNomer = mNomer;
    }

    public String getmNomer() {
        return mNomer;
    }

    public void setmNomer(String mNomer) {
        this.mNomer = mNomer;
    }

    public Penumpang1841720207Bayu getmPenumpang() {
        return mPenumpang;
    }

    public void setmPenumpang(Penumpang1841720207Bayu mPenumpang) {
        this.mPenumpang = mPenumpang;
    }
    
    public String infoBayu(){
        String info = "";
        info += "Nomor: "+mNomer+"\n";
        if (this.mPenumpang != null){
            info += "Penumpang: "+"\n"+mPenumpang.infoBayu() + "\n";
            System.out.println("Sudah ada penumpang di kursi no: "+mNomer+" tidak boleh di tempati orang "
                    + "lain"+"\n"+mPenumpang.infoBayu());
        }
        return info;
    }
}
