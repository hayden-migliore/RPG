//Create basic Phsyic
package SpellData;

import EffectData.*;

public class PsychicSpikeSpell extends Spell{
    //Constructor
    public PsychicSpikeSpell(){
        super("PsychicSpike", 10, 5, true, Elemental.PSYCHIC, Physical.NONE, StatusEffect.CONFUSED);
    }
    
    //Different Damage Constructor
    public PsychicSpikeSpell(int damage){
        super("PsychicSpike", 10, damage, true, Elemental.PSYCHIC, Physical.NONE, StatusEffect.CONFUSED);
    }
    
    //Specialized Lightning bolt Constructor
    public PsychicSpikeSpell(int manaCost, int damage, boolean isRanged){
        super("PsychicSpike", manaCost, damage, isRanged, Elemental.PSYCHIC, Physical.NONE, StatusEffect.CONFUSED);
    }
}
