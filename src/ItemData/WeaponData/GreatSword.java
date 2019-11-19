//create two handed greatsword
package ItemData.WeaponData;

import EffectData.*;

public class GreatSword extends Weapon{
    //Constructor Standard Weapon
    public GreatSword(int value, int baseDamage){
        super("Great Sword", value, baseDamage, Elemental.NONE, Physical.SLASHING, true, StatusEffect.CUT, -5);
    }
    
    //Constructor Magic Weapon
    public GreatSword(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.SLASHING, true, StatusEffect.CUT, -5);
    }
}
