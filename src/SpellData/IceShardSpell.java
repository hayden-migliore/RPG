
package SpellData;

import EffectData.*;

public class IceShardSpell extends Spell {
      //Constructor
    public IceShardSpell(){
        super("IceShard", 10, 5, true, Elemental.ICE, Physical.NONE, StatusEffect.FROSTBITTEN);
    }
    
    //Different Damage Constructor
    public IceShardSpell(int damage){
        super("IceShard", 10, damage, true, Elemental.ICE, Physical.NONE, StatusEffect.FROSTBITTEN);
    }
    
    //Specialized Lightning bolt Constructor
    public IceShardSpell(int manaCost, int damage, boolean isRanged){
        super("IceShard", manaCost, damage, isRanged, Elemental.ICE, Physical.NONE, StatusEffect.FROSTBITTEN);
    }
}
