//Ranged Weapon Template
package ItemData.WeaponData;

import EffectData.*;

public class RangedWeapon extends Weapon{
    private int range;
    private int ammoCount;
    
    //Constructor
    public RangedWeapon(String name, int value, int baseDamage, Elemental elementalType, Physical physicalType, boolean isTwoHanded, StatusEffect statusEffect, int range, int ammoCount){
        super(name, value, baseDamage, elementalType, physicalType, isTwoHanded, statusEffect, 0);
        this.range = range;
        this.ammoCount = ammoCount;
    }
    
    //Getters
    public int getRange(){
        return range;
    }
    
    public int getAmmoCount(){
        return ammoCount;
    }
    
    //Setters
    public void setRange(int range){
        this.range = range;
    }

    public void setAmmoCount(int ammoCount){
        this.ammoCount = ammoCount;
    }
}
