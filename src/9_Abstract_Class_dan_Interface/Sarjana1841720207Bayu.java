package AbstractandInterface;

public class Sarjana1841720207Bayu extends Mahasiswa1841720207Bayu implements ICumlaude1841720207Bayu, IBerprestasi1841720207Bayu{

    public Sarjana1841720207Bayu(String nama) {
        super(nama);
    }

    @Override
    public void lulusBayu() {
        super.kuliahDiKampusBayu();
        System.out.println("Aku sudah menyelesaikan SKRIPSI"); 
    }

    @Override
    public void meraihIPKTinggiBayu() {
        System.out.println("IPK-ku lebih dari 3,51");
        
    
    }

    @Override
    public void menjuaraiKompetisiBayu() {
        System.out.println("Saya telah menjuarai kompetisi NATIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahBayu() {
        System.out.println("Saya menerbitkan artikel di jurnal NATIONAL"); 
    }
}
