
package bayu.relasiclass.percobaan1;

public class Processor1841720207Bayu {
    private String mMerk;
    private double mCache;

    Processor1841720207Bayu() {
        
    }

    public Processor1841720207Bayu(String merk, double cache) {
        this.mMerk = merk;
        this.mCache = cache;
    }
    public String getMerkBayu(){
        return mMerk;
    }
    public void setMerkBayu(String merk){
        mMerk = merk;
    }
    public double getChacheBayu(){
        return mCache;
    }
    public void setChacheBayu(double cache){
        mCache = cache;
    }
    public void infoBayu(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache memory = %.2f\n",mCache);
    }
}
