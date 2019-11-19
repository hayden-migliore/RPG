//Create twohanded spear
package ItemData.WeaponData;

import EffectData.*;

public class Spear extends Weapon{
    //Constructor Standard Weapon
    public Spear(int value, int baseDamage){
        super("Spear", value, baseDamage, Elemental.NONE, Physical.PIERCING, true, StatusEffect.CUT, -1);
    }
    
    //Constructor Magic Weapon
    public Spear(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.PIERCING, true, StatusEffect.CUT, -1);
    }
}
