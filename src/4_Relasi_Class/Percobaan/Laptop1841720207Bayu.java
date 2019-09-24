
package bayu.relasiclass.percobaan1;

public class Laptop1841720207Bayu {
    private String mMerk;
    private Processor1841720207Bayu mProc;

    Laptop1841720207Bayu() {
    }

    public Laptop1841720207Bayu(String mMerk, Processor1841720207Bayu proc) {
        this.mMerk = mMerk;
        this.mProc = proc;
    }
     public String getMerkBayu(){
       return mMerk;
   }
   public void setMerkBayu(String merk){
       mMerk = merk;
   }
   public Processor1841720207Bayu getProcBayu(){
       return mProc;
   }
   public void setProcBayu(Processor1841720207Bayu proc){
       mProc = proc;
   }
   public void infoBayu(){
       System.out.println("Merk Laptop = "+mMerk);
       mProc.infoBayu();
   } 
}
