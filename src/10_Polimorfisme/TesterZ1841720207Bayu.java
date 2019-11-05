package Polimorfisme;

public class TesterZ1841720207Bayu {
    public static void main(String[] args) {
        WalkingZombie1841720207Bayu wz = new WalkingZombie1841720207Bayu(100, 1);
        JumpingZombie1841720207Bayu jz = new JumpingZombie1841720207Bayu(100, 2);
        Barrier1841720207Bayu b = new Barrier1841720207Bayu(100);
        Plant1841720207Bayu p = new Plant1841720207Bayu();
        System.out.println(""+wz.getZombieInfoBayu());
        System.out.println(""+jz.getZombieInfoBayu());
        System.out.println(""+b.getBarrierInfoBayu());
        System.out.println("-------------------------");
        for(int i=0; i<4; i++){
            p.doDestroyBayu(wz);
            p.doDestroyBayu(jz);
            p.doDestroyBayu(b);
        }
        System.out.println(""+wz.getZombieInfoBayu());
        System.out.println(""+jz.getZombieInfoBayu());
        System.out.println(""+b.getBarrierInfoBayu());
    }
}
