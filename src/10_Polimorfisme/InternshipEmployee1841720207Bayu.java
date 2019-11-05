package Polimorfisme;

public class InternshipEmployee1841720207Bayu extends Employee1841720207Bayu{
    private int mLength;

    public InternshipEmployee1841720207Bayu(String name, int length) {
        this.name = name;
        this.mLength = length;
    }

    public int getLengthBayu() {
        return mLength;
    }

    public void setLengthBayu(int length) {
        this.mLength = length;
    }

    @Override
    public String getEmployeeInfoBayu() {
        String info = super.getEmployeeInfoBayu()+"\n";
        info += "Registered as intership employee for "+mLength+" month/s\n";
        return info;
    }
}
