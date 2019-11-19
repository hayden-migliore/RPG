//Create base WaterShotSpell spell
package SpellData;

import EffectData.*;

public class WaterShotSpell extends Spell{
    //Constructor
    public WaterShotSpell(){
        super("WaterShot", 10, 5, true, Elemental.WATER, Physical.NONE, StatusEffect.WET);
    }
    
    //Different Damage Constructor
    public WaterShotSpell(int damage){
        super("WaterShot", 10, damage, true, Elemental.WATER, Physical.NONE, StatusEffect.WET);
    }
    
    //Specialized Lightning bolt Constructor
    public WaterShotSpell(int manaCost, int damage, boolean isRanged){
        super("WaterShot", manaCost, damage, isRanged, Elemental.WATER, Physical.NONE, StatusEffect.WET);
    }
}
