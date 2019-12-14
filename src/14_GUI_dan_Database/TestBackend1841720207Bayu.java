package frontend;
    
import backend.*;
public class TestBackend1841720207Bayu {
    public static void main(String[] args) {
        Kategory1841720207Bayu kat1 = new Kategory1841720207Bayu("Novel", "Koleksi buku novel");         
        Kategory1841720207Bayu kat2 = new Kategory1841720207Bayu("Referensi", "Buku referensi ilmiah");         
        Kategory1841720207Bayu kat3 = new Kategory1841720207Bayu("Komik", "Komik anak-anak");
        
         // test insert         
         kat1.saveBayu();
         kat2.saveBayu();
         kat3.saveBayu();
         
         //test update
         kat2.setmKeteranganBayu("Koleksi buku referensi ilmiah");         
         kat2.saveBayu();
         
          // test delete         
          kat3.deleteBayu();
          
          // test select all         
          for(Kategory1841720207Bayu k : new Kategory1841720207Bayu().getAllBayu()){             
              System.out.println("Nama: " + k.getmNamaBayu()+ ", Ket: " + k.getmKeteranganBayu());         
          }   
          
          // test search         
          for(Kategory1841720207Bayu k : new Kategory1841720207Bayu().searchBayu("ilmiah")){             
              System.out.println("Nama: " + k.getmNamaBayu()+ ", Ket: " + k.getmKeteranganBayu());         
          } 
    }
}
