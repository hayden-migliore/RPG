//Create basic 1v1 combat
package CombatData;

import CharacterData.Creature;
import EffectData.*;
import CharacterData.Player;
import SpellData.*;
import java.util.Scanner;
import java.util.ArrayList;
import CombatData.Combiner;

public class SingleCombat {
    private Player player;
    private Creature enemy;
    private Combiner c = new Combiner();
    
    //Constructor
    public SingleCombat(Player player, Creature enemy){
        this.player = player;
        this.enemy = enemy;
    }
    
    //Check if Player is faster than enemy
    public boolean checkSpeed(){
        if (player.getSpeed() >= enemy.getSpeed())
            return true;
        return false;
    }
    
    //Player attacks
    public void playerAttack(){
        double damage = player.attack() * c.check(enemy.getStatus(), player.applyStatus());
        enemy.takeDamage(damage);
        System.out.println(enemy.getName() + " took " + damage);
        if (!checkPlayerWin()){
            enemy.setStatus(player.applyStatus());
            System.out.println(enemy.getName() + " is now " + player.applyStatus());
        }
    }
    
    public void playerRangedAttack(){
        double damage = player.rangedAttack() * c.check(enemy.getStatus(), player.applyRangedStatus());
        if (player.getRangedWeapon() == null)
            System.out.println("You don't have a ranged weapon!");
        enemy.takeDamage(damage);
        System.out.println(enemy.getName() + " took " + damage);
        if (!checkPlayerWin()){
            enemy.setStatus(player.applyRangedStatus());
            System.out.println(enemy.getName() + " is now " + player.applyRangedStatus());
        }
    }
    
    public void playerSpell(Scanner input){
        //Print spellbook
        System.out.println("Retrieving spell book");
        ArrayList<Spell> spellBook = player.getSpellBook();
        System.out.println(player.getSpellBookString());
        System.out.println("Please choose a spell.");
        
        //Have player choose spell from spellbook
        int choice = input.nextInt() - 1;
        try{
            //Attempt to damage enemy with chosen spell
            Spell spell = spellBook.get(choice);
            double damage = spell.getDamage() * c.check(enemy.getStatus(), spell.getStatusEffect());
            enemy.takeDamage(damage);
            System.out.println(enemy.getName() + " took " + damage);
            if (!checkPlayerWin()){
                enemy.setStatus(spell.getStatusEffect());
                System.out.println(enemy.getName() + " is now " + spell.getStatusEffect());
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Spell incorrectly chosen.");
        }
    }
    
    //Enemy attacks
    public void enemyAttack(){
        double damage = enemy.attack() * c.check(player.getStatus(), enemy.applyStatus());
        player.takeDamage(damage);
        System.out.println(player.getName() + " took " + (damage - player.getArmorResistance()));
        if (!checkEnemyWin()){
            player.setStatus(enemy.applyStatus());
            System.out.println(player.getName() + " is now " + enemy.applyStatus());
        }
    }
    
    //Check for victory
    public boolean checkPlayerWin(){
        if (enemy.getStatus() == StatusEffect.DEAD)
            return true;
        return false;
    }
    
    public boolean checkEnemyWin(){
        if (player.getStatus() == StatusEffect.DEAD)
            return true;
        return false;
    }
    
    
    //Getters
    public Player getPlayer(){
        return player;
    }
    
    public Creature getEnemy(){
        return enemy;
    }
    
    //Setters
    public void setPlayer(Player player){
        this.player = player;
    }
    
    public void setEnemy(Creature enemy){
        this.enemy = enemy;
    }
}
