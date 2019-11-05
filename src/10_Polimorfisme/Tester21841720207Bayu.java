package Polimorfisme;

public class Tester21841720207Bayu {
    public static void main(String[] args) {
        PermanentEmployee1841720207Bayu pEmp = new PermanentEmployee1841720207Bayu("Dedik", 500);
        Employee1841720207Bayu e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoBayu());
        System.out.println("----------------------");
        System.out.println(""+pEmp.getEmployeeInfoBayu());
    }
}
