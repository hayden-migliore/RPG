//Health Potion
package ItemData.PotionData;

public class HealthPotion extends Potion{
    private int heal;
    
    //Constructor
    public HealthPotion(String name, int value, String effect, int heal){
        super(name, value, effect);
        this.heal = heal;
    }
    
    //Getters
    public int getHeal(){
        return heal;
    }
    
    //Setters
    public void setHeal(){
        this.heal = heal;
    }
    
}
