package frontend;

import backend.*;

public class TestBackendBuku1841720207Bayu {
   public static void main(String[] args) {
        Kategory1841720207Bayu novel = new Kategory1841720207Bayu().getByIdBayu(74);
        Kategory1841720207Bayu referensi = new Kategory1841720207Bayu().getByIdBayu(75);
       
        Buku1841720207Bayu buku1 = new Buku1841720207Bayu(novel, "Timun Mas", "Bang Supil", "Elex Media");
        Buku1841720207Bayu buku2 = new Buku1841720207Bayu(referensi, "Aljabar Linier", "Alex Baldwin", "Springer");
        Buku1841720207Bayu buku3 = new Buku1841720207Bayu(novel, "The Sphere", "Michael", "Wyane Publis");
        
        //test insert
        buku1.saveBayu();
        buku2.saveBayu();
        buku3.saveBayu();
        
        //test update
        buku2.setmJudulBayu("Aljabar Linier");
        buku2.saveBayu();
        
        //test delete
        buku3.deleteBayu();
        
        //test select all
        for (Buku1841720207Bayu buku : new Buku1841720207Bayu().getAllBayu()) {
            System.out.println("Kategori: " + buku.getmKategoriBayu().getmNamaBayu()+ ", Judul: " 
                    + buku.getmJudulBayu());
        }
        
        //test search
        for (Buku1841720207Bayu buku : new Buku1841720207Bayu().searchBayu("timun")) {
            System.out.println("Kategori: " + buku.getmKategoriBayu().getmNamaBayu()+ ", Judul: " 
                    + buku.getmJudulBayu());
        }
    }   
}
