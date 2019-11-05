package Polimorfisme;

public class Plant1841720207Bayu {
     public void doDestroyBayu(IDestroyable1841720207Bayu d){
        if(d instanceof WalkingZombie1841720207Bayu){
            WalkingZombie1841720207Bayu wz = (WalkingZombie1841720207Bayu) d;
            wz.destroyedBayu();
        }else if(d instanceof JumpingZombie1841720207Bayu){
            JumpingZombie1841720207Bayu jz = (JumpingZombie1841720207Bayu) d;
            jz.destroyedBayu();
        }else if(d instanceof Barrier1841720207Bayu){
            Barrier1841720207Bayu b = (Barrier1841720207Bayu) d;
            b.destroyedBayu();
        }
    }
}
