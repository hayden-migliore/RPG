//Create Shortbow
package ItemData.WeaponData;

import EffectData.*;

public class ShortBow extends RangedWeapon{
    //Constructor Standard Weapon
    public ShortBow(int value, int baseDamage, int range, int ammoCount){
        super("Short Bow", value, baseDamage, Elemental.NONE, Physical.PIERCING, true, StatusEffect.CUT, range, ammoCount);
    }
    
    //Constructor Magic Weapon
    public ShortBow(String name, int value, int baseDamage, Elemental elementalType, int range, int ammoCount){
        super(name, value, baseDamage, elementalType, Physical.PIERCING, true, StatusEffect.CUT, range, ammoCount);
    }
}
