package AbstractandInterface;

public class Program1841720207Bayu {
    public static void main(String[] args) {
        Kucing1841720207Bayu kucingKampung = new Kucing1841720207Bayu();
        Ikan1841720207Bayu lumbaLumba = new Ikan1841720207Bayu();
        
        Orang1841720207Bayu ani = new Orang1841720207Bayu("Ani");
        Orang1841720207Bayu budi = new Orang1841720207Bayu("Budi");
        
        ani.peliharaHewanBayu(kucingKampung);
        budi.peliharaHewanBayu(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalanBayu();
        budi.ajakPeliharaanJalanJalanBayu();
    }
}
