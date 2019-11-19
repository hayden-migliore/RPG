//Create basic fireball spell
package SpellData;

import EffectData.*;

public class FireBallSpell extends Spell{
    
    //Constructor
    public FireBallSpell(){
        super("Fireball", 10, 5, true, Elemental.FIRE, Physical.NONE, StatusEffect.BURNT);
    }
    
    //Different Damage Constructor
    public FireBallSpell(int damage){
        super("Fireball", 10, damage, true, Elemental.FIRE, Physical.NONE, StatusEffect.BURNT);
    }
    
    //Specialized Fireball Constructor
    public FireBallSpell(int manaCost, int damage, boolean isRanged){
        super("Fireball", manaCost, damage, isRanged, Elemental.FIRE, Physical.NONE, StatusEffect.BURNT);
    }

}
