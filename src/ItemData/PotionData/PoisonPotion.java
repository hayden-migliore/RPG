//Poisonous Potion
package ItemData.PotionData;


public class PoisonPotion extends Potion{
    private int damage;
    
    //Constructor
    public PoisonPotion(String name, int value, String effect, int damage){
        super(name, value, effect);
        this.damage = damage;
    }
    
    //Getters
    public int getDamage(){
        return damage;
    }
    
    //Setters
    public void setDamage(int damage){
        this.damage = damage;
    }
}
