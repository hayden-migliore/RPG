//Create ShortSpear
package ItemData.WeaponData;

import EffectData.*;

public class ShortSpear extends Weapon{    
    //Constructor Standard Weapon
    public ShortSpear(int value, int baseDamage){
        super("Short Spear", value, baseDamage, Elemental.NONE, Physical.PIERCING, false, StatusEffect.CUT, 1);
    }
    
    //Constructor Magic Weapon
    public ShortSpear(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.PIERCING, false, StatusEffect.CUT, 1);
    }
}
