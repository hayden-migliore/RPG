//Create basic dagger
package ItemData.WeaponData;

import EffectData.*;

public class Dagger extends Weapon{
     //Constructor Magic Weapon
    public Dagger(int value, int baseDamage){
        super("Dagger", value, baseDamage, Elemental.NONE, Physical.SLASHING, false, StatusEffect.CUT, 5);
    }
    
    //Constructor Magic Weapon
    public Dagger(String name, int value, int baseDamage, Elemental elementalType){
        super(name, value, baseDamage, elementalType, Physical.SLASHING, false, StatusEffect.CUT, 5);
    }
}
