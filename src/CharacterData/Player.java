
package CharacterData;

import EffectData.StatusEffect;
import ItemData.ArmorData.Armor;
import ItemData.WeaponData.Weapon;
import ItemData.WeaponData.RangedWeapon;
import basicrpg.*;
import ItemData.*;
import SpellData.*;
import java.util.ArrayList;


public class Player extends Creature{
    
    private Weapon weapon;
    private Armor armor;
    private int spellLimit;
    private int mana;
    private ArrayList<Spell> spellBook;
    private RangedWeapon rangedWeapon;
    
    //Constructor
    public Player(String name, double maxHp, int speed, int accuracy, Weapon weapon, Armor armor, int spellLimit, int mana){
        super(name, maxHp, speed, accuracy);
        this.weapon = weapon;
        this.armor = armor;
        this.spellLimit = spellLimit;
        this.mana = mana;
        spellBook = new ArrayList<Spell>(spellLimit);
        rangedWeapon = null;
    }
    
    //Constructor
    public Player(String name, int maxHp, int speed, int accuracy, Weapon weapon, RangedWeapon rangedWeapon, Armor armor, int spellLimit, int mana){
        super(name, maxHp, (speed + weapon.getSpeedModifier()), accuracy);
        this.weapon = weapon;
        this.armor = armor;
        this.spellLimit = spellLimit;
        this.mana = mana;
        spellBook = new ArrayList<Spell>(spellLimit);
        this.rangedWeapon = rangedWeapon;
    }
    
    @Override
    public void takeDamage(double damage){
        if ((getCurrentHP() - (damage - armor.getResistance())) < 0)
            setStatus(StatusEffect.DEAD);
        else
            setCurrentHP(getCurrentHP() - (damage - armor.getResistance()));
    }
    
    @Override
    public StatusEffect applyStatus(){
        return weapon.getStatusEffect();
    }
    
    @Override
    public double attack(){
        return weapon.getBaseDamage();
    }
    
    @Override
    public int rangedAttack(){
        if (rangedWeapon != null)
            return rangedWeapon.getBaseDamage();
        return 0;
    }
    
    @Override
    public StatusEffect applyRangedStatus(){
        if (rangedWeapon != null)
            return rangedWeapon.getStatusEffect();
        return StatusEffect.NONE;
    }
    
    public String addSpell(Spell spell){
        try{
            spellBook.add(spell);
            return spell.getName() + " has been added.";
        }
        catch(IndexOutOfBoundsException e){
            return "Spell book is full.";
        }
    }
    
    public boolean checkSpell(Spell spell){
        boolean inSpellBook = false;
        for (Spell s : spellBook){
            if (spell == s)
                inSpellBook = true;
        }
        if (inSpellBook){
            if (mana > spell.getManaCost()){
                mana -= spell.getManaCost();
                return true;
            }
        }
        return false;
    }
    
    //Getters
    public Weapon getWeapon(){
        return weapon;
    }
 
    public Armor getArmor(){
        return armor;
    }
    
    public int getArmorResistance(){
        return armor.getResistance();
    }
    
    public int getSpellLimit(){
        return spellLimit;
    }
    
    public int getMana(){
        return mana;
    }
    
    public ArrayList<Spell> getSpellBook(){
        return spellBook;
    }
    
    public ArrayList<String> getSpellBookString(){
        ArrayList<String> spellBookStr = new ArrayList<String>(spellLimit);
        for (int i = 0; i < spellLimit; i++){
            spellBookStr.add(spellBook.get(i).getName());
        }
        return spellBookStr;
    }
    
    public RangedWeapon getRangedWeapon(){
        return rangedWeapon;
    }
    
    //Setters
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public void setArmor(Armor armor){
        this.armor = armor;
    }
    
    public void setSpellLimit(int spellLimit){
        this.spellLimit = spellLimit;
    }
    
    public void setMana(int mana){
        this.mana = mana;
    }
    
    public void setRangedWeapon(RangedWeapon rangedWeapon){
        this.rangedWeapon = rangedWeapon;
    }
}
