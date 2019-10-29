package AbstractandInterface;

public class Orang1841720207Bayu{
    private String mNama;
    private Hewan1841720207Bayu hewanPeliharaan;

    public Orang1841720207Bayu(String mNama) {
        this.mNama = mNama;
    }
    
    public void peliharaHewanBayu(Hewan1841720207Bayu hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanBayu(){
        System.out.println("Namaku "+this.mNama);
        System.out.println("Hewan peliharaan Berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakBayu();
        System.out.println("----------------------------------------");
    }
}
