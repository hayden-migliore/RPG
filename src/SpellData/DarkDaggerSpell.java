//Create Basic Dark Dagger Spell
package SpellData;

import EffectData.*;

public class DarkDaggerSpell extends Spell{
    //Constructor
    public DarkDaggerSpell(){
        super("DarkDagger", 10, 5, true, Elemental.DARK, Physical.SLASHING, StatusEffect.CUT);
    }
    
    //Different Damage Constructor
    public DarkDaggerSpell(int damage){
        super("DarkDagger", 10, damage, true, Elemental.DARK, Physical.SLASHING, StatusEffect.CUT);
    }
    
    //Specialized Lightning bolt Constructor
    public DarkDaggerSpell(int manaCost, int damage, boolean isRanged){
        super("DarkDagger", manaCost, damage, isRanged, Elemental.DARK, Physical.SLASHING, StatusEffect.CUT);
    }
}
