package rpg;

import CharacterData.EnemyData.*;
import CharacterData.Creature;
import javax.swing.*;
import CharacterData.Player;
import ItemData.ArmorData.*;
import ItemData.WeaponData.*;
import SpellData.*;
import EffectData.*;
import CombatData.SingleCombat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        //Select Creature
        System.out.println("Please select your character:");
        System.out.println("1) Paladin");
        System.out.println("2) Wizard");
        System.out.println("3) Barbarian");
        System.out.println("4) Assassin");
        int choice = input.nextInt();
        Player player1 = CreateCharacter(choice);
        
        //Select Enemy
        System.out.println("Please select your enemy:");
        System.out.println("1) Slime");
        System.out.println("2) Skeleton");
                
        int choice2 = input.nextInt();
        Creature enemy1 = ChooseEnemy(choice2);
        System.out.println("\nBegin Combat!");
        
        //Begin Combat
        SingleCombat sc = new SingleCombat(player1, enemy1);
        while(!sc.checkPlayerWin() && !sc.checkEnemyWin()){
            //Check if enemy goes first
            if(!sc.checkSpeed() && count == 0)
                sc.enemyAttack();
            
            //Begin round
            System.out.println("What would you like to do?");
            System.out.println("1) Melee Attack");
            System.out.println("2) Ranged Attack");
            System.out.println("3) Spell");
            System.out.println("4) Check Stats and status");
            int choice3 = input.nextInt();
            
            switch(choice3){
            case 1:
                sc.playerAttack();
                break;
            case 2:
                sc.playerRangedAttack();
                break;
            case 3:
                sc.playerSpell(input);
                break;
            case 4: 
                System.out.println(player1.getStats());
                break;
            }
            
            sc.enemyAttack();
            count++;
        }
        
        //Print Results
        System.out.println("\nThe fight is over!");
        if(sc.checkPlayerWin())
            System.out.println("\nPlayer 1 wins.");
        else if(sc.checkEnemyWin())
            System.out.println("\nPlayer 1 died.");
    }
    
    static Player CreateCharacter(int choice){
        switch(choice){
            case 1:
                System.out.println("Paladin chosen");
                return createPaladin();
            case 2:
                System.out.println("Wizard chosen");
                return createWizard();
            case 3:
                System.out.println("Barbarian chosen");
                return createBarbarian();
            case 4: 
                System.out.println("Assassin chosen");
                return createAssassin();
            default:
                System.out.println("Nothing chosen. Paladin assigned.");
                return createPaladin();      
        }    
    }
    
    static Player createPaladin(){
        //Create base paladin character
        Sword sword = new Sword(50, 5);
        PlateArmor plateArmor = new PlateArmor(50, 3);
        LightningBoltSpell lbs = new LightningBoltSpell();
        Player paladin = new Player("Paladin", 50, 10, 95, sword, plateArmor, 1, 20);
        paladin.addSpell(lbs);
        
        return paladin;
    }
    
    static Player createWizard(){
        //Create base wizard character
        Dagger dagger = new Dagger(20, 3);
        ClothArmor clothArmor = new ClothArmor(10, 0);
        FireBallSpell fbs = new FireBallSpell();
        PsychicSpikeSpell pss = new PsychicSpikeSpell();
        WaterShotSpell wss = new WaterShotSpell();
        IceShardSpell iss = new IceShardSpell();
        Player wizard = new Player("Wizard", 35, 15, 95, dagger, clothArmor, 4, 100);
        wizard.addSpell(fbs);
        wizard.addSpell(pss);
        wizard.addSpell(wss);
        wizard.addSpell(iss);
        
        return wizard;
    }
    
    static Player createBarbarian(){
        //Create the barbarian character
        GreatAxe greatAxe = new GreatAxe(60, 8);
        ScaleArmor scaleArmor = new ScaleArmor(50, 2);
        Player barbarian = new Player("Barbarian", 60, 12, 95, greatAxe, scaleArmor, 0, 0);
        
        return barbarian;
    }
    
    static Player createAssassin(){
        //Create the assassin character
        Sword swordA = new Sword(50, 6);
        LeatherArmor leatherArmor = new LeatherArmor(40, 1);
        ShortBow shortBow = new ShortBow(40, 5, 20, 20);
        DarkDaggerSpell dds = new DarkDaggerSpell();
        PoisonFogSpell pfs = new PoisonFogSpell();
        Player assassin = new Player("Assassin", 40, 18, 95, swordA, shortBow, leatherArmor, 2, 40);
        assassin.addSpell(dds);
        assassin.addSpell(pfs);
        
        return assassin;
    }
    
    static Creature ChooseEnemy(int choice){
        switch(choice){
            case 1:
                System.out.println("Slime chosen.");
                return createSlime();
            case 2:
                System.out.println("Skeleton chosen.");
                return createSkeleton();
            default:
                System.out.println("No enemy chosen. Slime assigned.");
                return createSlime();
        }
    }
    
    static Creature createSlime(){
        //Create the enemy slime
        Slime slime = new Slime(30, Elemental.FIRE, StatusEffect.BURNT);
        
        return slime;
    }
    
    static Creature createSkeleton(){
        //Create the enemy skeleton
        Mace mace = new Mace(40, 7);
        Skeleton skeleton = new Skeleton(50, mace);
        
        return skeleton;
    }
    
}
