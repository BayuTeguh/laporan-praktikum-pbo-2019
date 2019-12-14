package backend;

import java.util.ArrayList;
import java.sql.*;
public class Kategory1841720207Bayu {
    private int idkategory;
    private String mNama, mKeterangan;

    public Kategory1841720207Bayu() {
    }

    public Kategory1841720207Bayu(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }
    
    public int getmIdKategoriBayu() {
        return idkategory;
    }

    public void setmIdKategoriBayu(int mIdKategori) {
        this.idkategory = mIdKategori;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeteranganBayu() {
        return mKeterangan;
    }

    public void setmKeteranganBayu(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }
    
    public Kategory1841720207Bayu getByIdBayu(int id){
        Kategory1841720207Bayu kat = new Kategory1841720207Bayu();
        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu("SELECT * FROM kategory "
                                                              + " WHERE idkategory = '" + id + "'");
        
        try{
            while(rs.next()){
                kat = new Kategory1841720207Bayu();
                kat.setmIdKategoriBayu(rs.getInt("idkategory"));
                kat.setmNamaBayu(rs.getString("nama"));
                kat.setmKeteranganBayu(rs.getString("keterangan"));
            }
        }catch(Exception e){
            e.printStackTrace();
            //e.getMessage();
        }
        return kat;
    }
    public ArrayList<Kategory1841720207Bayu> getAllBayu(){
        ArrayList<Kategory1841720207Bayu> ListKategori1841720207Bayu = new ArrayList();
        
        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu("SELECT * FROM kategory");
        
        try{
            while(rs.next()){
                Kategory1841720207Bayu kat = new Kategory1841720207Bayu();
                kat.setmIdKategoriBayu(rs.getInt("idkategory"));
                kat.setmNamaBayu(rs.getString("nama"));
                kat.setmKeteranganBayu(rs.getString("keterangan"));
                
                ListKategori1841720207Bayu.add(kat);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error membuat koneksi" + e.getMessage());
        }
        return ListKategori1841720207Bayu;
    }
   
    public ArrayList<Kategory1841720207Bayu> searchBayu(String keyword){
         ArrayList<Kategory1841720207Bayu> ListKategori1841720207Bayu = new ArrayList();
         
         String sql = "SELECT * FROM kategory WHERE "
                     +"      nama LIKE '%"+ keyword + "%' "
                     +"      OR keterangan LIKE '%" + keyword +"%' ";
         
         ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu(sql);
         
         try{
             while(rs.next()){
                Kategory1841720207Bayu kat = new Kategory1841720207Bayu();
                kat.setmIdKategoriBayu(rs.getInt("idkategory"));
                kat.setmNamaBayu(rs.getString("nama"));
                kat.setmKeteranganBayu(rs.getString("keterangan"));
                
                ListKategori1841720207Bayu.add(kat);
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return ListKategori1841720207Bayu;
    }
    
    public void saveBayu(){
        if(getByIdBayu(idkategory).getmIdKategoriBayu() == 0){
            String SQL = "INSERT INTO kategory (nama, keterangan) VALUES("
                    +"       '"+this.mNama+"', "
                    +"       '"+this.mKeterangan+"' "
                    +"      )";
            this.idkategory = DBHelper1841720207Bayu.insertQueryGetIdBayu(SQL);
        }
        else{
            String SQL = "UPDATE kategory SET "
                    +"       nama = '"+this.mNama+"', "
                    +"       keterangan = '"+this.mKeterangan+"' "
                    +"       WHERE idkategory = "+this.idkategory+"";
            DBHelper1841720207Bayu.executeQueryBayu(SQL);
        }
    }
    
    public void deleteBayu(){
        String SQL = "DELETE FROM kategory WHERE idkategory = '"+this.idkategory+"'";
        DBHelper1841720207Bayu.executeQueryBayu(SQL);
    }
}
