//Create twohanded axe
package ItemData.WeaponData;

import EffectData.*;

public class GreatAxe extends Weapon{
    //Constructor Standard Weapon
    public GreatAxe(int value, int baseDamage){
        super("Great Axe", value, baseDamage, Elemental.NONE, Physical.SLASHING, true, StatusEffect.CUT, -8);
    }
    
    //Constructor Magic Weapon
    public GreatAxe(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.SLASHING, true, StatusEffect.CUT, -8);
    }
}
