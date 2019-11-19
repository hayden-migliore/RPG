//Create Basic Lightning Spell
package SpellData;

import EffectData.*;

public class LightningBoltSpell extends Spell{
    //Constructor
    public LightningBoltSpell(){
        super("LightningBolt", 10, 5, true, Elemental.LIGHTNING, Physical.NONE, StatusEffect.SHOCKED);
    }
    
    //Different Damage Constructor
    public LightningBoltSpell(int damage){
        super("LightningBolt", 10, damage, true, Elemental.LIGHTNING, Physical.NONE, StatusEffect.SHOCKED);
    }
    
    //Specialized Lightning bolt Constructor
    public LightningBoltSpell(int manaCost, int damage, boolean isRanged){
        super("LightningBolt", manaCost, damage, isRanged, Elemental.LIGHTNING, Physical.NONE, StatusEffect.SHOCKED);
    }
}
