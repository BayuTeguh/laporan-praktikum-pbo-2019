package Polimorfisme;

public class Tester1841720207Bayu {
    public static void main(String[] args) {
        PermanentEmployee1841720207Bayu pEmp = new PermanentEmployee1841720207Bayu("Dedik", 500);
        InternshipEmployee1841720207Bayu iEmp = new InternshipEmployee1841720207Bayu("Sunarto", 500);
        ElectricityBill1841720207Bayu eBill = new ElectricityBill1841720207Bayu(5, "A-1");
        Employee1841720207Bayu e[] = {pEmp, iEmp};
        Payable1841720207Bayu p[] = {pEmp, eBill};
        Employee1841720207Bayu e2[] = {pEmp, iEmp};
    }
}
