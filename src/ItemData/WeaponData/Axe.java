//Create axe
package ItemData.WeaponData;

import EffectData.*;

public class Axe extends Weapon{
    //Constructor Standard Weapon
    public Axe(int value, int baseDamage){
        super("Axe", value, baseDamage, Elemental.NONE, Physical.SLASHING, false, StatusEffect.CUT, 0);
    }
    
    //Constructor Magic Weapon
    public Axe(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.SLASHING, false, StatusEffect.CUT, 0);
    }
}
