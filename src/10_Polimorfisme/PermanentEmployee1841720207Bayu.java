package Polimorfisme;

public class PermanentEmployee1841720207Bayu extends Employee1841720207Bayu implements Payable1841720207Bayu{
    private int mSalary;

    public PermanentEmployee1841720207Bayu(String name, int mSalary) {
        this.name = name;
        this.mSalary = mSalary;
    }

    public int getmSalaryBayu() {
        return mSalary;
    }

    public void setmSalaryBayu(int mSalary) {
        this.mSalary = mSalary;
    }
    
    @Override
    public int getPaymentAmountBayu() {
        return(int)(mSalary+0.05*mSalary);
    }

    @Override
    public String getEmployeeInfoBayu() {
        String info = /*"Total payment = "+getPaymentAmountBayu()+"\n"+*/super.getEmployeeInfoBayu()+"\n";
        info += "Registered permanenet employee with salary "+mSalary+"\n";
        return info;
    }
}
