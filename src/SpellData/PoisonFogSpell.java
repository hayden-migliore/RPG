//Create basic Poison Fog spell
package SpellData;

import EffectData.*;

public class PoisonFogSpell extends Spell{
    //Constructor
    public PoisonFogSpell(){
        super("PoisonFog", 10, 5, true, Elemental.POISON, Physical.NONE, StatusEffect.POISONED);
    }
    
    //Different Damage Constructor
    public PoisonFogSpell(int damage){
        super("PoisonFog", 10, damage, true, Elemental.POISON, Physical.NONE, StatusEffect.POISONED);
    }
    
    //Specialized Lightning bolt Constructor
    public PoisonFogSpell(int manaCost, int damage, boolean isRanged){
        super("PoisonFog", manaCost, damage, isRanged, Elemental.POISON, Physical.NONE, StatusEffect.POISONED);
    }
}
