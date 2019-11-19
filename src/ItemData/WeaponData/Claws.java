
package ItemData.WeaponData;

import EffectData.*;

public class Claws extends Weapon{
    //Constructor Standard Weapon
    public Claws(int baseDamage){
        super("Claws", 0, baseDamage, Elemental.NONE, Physical.PIERCING, false, StatusEffect.CUT, 5);
    }
    
    //Constructor Magic Weapon
    public Claws(int baseDamage, Elemental elementalType){
        super("Claws", 0, baseDamage, elementalType, Physical.PIERCING, false, StatusEffect.CUT, 5);
    }
}
