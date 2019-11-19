//Create base Armor item
package ItemData.ArmorData;

import ItemData.Item;

public class Armor extends Item{
    private int resistance;
    
    //Constructor
    public Armor(String name, int value, int resistance){
        super(name, value);
        this.resistance = resistance;
    }
    
    //Getters
    public int getResistance(){
        return resistance;
    }
    
    //Setters
    public void setResistance(int resistance){
        this.resistance = resistance;
    }
}
