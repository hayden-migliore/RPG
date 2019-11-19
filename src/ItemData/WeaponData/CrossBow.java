//Create Basic Crossbow
package ItemData.WeaponData;

import EffectData.Elemental;
import EffectData.Physical;
import EffectData.StatusEffect;


public class CrossBow extends RangedWeapon{
    //Constructor Standard Weapon
    public CrossBow(int value, int baseDamage, int range, int ammoCount){
        super("Short Bow", value, baseDamage, Elemental.NONE, Physical.PIERCING, true, StatusEffect.CUT, range, ammoCount);
    }
    
    //Constructor Magic Weapon
    public CrossBow(String name, int value, int baseDamage, Elemental elementalType, int range, int ammoCount){
        super(name, value, baseDamage, elementalType, Physical.PIERCING, true, StatusEffect.CUT, range, ammoCount);
    }
}
