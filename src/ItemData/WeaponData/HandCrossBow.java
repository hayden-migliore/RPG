//Create Base Hand CrossBow
package ItemData.WeaponData;

import EffectData.*;

public class HandCrossBow extends RangedWeapon{
    //Constructor Standard Weapon
    public HandCrossBow(int value, int baseDamage, int range, int ammoCount){
        super("Hand Cross Bow", value, baseDamage, Elemental.NONE, Physical.PIERCING, false, StatusEffect.CUT, range, ammoCount);
    }
    
    //Constructor Magic Weapon
    public HandCrossBow(String name, int value, int baseDamage, Elemental elementalType, int range, int ammoCount){
        super(name, value, baseDamage, elementalType, Physical.PIERCING, false, StatusEffect.CUT, range, ammoCount);
    }
}
