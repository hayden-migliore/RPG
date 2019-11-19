//Create spell template
package SpellData;

import EffectData.*;

public class Spell {
    private String name;
    private int manaCost;
    private int damage;
    private boolean isRanged;
    private Elemental elementalType;
    private Physical physicalType;
    private StatusEffect statusEffect;
    
    //Basic Spell Constructor
    public Spell(String name, int manaCost, int damage, boolean isRanged, Elemental elementalType){
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
        this.isRanged = isRanged;
        this.elementalType = elementalType;
        this.physicalType = Physical.NONE;
        this.statusEffect = StatusEffect.NONE;
    }
    
    //Phsical Spell Constructor
    public Spell(String name, int manaCost, int damage, boolean isRanged, Physical physicalType){
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
        this.isRanged = isRanged;
        this.elementalType = Elemental.NONE;
        this.physicalType = physicalType;
        this.statusEffect = StatusEffect.NONE;
    }
    
    //Status Effect Spell
    public Spell(String name, int manaCost, int damage, boolean isRanged, StatusEffect statusEffect){
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
        this.isRanged = isRanged;
        this.elementalType = Elemental.NONE;
        this.physicalType = Physical.NONE;
        this.statusEffect = statusEffect;
    }
    
    //Full Spell Constructor
    public Spell(String name, int manaCost, int damage, boolean isRanged, Elemental elementalType, Physical physicalType, StatusEffect statusEffect){
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
        this.isRanged = isRanged;
        this.elementalType = elementalType;
        this.physicalType = physicalType;
        this.statusEffect = statusEffect;
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    public int getManaCost(){
        return manaCost;
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
    
    public void setManaCost(int manaCost){
        this.manaCost = manaCost;
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
