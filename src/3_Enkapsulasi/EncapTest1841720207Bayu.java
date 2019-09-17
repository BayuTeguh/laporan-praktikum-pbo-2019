
package TugasEnkapsulasi;

import java.util.Scanner;

public class EncapTest1841720207Bayu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EncapDemo1841720207Bayu encap = new EncapDemo1841720207Bayu();

        encap.setNameBayu("James");
        encap.setAgeBayu(35);
        
        System.out.println("Name: "+encap.getNameBayu());
        System.out.println("Age: "+encap.getAgeBayu());
    }
}
