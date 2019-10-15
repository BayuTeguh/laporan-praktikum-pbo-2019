package OverloadOverride;

public class MainSegitiga1841720207Bayu {
    public static void main(String[] args) {
        
        Segitiga1841720207Bayu sg = new Segitiga1841720207Bayu();
        
        System.out.println("Total sudut 1: "+sg.totalSudutBayu(30));
        System.out.println("=================");
        System.out.println("Total sudut 2: "+sg.totalSudutBayu(25, 25));
        System.out.println("=================");
        System.out.println("Keliling 1: "+sg.kelilingBayu(25, 25, 30));
        System.out.println("=================");
        System.out.println("Keliling 2: "+sg.kelilingBayu(4, 5));
    }
}
