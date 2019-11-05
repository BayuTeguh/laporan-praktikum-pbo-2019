package Polimorfisme;

public class Tester11841720207Bayu {
    public static void main(String[] args) {
        PermanentEmployee1841720207Bayu pEmp = new PermanentEmployee1841720207Bayu("Dedik", 500);
        InternshipEmployee1841720207Bayu iEmp = new InternshipEmployee1841720207Bayu("Sunarto", 5);
        ElectricityBill1841720207Bayu eBill = new ElectricityBill1841720207Bayu(5, "A-1");
        Employee1841720207Bayu e;
        Payable1841720207Bayu p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
