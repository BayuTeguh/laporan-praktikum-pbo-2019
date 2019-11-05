package Polimorfisme;

public class WalkingZombie1841720207Bayu extends Zombie1841720207Bayu implements IDestroyable1841720207Bayu{

    public WalkingZombie1841720207Bayu(int healt, int level) {
        this.healt = healt;
        this.level = level;
    }
    
    @Override
    public void healBayu() {
        if(healt == 100)
            healt += 1;
        else
            System.out.println("");
    }

    @Override
    public void destroyedBayu() {
        healt -= healt*0.190;
    }

    @Override
    public String getZombieInfoBayu() {
       return "Walking "+super.getZombieInfoBayu()+"\n"+
       "Healt = "+healt+"\n"+"Level = "+level+"\n";
    }
}
