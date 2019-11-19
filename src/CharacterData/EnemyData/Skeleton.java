package CharacterData.EnemyData;




import EffectData.*;
import ItemData.WeaponData.*;
import CharacterData.Creature;


public class Skeleton extends Creature{
    Weapon weapon;
    
    //Constructor
    public Skeleton(Weapon weapon){
        super("Skeleton", 10, 10, 95);
        this.weapon = weapon;
    }
    
    //Detailed Constructor
    public Skeleton(double health, Weapon weapon){
        super("Skeleton", health, 10, 95);
        this.weapon = weapon;
    }
    
    @Override
    public double attack(){
        return weapon.getBaseDamage();
    }
    
    public void takeDamage(int damage, Physical physicalType, Elemental elementalType){
        //Skeletons are weak to bludgeoning
        if (physicalType == Physical.BLUDGEONING)
            damage = 2 * damage;
        
        if ((getCurrentHP() - damage) < 0)
            setStatus(StatusEffect.DEAD);
        else
            setCurrentHP(getCurrentHP() - damage);
    }
    
    @Override
    public StatusEffect applyStatus(){
        return weapon.getStatusEffect();
    }
    
    //Getters
    public Weapon getWeapon(){
        return weapon;
    }
    
    //Setters
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
