
package ItemData.WeaponData;

import EffectData.*;

public class Mace extends Weapon{
    //Constructor Standard Weapon
    public Mace(int value, int baseDamage){
        super("Mace", value, baseDamage, Elemental.NONE, Physical.BLUDGEONING, false, StatusEffect.BRUISED, -2);
    }
    
    //Constructor Magic Weapon
    public Mace(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.BLUDGEONING, false, StatusEffect.BRUISED, -2);
    }
}
