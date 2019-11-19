//BareFist for monks
package ItemData.WeaponData;

import EffectData.*;

public class BareFist extends Weapon{
    //Constructor Standard Weapon
    public BareFist(int baseDamage){
        super("Fist", 0, baseDamage, Elemental.NONE, Physical.BLUDGEONING, false, StatusEffect.NONE, 8);
    }
    
    //Constructor Magic Weapon
    public BareFist(int baseDamage, Elemental elementalType){
        super("Fist", 0, baseDamage, elementalType, Physical.BLUDGEONING, false, StatusEffect.NONE, 8);
    }
}
