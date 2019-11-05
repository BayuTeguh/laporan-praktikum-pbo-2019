package Polimorfisme;

public class JumpingZombie1841720207Bayu extends Zombie1841720207Bayu implements IDestroyable1841720207Bayu{

    public JumpingZombie1841720207Bayu(int h, int l) {
        this.healt = h;
        this.level = l;
    }

    @Override
    public void healBayu() {
        if(level == 2)
            healt += 2;
        else
            System.out.println("");
    }

    @Override
    public void destroyedBayu() {
        healt -= healt*0.095;
    }
    
    public String getZombieInfoBayu(){
        return "Jumping "+super.getZombieInfoBayu()+"\n"+
         "Healt = "+healt+"\n"+"Level = "+level+"\n";
    }
}
