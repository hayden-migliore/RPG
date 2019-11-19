
package CombatData;

import EffectData.StatusEffect;

public class Combiner {
    
    public double check(StatusEffect current, StatusEffect future){
        switch(current){
            case NONE:
                return checkNone(future);
            case POISONED:
                return checkPoisoned(future);
            case FROSTBITTEN:
                return checkFrostbitten(future);
            case WET:
                return checkWet(future);
            case CONFUSED:
                return checkConfused(future);
            case BURNT:
                return checkBurnt(future);
            case BRUISED:
                return checkBruised(future);
            case CUT:
                return checkCut(future);
            case SHOCKED:
                return checkShocked(future);
            case CRUSHED:
                return checkCrushed(future);
            case DEAD:
                return checkDead(future);
            default:
                return 1;
        }
    }
    
    private double checkBruised(StatusEffect future){
        if (future == StatusEffect.FROSTBITTEN){
            System.out.println("The bruises stopped swelling.");
            return 0.5;
        }
        return 1;
    }
    
    private double checkBurnt(StatusEffect future){
        if (future == StatusEffect.WET){
            System.out.println("The burns were soothed");
            return 0.5;
        }
        if (future == StatusEffect.FROSTBITTEN){
            System.out.println("The extreme change in temperature hurts.");
            return 2;
        }
        return 1;
    }
    
    private double checkCrushed(StatusEffect future){
        return 1;
    }
        
    private double checkConfused(StatusEffect future){
        if (future == StatusEffect.CONFUSED){
            System.out.println("The target is confused even more.");
            return 2;
        }
        return 1;
    }
    
    private double checkCut(StatusEffect future){
        if (future == StatusEffect.POISONED){
            System.out.println("The poison enters through the cuts.");
            return 2;
        }
        if (future == StatusEffect.BURNT){
            System.out.println("The wounds were cauterized.");
            return 0.5;
        }
        return 1;
    }
    
    private double checkDead(StatusEffect future){
        return 1;
    }
    
    private double checkFrostbitten(StatusEffect future){
        if (future == StatusEffect.BURNT){
            System.out.println("The extreme change in temperature hurts.");
            return 2;
        }
        if (future == StatusEffect.CRUSHED){
            System.out.println("The ice was crushed.");
            return 2;
        }
        return 1;
    }
    
    private double checkNone(StatusEffect future){
        return 1;
    }
    
    private double checkPoisoned(StatusEffect future){
        if (future == StatusEffect.WET){
            System.out.println("The poison washed off.");
            return 0.5;
        }
        if (future == StatusEffect.POISONED){
            System.out.println("The poison grows stronger.");
            return 2;
        }
        return 1;
    }
    
    private double checkShocked(StatusEffect future){
        if (future == StatusEffect.WET){
            System.out.println("The electricity courses through the water.");
            return 2;
        }
        return 1;
    }
    
    private double checkWet(StatusEffect future){
        if (future == StatusEffect.SHOCKED){
            System.out.println("The electricity courses through the water.");
            return 2;
        }
        if (future == StatusEffect.FROSTBITTEN){
            System.out.println("The water freezes.");
            return 2;
        }
        if (future == StatusEffect.BURNT){
            System.out.println("The fire goes out against the wet target.");
            return 0.5;
        }
        return 1;
    }
}
