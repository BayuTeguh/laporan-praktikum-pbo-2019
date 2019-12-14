package backend;

import java.util.ArrayList;
import java.sql.*;

public class Buku1841720207Bayu {
    private int mIdbuku;
    private Kategory1841720207Bayu mKategori = new Kategory1841720207Bayu();
    private String mJudul, mPenerbit, mPenulis;
    
    public Buku1841720207Bayu(){
        
    }
    
    public Buku1841720207Bayu(Kategory1841720207Bayu mKategori, String mJudul, String mPenerbit, String mPenulis){
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getmIdbukuBayu() {
        return mIdbuku;
    }

    public void setmIdbukuBayu(int idbuku) {
        this.mIdbuku = idbuku;
    }
    
    public void setmKategoriBayu(Kategory1841720207Bayu kategori){
        this.mKategori = kategori;
    }
    
    public Kategory1841720207Bayu getmKategoriBayu(){
        return mKategori;
    }

    public String getmJudulBayu() {
        return mJudul;
    }

    public void setmJudulBayu(String judul) {
        this.mJudul = judul;
    }

    public String getmPenerbitBayu() {
        return mPenerbit;
    }

    public void setmPenerbitBayu(String penerbit) {
        this.mPenerbit = penerbit;
    }

    public String getmPenulisBayu() {
        return mPenulis;
    }

    public void setmPenulisBayu(String penulis) {
        this.mPenulis = penulis;
    }

    public Buku1841720207Bayu getmByIdBayu(int id){
        Buku1841720207Bayu buku = new Buku1841720207Bayu();
     
        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategory AS idkategory, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategory k ON b.idkategory = k.idkategory "
                                        + "     WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {                
                buku = new Buku1841720207Bayu();
                buku.setmIdbukuBayu(rs.getInt("idbuku"));
                buku.getmKategoriBayu().setmIdKategoriBayu(rs.getInt("idkategory"));
                buku.getmKategoriBayu().setmNamaBayu(rs.getString("nama"));
                buku.getmKategoriBayu().setmKeteranganBayu(rs.getString("keterangan"));
                buku.setmJudulBayu(rs.getString("judul"));
                buku.setmPenerbitBayu(rs.getString("penerbit"));
                buku.setmPenulisBayu(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return buku;
    }
    
    public ArrayList<Buku1841720207Bayu> getAllBayu(){
        ArrayList<Buku1841720207Bayu> ListBuku = new ArrayList();
        
        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategory AS idkategory, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategory k ON b.idkategory = k.idkategory ");
        
        try {
            while (rs.next()) {                
                Buku1841720207Bayu buku = new Buku1841720207Bayu();
                buku.setmIdbukuBayu(rs.getInt("idbuku"));
                buku.getmKategoriBayu().setmIdKategoriBayu(rs.getInt("idkategory"));
                buku.getmKategoriBayu().setmNamaBayu(rs.getString("nama"));
                buku.getmKategoriBayu().setmKeteranganBayu(rs.getString("keterangan"));
                buku.setmJudulBayu(rs.getString("judul"));
                buku.setmPenerbitBayu(rs.getString("penerbit"));
                buku.setmPenulisBayu(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720207Bayu> searchBayu(String keyword){
        
        ArrayList<Buku1841720207Bayu> ListBuku = new ArrayList();
        

        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategory AS idkategory, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategory k ON b.idkategory = k.idkategory "
                                        + "     WHERE b.judul LIKE '%" + keyword + "%' "
                                        + "     OR b.penerbit LIKE '%" + keyword + "%' "
                                        + "     OR b.penulis LIKE '%" + keyword + "%' ");
        
        try {
            while (rs.next()) {                
                Buku1841720207Bayu buku = new Buku1841720207Bayu();
                buku.setmIdbukuBayu(rs.getInt("idbuku"));
                buku.getmKategoriBayu().setmIdKategoriBayu(rs.getInt("idkategory"));
                buku.getmKategoriBayu().setmNamaBayu(rs.getString("nama"));
                buku.getmKategoriBayu().setmKeteranganBayu(rs.getString("keterangan"));
                buku.setmJudulBayu(rs.getString("judul"));
                buku.setmPenerbitBayu(rs.getString("penerbit"));
                buku.setmPenulisBayu(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    
    public void saveBayu(){
        if (getmByIdBayu(mIdbuku).getmIdbukuBayu()== 0) {
            
            String SQL = "INSERT INTO buku (judul, idkategory, penulis, penerbit) VALUES("
                    + "     '" + this.mJudul + "', "
                    + "     '" + this.getmKategoriBayu().getmIdKategoriBayu()+ "', "
                    + "     '" + this.mPenulis + "', "
                    + "     '" + this.mPenerbit + "' "
                    + "     )";
            this.mIdbuku = DBHelper1841720207Bayu.insertQueryGetIdBayu(SQL);
        } else {
            Kategory1841720207Bayu kategori = new Kategory1841720207Bayu();
            
            String SQL = "UPDATE buku SET "
                    + "     judul='" + this.mJudul + "', "
                    + "     idkategory='" + this.getmKategoriBayu().getmIdKategoriBayu() + "', "
                    + "     penulis='" + this.mPenulis + "', "
                    + "     penerbit='" + this.mPenerbit +"' "
                    + "     WHERE idbuku = '" + this.mIdbuku +"'";
            DBHelper1841720207Bayu.executeQueryBayu(SQL);
        }
    }
    
    public void deleteBayu(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720207Bayu.executeQueryBayu(SQL);
    }
}
