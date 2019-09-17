
package TugasEnkapsulasi;

public class EncapDemo1841720207Bayu {
    private String mName;
    private int mAge;
    
    public String getNameBayu(){
        return mName;
    }
    
    public void setNameBayu(String newName){
        mName = newName;
    }
    
    public int getAgeBayu(){
        return mAge;
    }
    
    public void setAgeBayu(int newAge){
        if(newAge >= 18 && newAge <= 30){
            mAge = newAge;
        }else if(newAge < 18){
            System.out.println("Umur kurang dari yang ditentukan");
        }else{
            System.out.println("Umur lebih dari yang ditentukan");
        }
    }
}
