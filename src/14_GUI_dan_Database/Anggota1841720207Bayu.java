package backend;
import java.util.ArrayList;
import java.sql.*;


public class Anggota1841720207Bayu {
    private int mIdanggota;
    private String mNama, mAlamat, mTelepon;
    
    public Anggota1841720207Bayu(){
        
    }
    
    public Anggota1841720207Bayu(String nama, String alamat, String telepon){
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mTelepon = telepon;
    }

    public int getmIdanggotaBayu() {
        return mIdanggota;
    }

    public void setmIdanggotaBayu(int idanggota) {
        this.mIdanggota = idanggota;
    }

    public String getmNamaBayu() {
        return mNama;
    }

    public void setmNamaBayu(String nama) {
        this.mNama = nama;
    }

    public String getmAlamatBayu() {
        return mAlamat;
    }

    public void setmAlamatBayu(String alamat) {
        this.mAlamat = alamat;
    }

    public String getmTeleponBayu() {
        return mTelepon;
    }

    public void setmTeleponBayu(String telepon) {
        this.mTelepon = telepon;
    }
    
    public Anggota1841720207Bayu getByIdBayu(int id){
        Anggota1841720207Bayu anggota = new Anggota1841720207Bayu();
        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu("SELECT * FROM anggota "
                                            + " WHERE idanggota = '" + id + "'");
        
        try {
            while (rs.next()) {                
                anggota = new Anggota1841720207Bayu();
                anggota.setmIdanggotaBayu(rs.getInt("idanggota"));
                anggota.setmNamaBayu(rs.getString("nama"));
                anggota.setmAlamatBayu(rs.getString("alamat"));
                anggota.setmTeleponBayu(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return anggota;
    }
    
    public ArrayList<Anggota1841720207Bayu> getAllBayu(){
        ArrayList<Anggota1841720207Bayu> ListAnggota = new ArrayList();
        
        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu("SELECT * FROM anggota");
        
        try {
            while (rs.next()) {                
                Anggota1841720207Bayu anggota = new Anggota1841720207Bayu();
                anggota.setmIdanggotaBayu(rs.getInt("idanggota"));
                anggota.setmNamaBayu(rs.getString("nama"));
                anggota.setmAlamatBayu(rs.getString("alamat"));
                anggota.setmTeleponBayu(rs.getString("telepon"));
                
                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public ArrayList<Anggota1841720207Bayu> searchBayu(String keyword){
        
        ArrayList<Anggota1841720207Bayu> ListAnggota = new ArrayList();
        
        String sql = "SELECT * FROM anggota WHERE "
                    + "    nama LIKE '%" + keyword + "%' "
                    + "    OR alamat LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720207Bayu.selectQueryBayu(sql);
        
        try {
            while (rs.next()) {                
                Anggota1841720207Bayu anggota = new Anggota1841720207Bayu();
                anggota.setmIdanggotaBayu(rs.getInt("idanggota"));
                anggota.setmNamaBayu(rs.getString("nama"));
                anggota.setmAlamatBayu(rs.getString("alamat"));
                anggota.setmTeleponBayu(rs.getString("telepon"));
                
                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
    public void saveBayu(){
        if (getByIdBayu(mIdanggota).getmIdanggotaBayu()== 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + "     '" + this.mNama + "', "
                    + "     '" + this.mAlamat + "', "
                    + "     '" + this.mTelepon + "' "
                    + "     )";
            this.mIdanggota = DBHelper1841720207Bayu.insertQueryGetIdBayu(SQL);
        } else {
            String SQL = "UPDATE anggota SET idanggota = '"+ this.mIdanggota +"', "
                    + "     nama='" + this.mNama + "', "
                    + "     alamat='" + this.mAlamat + "', "
                    + "     telepon='" + this.mTelepon +"' "
                    + "     WHERE idanggota = '" + this.mIdanggota +"'";
            
            DBHelper1841720207Bayu.executeQueryBayu(SQL);
        }
    }
    
    public void deleteBayu(){
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720207Bayu.executeQueryBayu(SQL);
    }
}
