package AbstractandInterface;

public class Rektor1841720207Bayu{
    
    public void beriSertifikatCumlaudeBayu(ICumlaude1841720207Bayu mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana anda bisa cumlaude?");
       
        mahasiswa.lulusBayu();
        mahasiswa.meraihIPKTinggiBayu();
        
        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapresBayu(IBerprestasi1841720207Bayu mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat Mawapres.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
       
        mahasiswa.menjuaraiKompetisiBayu();
        mahasiswa.membuatPublikasiIlmiahBayu();
        
        System.out.println("--------------------------------------------");
    }
}
