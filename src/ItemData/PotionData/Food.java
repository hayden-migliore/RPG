//Food that acts like a potion
package ItemData.PotionData;

public class Food extends Potion{
    private int heal;
    
    //Constructor
    public Food(String name, int value, String effect, int heal){
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
