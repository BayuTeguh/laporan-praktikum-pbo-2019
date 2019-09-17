
package motorencapsulation;

public class MotorDemo1841720207Bayu {
    public static void main(String[] args) {
        Motor1841720207Bayu motor = new Motor1841720207Bayu();
        motor.printStatusBayu();
        motor.tambahKecepatanBayu();
        
        motor.nyalakanMesinBayu();
        motor.printStatusBayu();
        
        int i;
        for(i=0; i<=20;i++){
            motor.tambahKecepatanBayu();
            motor.printStatusBayu();
        }
        /*motor.tambahKecepatan(i);
        motor.printStatus();
        
        /*motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();*/
        
        motor.maxKecepatanBayu();
        motor.printStatusBayu();
        
        motor.matikanMesinBayu();
        motor.printStatusBayu();
    }
}
