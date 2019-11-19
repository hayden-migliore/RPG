//Weapon Template
package ItemData.WeaponData;

import ItemData.Item;
import EffectData.*;

public class Weapon extends Item{
    private int baseDamage;
    private Elemental elementalType;
    private Physical physicalType;
    private boolean isTwoHanded;
    private StatusEffect statusEffect;
    private int speedModifier;
    
    //Constructor
    public Weapon (String name, int value, int baseDamage, Elemental elementalType, Physical physicalType, boolean isTwoHanded, StatusEffect statusEffect, int speedModifier){
        super(name, value);
        this.baseDamage = baseDamage;
        this.elementalType = elementalType;
        this.physicalType = physicalType;
        this.isTwoHanded = isTwoHanded;
        this.statusEffect = statusEffect;
        this.speedModifier = speedModifier;
    }
    
    //Getters
    public int getBaseDamage(){
        return baseDamage;
    }
    
    public Physical getPhysicalType(){
        return physicalType;
    }
    
    public Elemental getElementalType(){
        return elementalType;
    }
    
    public boolean getIsTwoHanded(){
        return isTwoHanded;
    }
    
    public StatusEffect getStatusEffect(){
        return statusEffect;
    }
    
    public int getSpeedModifier(){
        return speedModifier;
    }
    
    //Setters
    public void setBaseDamage(int baseDamage){
        this.baseDamage = baseDamage;
    }
    
    public void setPhysicalType(Physical physicalType){
        this.physicalType = physicalType;
    }
    
    public void setElementalType(Elemental elementalType){
        this.elementalType = elementalType;
    }
    
    public void setIsTwoHanded(boolean isTwoHanded){
        this.isTwoHanded = isTwoHanded;
    }
    
    public void setStatusEffect(StatusEffect statusEffect){
        this.statusEffect = statusEffect;
    }
    
    public void setSpeedModifier (int speedModifier){
        this.speedModifier = speedModifier;
    }
    
}
