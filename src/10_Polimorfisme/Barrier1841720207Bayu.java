package Polimorfisme;

public class Barrier1841720207Bayu implements IDestroyable1841720207Bayu{
    private int mStength;

    public Barrier1841720207Bayu(int mStength) {
        this.mStength = mStength;
    }

    public void setmStengthBayu(int mStength) {
        this.mStength = mStength;
    }

    public int getmStengthBayu() {
        return mStength;
    }
    
    @Override
    public void destroyedBayu() {
        mStength -= 9;
    }

    public String getBarrierInfoBayu(){
        return "Barrier Strength = "+mStength+"\n";
    }
}
