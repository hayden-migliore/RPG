//Create Sword
package ItemData.WeaponData;

import EffectData.*;

public class Sword extends Weapon{
    //Constructor Magic Weapon
    public Sword(int value, int baseDamage){
        super("Sword", value, baseDamage, Elemental.NONE, Physical.SLASHING, false, StatusEffect.CUT, 0);
    }
    
    //Constructor Magic Weapon
    public Sword(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.SLASHING, false, StatusEffect.CUT, 0);
    }
}
