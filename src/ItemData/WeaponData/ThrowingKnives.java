//Create Basic Throwing Items
package ItemData.WeaponData;

import EffectData.*;

public class ThrowingKnives extends RangedWeapon{
    //Constructor Standard Weapon
    public ThrowingKnives(int value, int baseDamage, int range, int ammoCount){
        super("Short Bow", value, baseDamage, Elemental.NONE, Physical.SLASHING, false, StatusEffect.CUT, range, ammoCount);
    }
    
    //Constructor Magic Weapon
    public ThrowingKnives(String name, int value, int baseDamage, Elemental elementalType, int range, int ammoCount){
        super(name, value, baseDamage, elementalType, Physical.SLASHING, false, StatusEffect.CUT, range, ammoCount);
    }
}
