//Create basic Air Blast Spell
package SpellData;

import EffectData.*;

public class AirBlastSpell extends Spell{
    //Constructor
    public AirBlastSpell(){
        super("AirBlast", 10, 5, true, Elemental.AIR);
    }
    
    //Different Damage Constructor
    public AirBlastSpell(int damage){
        super("AirBlast", 10, damage, true, Elemental.AIR);
    }
    
    //Specialized Lightning bolt Constructor
    public AirBlastSpell(int manaCost, int damage, boolean isRanged){
        super("AirBlast", manaCost, damage, isRanged, Elemental.AIR);
    }
}
