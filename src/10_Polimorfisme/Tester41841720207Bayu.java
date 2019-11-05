package Polimorfisme;

public class Tester41841720207Bayu {
    public static void main(String[] args) {
        Owner1841720207Bayu ow = new Owner1841720207Bayu();
        ElectricityBill1841720207Bayu eBill = new ElectricityBill1841720207Bayu(5, "R-1");
        ow.payBayu(eBill);
        System.out.println("-------------------------------------");
        
        PermanentEmployee1841720207Bayu pEmp = new PermanentEmployee1841720207Bayu("Dedik", 500);
        ow.payBayu(pEmp);
        System.out.println("-------------------------------------");
        
        InternshipEmployee1841720207Bayu iEmp = new InternshipEmployee1841720207Bayu("Sunarto", 5);
        ow.showEmployeeBayu(pEmp);
        System.out.println("-------------------------------------");
        ow.showEmployeeBayu(iEmp);
    }
}
