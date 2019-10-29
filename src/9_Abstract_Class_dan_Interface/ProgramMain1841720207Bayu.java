package AbstractandInterface;

public class ProgramMain1841720207Bayu {
    public static void main(String[] args) {
        Rektor1841720207Bayu pakRektor = new Rektor1841720207Bayu();
        
        //Mahasiswa1841720207Bayu mahasiswaBiasa = new Mahasiswa1841720207Bayu("Charlie");
        Sarjana1841720207Bayu sarjanaCumlaude = new Sarjana1841720207Bayu("Dini");
        PascaSarjana1841720207Bayu masterCumlaude = new PascaSarjana1841720207Bayu("Elok");
        
        //pakRektor.beriSertifikatCumlaudeBayu(mahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaudeBayu(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaudeBayu(masterCumlaude);
        
        pakRektor.beriSertifikatMawapresBayu(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresBayu(masterCumlaude);
    }
}
