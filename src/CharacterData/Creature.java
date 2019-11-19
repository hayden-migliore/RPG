//Define basic characters in RPG
package CharacterData;

import EffectData.StatusEffect;
import ThingData.Thing;

public class Creature extends Thing{
    private double hp;
    private double maxHp;
    private int speed;
    private int accuracy;
    private StatusEffect status;

    //Constructor
    public Creature(String name, double maxHp, int speed, int accuracy){
        super(name);
        this.maxHp = maxHp;
        hp = maxHp;
        this.speed = speed;
        this.accuracy = accuracy;
        status = StatusEffect.NONE;
    }
    
    public void takeDamage(double damage){
        if ((hp - damage) <= 0)
            status = StatusEffect.DEAD;
        else
            hp -= damage;
    }
    
    public void heal(int healing){
        if ((hp + healing) > maxHp)
            hp = maxHp;
        else
            hp += healing;
    }
    
    public String getStats(){
        return "Max HP: " + maxHp + "\nCurrent HP: " + hp + "\nSpeed: " + speed + "\nAccuracy: " + accuracy;
    }
    
    public double attack(){
        return 0;
    }
    
    public int rangedAttack(){
        return 0;
    }
    
    public StatusEffect applyStatus(){
        return StatusEffect.NONE;
    }
    
    public StatusEffect applyRangedStatus(){
        return StatusEffect.NONE;
    }
    
    
    //Getters
    public double getMaxHP(){
        return maxHp;
    }
    
    public double getCurrentHP(){
        return hp;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public int getAccuracy(){
        return accuracy;
    }
    
    public StatusEffect getStatus(){
        return status;
    }
    
    //Setters
    public void setMaxHP(double maxHp){
        this.maxHp = maxHp;
    }
    
    public void setCurrentHP(double hp){
        this.hp = hp;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public void setAccuracy(int accuracy){
        this.accuracy = accuracy;
    }
    
    public void setStatus(StatusEffect status){
        this.status = status;
    }
}
