
package motorencapsulation;

public class Motor1841720207Bayu {
    private int mKecepatan = 0;
    private boolean mKontak0n = false;
    
    public void nyalakanMesinBayu(){
        mKontak0n = true;
    }
    public void matikanMesinBayu(){
        mKontak0n = false;
        mKecepatan = 0;
    }
    public void tambahKecepatanBayu(){
        if(mKontak0n == true){
            mKecepatan += 5;
        }else{
            System.out.println("kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }
    public void maxKecepatanBayu(){
        if(mKecepatan <= 100 && mKontak0n == true){
            System.out.println("Masih dalam batas kecepatan");
        }else{
            System.out.println("Melebihi kecepatan maximal");
            System.out.println("Kecepatan maximal adalah 100");
        }
    }
    public void kurangiKecepatanBayu(){
        if(mKontak0n == true){
            mKecepatan -= 5;
        }else{
            System.out.println("kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
    public void printStatusBayu(){
        if(mKontak0n == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ mKecepatan +"\n");
    }
}
