package Polimorfisme;

public abstract class Zombie1841720207Bayu implements IDestroyable1841720207Bayu{
    protected int healt, level;
    
    public abstract void healBayu();  

    @Override
    public abstract void destroyedBayu();
    
    public String getZombieInfoBayu(){
        return "Zombie Data = ";
    }
}
