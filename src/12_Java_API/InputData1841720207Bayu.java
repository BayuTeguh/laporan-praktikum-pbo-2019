package bayu.percobaanAPI;

import java.util.ArrayList;
public class InputData1841720207Bayu {
    ArrayList<Mahsiswa1841720207Bayu>ListMahasiswa;

    public InputData1841720207Bayu() {
        ListMahasiswa = new ArrayList();
    }
   public void isiDataBayu(String mNim, String mNama, String mAlamat){
       Mahsiswa1841720207Bayu msh = new Mahsiswa1841720207Bayu(mNim, mNama, mAlamat);
       ListMahasiswa.add(msh);
   }
   public  ArrayList<Mahsiswa1841720207Bayu> getDataBayu(){
       return ListMahasiswa;
   }
}
