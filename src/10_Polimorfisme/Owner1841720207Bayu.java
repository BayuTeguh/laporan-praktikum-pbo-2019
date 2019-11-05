package Polimorfisme;

public class Owner1841720207Bayu {
    
    public void payBayu(Payable1841720207Bayu p){
        if(p instanceof ElectricityBill1841720207Bayu){
            ElectricityBill1841720207Bayu eb = (ElectricityBill1841720207Bayu) p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanentEmployee1841720207Bayu){
            PermanentEmployee1841720207Bayu pe = (PermanentEmployee1841720207Bayu) p;
            pe.getEmployeeInfoBayu();
            System.out.println(""+pe.getEmployeeInfoBayu());
        }
    }
    public void showEmployeeBayu(Employee1841720207Bayu e){
        System.out.println(""+e.getEmployeeInfoBayu());
        if(e instanceof PermanentEmployee1841720207Bayu)
            System.out.println("You have to pay here/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
