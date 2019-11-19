//Resistance Potion
package ItemData.PotionData;

public class ResistancePotion extends Potion{
    private int resistance;
    
    //Constructor
    public ResistancePotion (String name, int value, String effect, int resistance){
        super(name, value, effect);
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
