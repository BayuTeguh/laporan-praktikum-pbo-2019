package OverloadOverride;

public class Segitiga1841720207Bayu {
    private int mSudut;
    
    
    public int totalSudutBayu(int sudutA){
       return mSudut = 180-sudutA;
    }
    
    public int totalSudutBayu(int sudutA, int sudutB){
       return mSudut = 180-(sudutA+sudutB);
    }
    
    public int kelilingBayu(int sisiA, int sisiB, int sisiC){
       int keliling = sisiA + sisiB + sisiC;
       return keliling;
    }
    
    public double kelilingBayu(int sisiA, int sisiB){
       return Math.sqrt(sisiA*sisiA)+ Math.sqrt(sisiB*sisiB);
    }
}
