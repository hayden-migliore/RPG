//Basic poition class
package ItemData.PotionData;

import ItemData.Item;

//Constructor
public class Potion extends Item{
    
    private String effect;
    
    public Potion(String name, int value, String effect){
        super(name, value);
        this.effect = effect;
    }
    
    //Getters
    public String getEffect(){
        return effect;
    }
    
    //Setters
    public void setEffect(String effect){
        this.effect = effect;
    }
}
