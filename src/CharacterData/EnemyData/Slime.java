package CharacterData.EnemyData;

//Create basic Slime enemy


import EffectData.Elemental;
import EffectData.StatusEffect;
import CharacterData.Creature;

public class Slime extends Creature{
    
    private Elemental type;
    private StatusEffect statusType;
    
    //Constructor
    public Slime(Elemental type, StatusEffect statusType){
        super("Slime", 10, 10, 95);
        this.type = type;
        this.statusType = statusType;
    }
    
    //Detailed Constuctor
    public Slime(double health, Elemental type, StatusEffect statusType){
        super("Slime", health, 10, 95);
        this.type = type;
        this.statusType = statusType;
    }
    
    @Override
    public double attack(){
        return 4;
    }
    
    public StatusEffect applyStatus(){
        return statusType;
    }
    
    @Override
    public String getStats(){
        return "Max HP: " + getMaxHP() + "\nCurrent HP: " + getCurrentHP() + "\nSpeed: " + getSpeed() + "\nAccuracy: " + getAccuracy() + "\nElemental Type: " + type;
    }
    
    //Getters
    public Elemental getType(){
        return type;
    }
    
    public StatusEffect getStatusType(){
        return statusType;
    }
    
    //Setters
    public void setType(Elemental type){
        this.type = type;
    }
    
    public void setStatusType(StatusEffect statusType){
        this.statusType = statusType;
    }
}
