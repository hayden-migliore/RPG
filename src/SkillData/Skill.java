
package SkillData;

import EffectData.*;

public class Skill {
    private String name;
    private int damage;
    private boolean isRanged;
    private Elemental elementalType;
    private Physical physicalType;
    private StatusEffect statusEffect;
    
    public Skill(String name, int damage, boolean isRanged, Elemental elementalType){
        this.name = name;
        this.damage = damage;
        this.isRanged = isRanged;
        this.elementalType = elementalType;
        this.physicalType = Physical.NONE;
        this.statusEffect = StatusEffect.NONE;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public boolean getIsRanged(){
        return isRanged;
    }
    
    public Elemental getElementalType(){
        return elementalType;
    }
    
    public Physical getPhysicalType(){
        return physicalType;
    }
    
    public StatusEffect getStatusEffect(){
        return statusEffect;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public void setIsRanged(boolean isRanged){
        this.isRanged = isRanged;
    }
    
    public void setElementalType(Elemental elementalType){
        this.elementalType = elementalType;
    }
    
    public void setPhysicalType(Physical physicalType){
        this.physicalType = physicalType;
    }
    
    public void setStatusEffect(StatusEffect statusEffect){
        this.statusEffect = statusEffect;
    }
}
