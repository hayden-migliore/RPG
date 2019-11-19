//Create twohanded war hammer
package ItemData.WeaponData;

import EffectData.*;

public class WarHammer extends Weapon{

    //Constructor Standard Weapon
    public WarHammer(int value, int baseDamage){
        super("War Hammer", value, baseDamage, Elemental.NONE, Physical.BLUDGEONING, true, StatusEffect.BRUISED, -8);
    }
    
    //Constructor Magic Weapon
    public WarHammer(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.BLUDGEONING, true, StatusEffect.BRUISED, -8);
    }
}
